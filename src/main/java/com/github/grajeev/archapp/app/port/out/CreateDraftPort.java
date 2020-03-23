package com.github.grajeev.archapp.app.port.out;

import com.github.grajeev.archapp.domain.Communication;

public interface CreateDraftPort {

    Long createDraft(Communication communication);

}
