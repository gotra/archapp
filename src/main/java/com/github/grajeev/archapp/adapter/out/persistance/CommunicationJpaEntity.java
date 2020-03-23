package com.github.grajeev.archapp.adapter.out.persistance;

import com.github.grajeev.archapp.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "t_communication")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunicationJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String status;

    @Column
    private String title;

    @Column
    private Date creation_date;






}
