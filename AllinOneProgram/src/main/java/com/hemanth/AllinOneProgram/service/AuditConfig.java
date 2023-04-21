package com.hemanth.AllinOneProgram.service;

import com.hemanth.AllinOneProgram.dto.AuditDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditConfig
{

    @Autowired
    AuditDto auditDto;
    @Bean
    public AuditorAware<String> auditorAware()
    {
        return new AuditorAwareImpl();
    }


}
