package com.hemanth.AllinOneProgram.service;

import com.hemanth.AllinOneProgram.controller.StudentController;
import com.hemanth.AllinOneProgram.dto.AuditDto;
import com.hemanth.AllinOneProgram.dto.StudentDto;
import com.hemanth.AllinOneProgram.exception.StudentIdNotFoundException;
import com.hemanth.AllinOneProgram.exception.StudentNameNotFoundException;
import com.hemanth.AllinOneProgram.mapper.MapperClass;
import com.hemanth.AllinOneProgram.model.Student;
import com.hemanth.AllinOneProgram.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService
{
    @Autowired
    StudentRepository sr;

    @Autowired
    MapperClass mapperClass;

    Logger logger = LoggerFactory.getLogger(StudentController.class);
    public List<StudentDto> getAllStudents()
    {

     List<Student> result=sr.findAll();

     List<StudentDto> newResult=new ArrayList<>();

     for(Student i:result)
     {
         StudentDto studentDto=mapperClass.studentToDtoConversion(i);
         newResult.add(studentDto);
     }

     return newResult;


    }




    public Student addStudents(AuditDto adto)
    {

        return sr.save(adto.getStudent());



//        String names=s1.getName();
//        if(names.isEmpty())
//            throw new StudentNameNotFoundException("Name is Not Found");
//
//        Student sdata=new Student(s1.getUsn(), s1.getName(), s1.getBranch(), s1.getEmail());
//
//        sr.save(sdata);
//
//        return s1;


//        String currentUser=request.getLoggedInUser();
//        request.setTimeZone(Calendar.getInstance().getTimeZone().getDisplayName());
//        Student students=request.getStudent();
//        students.setCreatedBy(currentUser);

       // String name=adto.getLoggedInUser();

       // s.setCreatedBy(name);



        //return "Student Successfully Added to the Database";

    }


    public void deleteStudents(StudentDto stud)
    {

        logger.info("Inside the delete Service  Method");
        sr.deleteAll();
    }


    public void deleteStudentsId(int id)
    {

        logger.info("Inside the deleteById Service  Method");
       if(id <0)
           throw new StudentIdNotFoundException("Id Enetered is not Proper");
        sr.deleteById(id);

    }


    public String updateStudent(StudentDto st)
    {

        logger.info("Inside the update Service  Method");
        Student s=mapperClass.dtoToStudent(st);
        sr.save(s);
        return "Updated Data ";

    }


    public Optional<Student> getById(int id) throws RuntimeException
    {

        logger.info("Inside the GetById Service  Method");
        if(id <0)
            throw new StudentIdNotFoundException("The id Entered is Invalid");
         Optional<Student> result=sr.findById(id);
        return result;

    }
}
