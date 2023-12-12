package org.inge84.useme.backend.model.records.ports;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.inge84.useme.backend.model.enums.OperationType;

public record Operation(long id, long projectId, String name, OperationType type, List<Argument> arguments) {

    public Operation {
        Objects.requireNonNull(arguments);
    }
    
    @Override
    public List<Argument> arguments() {
        return Collections.unmodifiableList(arguments);
    }
}
