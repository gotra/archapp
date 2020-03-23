package com.github.grajeev.archapp.adapter.in.web;

import com.github.grajeev.archapp.app.port.in.CreateDraftCommand;
import com.github.grajeev.archapp.app.port.in.CreateDraftUseCase;
import com.github.grajeev.archapp.common.WebAdapter;
import com.github.grajeev.archapp.domain.Communication;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class CreateDraftController {


    private final  CreateDraftUseCase service;

    @PostMapping(consumes = "application/json")
    public Long createDraft(@RequestBody Communication communication) {
        CreateDraftCommand command =  new CreateDraftCommand(communication);
        return service.createDraft(command);
    }

}
