package com.github.grajeev.archapp.app.port.in;

import com.github.grajeev.archapp.common.SelfValidating;
import com.github.grajeev.archapp.domain.Communication;
import lombok.Getter;

@Getter
public class CreateDraftCommand extends SelfValidating<CreateDraftCommand> {


    private final Communication communication;


    public CreateDraftCommand(Communication communication) {
        this.communication = communication;
        this.communication.setStatus("DRAFT"); // here we ensure that the sate is correctly set
        validateSelf();
    }
}
