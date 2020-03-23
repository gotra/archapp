package com.github.grajeev.archapp.app.service;

import com.github.grajeev.archapp.app.port.in.CreateDraftCommand;
import com.github.grajeev.archapp.app.port.in.CreateDraftUseCase;
import com.github.grajeev.archapp.app.port.out.CreateDraftPort;
import com.github.grajeev.archapp.common.UseCase;
import com.github.grajeev.archapp.domain.Communication;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
public class CreateDraftService implements CreateDraftUseCase {

    private final CreateDraftPort createDraftPort;
    @Override
    public Long createDraft(CreateDraftCommand command) {
        //do some business validations
        Communication communication = command.getCommunication();
        //change state or value of required here
        return createDraftPort.createDraft(communication);




    }
}
