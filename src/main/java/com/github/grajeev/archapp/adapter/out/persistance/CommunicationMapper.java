package com.github.grajeev.archapp.adapter.out.persistance;

import com.github.grajeev.archapp.domain.Communication;
import com.github.grajeev.archapp.domain.Person;
import org.springframework.stereotype.Component;

@Component
public class CommunicationMapper {
     CommunicationJpaEntity mapToJpaEntity(Communication communication) {
         return  new CommunicationJpaEntity(
                 communication.getId(),
                 communication.getStatus(),
                 communication.getTitle(),
                 communication.getCreationDate()
         );
     }

     PersonJpaEntity mapToJpaEntity(Person person,CommunicationJpaEntity communication) {
         return new PersonJpaEntity(person.getId(),
                 communication,
                 person.getName(),
                 person.getFamilyName(),
                 person.getEmail()
                 );
     }


}
