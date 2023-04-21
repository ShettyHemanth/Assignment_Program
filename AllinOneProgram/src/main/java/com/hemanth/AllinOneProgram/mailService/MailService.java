package com.hemanth.AllinOneProgram.mailService;


import com.hemanth.AllinOneProgram.model.Registration;
import com.hemanth.AllinOneProgram.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MailService
{
  @Autowired
    JavaMailSender javaMailSender;


  public void sendMessage(String msg)
  {
      SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
      simpleMailMessage.setFrom("shettyhemanth728@gmail.com");
      simpleMailMessage.setTo(msg);
      simpleMailMessage.setSubject("Student Registeration");
      simpleMailMessage.setText("Student Successfully Registered into the University");





      javaMailSender.send(simpleMailMessage);
  }

}
