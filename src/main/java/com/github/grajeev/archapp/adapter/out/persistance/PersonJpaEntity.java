package com.github.grajeev.archapp.adapter.out.persistance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_person")
public class PersonJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "comm_id")
    private CommunicationJpaEntity communication;

    @Column
    private String name;

    @Column
    private String family_name;

    @Column
    private String email;



}
