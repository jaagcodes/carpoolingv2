package com.pragma.carpooling.infrastructure.configuration;

import com.pragma.carpooling.domain.api.IBarrioServicePort;
import com.pragma.carpooling.domain.api.IRutaBarrioServicePort;
import com.pragma.carpooling.domain.api.IRutaServicePort;
import com.pragma.carpooling.domain.api.IUsuarioServicePort;
import com.pragma.carpooling.domain.api.IViajeServicePort;
import com.pragma.carpooling.domain.spi.IBarrioPersistencePort;
import com.pragma.carpooling.domain.spi.IRutaBarrioPersistencePort;
import com.pragma.carpooling.domain.spi.IRutaPersistencePort;
import com.pragma.carpooling.domain.spi.IUsuarioPersistencePort;
import com.pragma.carpooling.domain.spi.IViajePersistencePort;
import com.pragma.carpooling.domain.usecase.BarrioUseCase;
import com.pragma.carpooling.domain.usecase.RutaBarrioUseCase;
import com.pragma.carpooling.domain.usecase.RutaUseCase;
import com.pragma.carpooling.domain.usecase.UsuarioUseCase;
import com.pragma.carpooling.domain.usecase.ViajeUseCase;
import com.pragma.carpooling.infrastructure.out.jpa.adapter.BarrioJpaAdapter;
import com.pragma.carpooling.infrastructure.out.jpa.adapter.RutaBarrioJpaAdapter;
import com.pragma.carpooling.infrastructure.out.jpa.adapter.RutaJpaAdapter;
import com.pragma.carpooling.infrastructure.out.jpa.adapter.UsuarioJpaAdapter;
import com.pragma.carpooling.infrastructure.out.jpa.adapter.ViajeJpaAdapter;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.BarrioEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.RutaBarrioEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.RutaEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.UsuarioEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.ViajeEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IBarrioRepository;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IRutaBarrioRepository;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IRutaRepository;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IUsuarioRepository;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IViajeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IUsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper usuarioEntityMapper;
    private final RutaEntityMapper rutaEntityMapper;
    private final IRutaRepository rutaRepository;
    private final BarrioEntityMapper barrioEntityMapper;
    private final IBarrioRepository barrioRepository;
    private final IRutaBarrioRepository rutaBarrioRepository;
    private final RutaBarrioEntityMapper rutaBarrioEntityMapper;
    private final IViajeRepository viajeRepository;
    private final ViajeEntityMapper viajeEntityMapper;

    @Bean
    public IUsuarioPersistencePort usuarioPersistencePort(){
        return new UsuarioJpaAdapter(usuarioRepository, usuarioEntityMapper);
    }

    @Bean
    public IUsuarioServicePort usuarioServicePort(){
        return new UsuarioUseCase(usuarioPersistencePort());
    }

    @Bean
    public IRutaPersistencePort rutaPersistencePort(){
        return new RutaJpaAdapter(rutaRepository, rutaEntityMapper);
    }

    @Bean
    public IRutaBarrioPersistencePort rutaBarrioPersistencePort(){return new RutaBarrioJpaAdapter(rutaBarrioRepository, rutaBarrioEntityMapper);
    }

    @Bean
    public IRutaBarrioServicePort rutaBarrioServicePort(){
        return new RutaBarrioUseCase(rutaBarrioPersistencePort());
    }

    @Bean
    public IViajePersistencePort viajePersistencePort(){
        return new ViajeJpaAdapter( viajeEntityMapper, viajeRepository);
    }

    @Bean
    public IViajeServicePort viajeServicePort(){
        return new ViajeUseCase(viajePersistencePort());
    }


    @Bean
    public IRutaServicePort rutaServicePort(){
        return new RutaUseCase(rutaPersistencePort());
    }

    @Bean
    public IBarrioPersistencePort barrioPersistencePort(){
        return new BarrioJpaAdapter(barrioRepository, barrioEntityMapper);
    }

    @Bean
    public IBarrioServicePort barrioServicePort(){
        return new BarrioUseCase(barrioPersistencePort());
    }
}
