package com.github.grajeev.archapp.adapter.out.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

interface CommunicationRepository extends JpaRepository<CommunicationJpaEntity,Long> {
}
