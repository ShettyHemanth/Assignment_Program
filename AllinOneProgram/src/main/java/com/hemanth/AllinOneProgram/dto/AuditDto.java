package com.hemanth.AllinOneProgram.dto;

// T to make it generic

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hemanth.AllinOneProgram.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AuditDto
{


//private String loggedInUser;


private Student student;


}
