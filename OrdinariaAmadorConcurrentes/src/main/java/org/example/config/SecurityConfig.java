package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http
                .csrf(csrf -> csrf.disable()) // Desactiva CSRF
                .authorizeExchange(exchange -> exchange
                        .pathMatchers("/graphql").permitAll() // Permite acceso al endpoint GraphQL
                        .anyExchange().authenticated() // Resto requiere autenticación
                )
                .httpBasic(ServerHttpSecurity.HttpBasicSpec::disable) // Desactiva autenticación básica
                .build();
    }
}
