package org.inge84.useme.backend.model.records.ports;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public record PortTemplate(long id, long projectId, String name, List<Operation> operations) {
    
    public PortTemplate {
        Objects.requireNonNull(operations);
    }

    @Override
    public List<Operation> operations() {
        return Collections.unmodifiableList(operations);
    }
}
