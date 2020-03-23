package com.github.grajeev.archapp.adapter.out.persistance;

import com.github.grajeev.archapp.app.port.out.CreateDraftPort;
import com.github.grajeev.archapp.common.PersistenceAdapter;
import com.github.grajeev.archapp.domain.Communication;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class CommunicationPersistenceAdapter implements CreateDraftPort {

    private final CommunicationRepository communicationRepository;
    private final CommunicationMapper mapper;
    private final PersonRepository personRepository;


    @Override
    public Long createDraft(Communication communication) {

        CommunicationJpaEntity communicationJpaEntity =
                mapper.mapToJpaEntity(communication);

        PersonJpaEntity personJpaEntity =
                mapper.mapToJpaEntity(communication.getPerson(),
                        communicationJpaEntity);


        communicationJpaEntity = communicationRepository.save(communicationJpaEntity);
        personRepository.save(personJpaEntity);

        return  communicationJpaEntity.getId();


    }
}
