package com.github.grajeev.archapp.domain;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
public class Communication {


    @NotNull
    private Long id;


    private  String status;


    private  String title;

    private Person person;


    Date creationDate;


}
