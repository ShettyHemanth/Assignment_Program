package com.hemanth.AllinOneProgram.repository;

import com.hemanth.AllinOneProgram.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
