package com.hemanth.AllinOneProgram.service;

import com.hemanth.AllinOneProgram.dto.AuditDto;
import com.hemanth.AllinOneProgram.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;

import javax.swing.text.html.Option;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String>
{



   AuditConfig auditConfig;
    @Override
    public Optional<String> getCurrentAuditor()
    {
       return Optional.of("Hemanth");

    }
}
