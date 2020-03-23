package com.github.grajeev.archapp.domain;

import lombok.Data;

@Data
public class Person {

    private Long id;

    private String name;

    private String familyName;

    private String email;
}
