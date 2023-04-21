package com.hemanth.AllinOneProgram.repository;

import com.hemanth.AllinOneProgram.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer>
{

}
