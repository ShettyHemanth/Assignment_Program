package com.hemanth.AllinOneProgram.aspect;

import com.hemanth.AllinOneProgram.controller.StudentController;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass
{
    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Before("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.addStudents(..))")
    public void beforeLogPost()
    {
        logger.info("This is Inside Post Controller Method  ");

    }

    @After("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.addStudents(..))")
    public void afterLogPost()
    {
        logger.info("This is Inside Post Controller Method  ");

    }

    @Before("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.getAllAccounts(..))")
    public void beforeLogGet()
    {
        logger.info("This is Inside  Get Controller Method Begins");
    }

    @After("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.getAllAccounts(..))")
    public void afterLogGet()
    {
        logger.info("This is After Get Controller Method ");
    }




    @Before("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.deleteStudents(..))")
    public void beforeDelete()
    {
        logger.info("This is Inside Delete Controller method");
    }

    @Before("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.updateStudents(..))")
    public void beforeUpdate()
    {
        logger.info("This is Inside Update Controller  method");
    }


    @Before("execution(public * com.hemanth.AllinOneProgram.service.StudentService.getAllStudents(..))")
    public void beforeLogGetService()
    {
        logger.info("This is Inside Get Service Method");
    }

    @After("execution(public * com.hemanth.AllinOneProgram.service.StudentService.getAllStudents(..))")
    public void afterLogGetService()
    {
        logger.info("This is After Get Service Method");
    }

    @Before("execution(public * com.hemanth.AllinOneProgram.service.StudentService.addStudents(..))")
    public void beforeLogPostService()
    {
        logger.info("This is Inside Post Service Method");
    }

    @After("execution(public * com.hemanth.AllinOneProgram.service.StudentService.addStudents(..))")
    public void afterLogPostService()
    {
        logger.info("This is After Post Service Method");
    }

    @Before("execution(public * com.hemanth.AllinOneProgram.controller.MailController.sendMessage(..))")
    public void beforeMailRegistration()
    {
        logger.info("Mail Service Being Ready");
    }


    @After("execution(public * com.hemanth.AllinOneProgram.listener.Listener.sendingMessage(..))")
    public void afterMailRegistration()
    {
        logger.info("Mail Service Completed");
    }



}
