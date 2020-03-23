package com.github.grajeev.archapp.adapter.out.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonJpaEntity,Long> {
}
