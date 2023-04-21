package com.hemanth.AllinOneProgram.mapper;

import com.hemanth.AllinOneProgram.dto.StudentDto;
import com.hemanth.AllinOneProgram.model.Student;
import org.springframework.stereotype.Component;

@Component
public class MapperClass
{
     public StudentDto studentToDtoConversion(Student student)
     {
         StudentDto studentDto=new StudentDto();

         studentDto.setName(student.getName());
         studentDto.setUsn(student.getUsn());
         studentDto.setBranch(student.getBranch());
         studentDto.setEmail(student.getEmail());
         studentDto.setCreatedBy(student.getCreatedBy());
         studentDto.setModifiedBy(student.getModifiedBy());
         studentDto.setCreatedDate(student.getCreatedDate());
         studentDto.setLastModifiedDate(student.getLastModifiedDate());


         return studentDto;
     }

     public Student dtoToStudent(StudentDto studentDto)
     {
         Student student=new Student();
         student.setName(studentDto.getName());
         student.setBranch(studentDto.getBranch());
         student.setUsn(studentDto.getUsn());
         student.setEmail(studentDto.getEmail());


         return student;

     }
}
