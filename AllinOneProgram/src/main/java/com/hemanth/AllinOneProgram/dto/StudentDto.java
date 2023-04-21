package com.hemanth.AllinOneProgram.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedBy;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto
{
    @Id
    int  usn;

    @NotNull

    String name;

    @NotNull
    @NotBlank
    String branch;

    @NotNull
    @NotBlank
    String email;

    private Date createdDate;

    private Date lastModifiedDate;

    private String createdBy;


    private String modifiedBy;
}
