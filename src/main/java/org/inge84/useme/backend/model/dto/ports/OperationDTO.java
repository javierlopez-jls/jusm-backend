package org.inge84.useme.backend.model.dto.ports;

import java.util.List;

import org.inge84.useme.backend.model.enums.OperationType;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class OperationDTO {
 
    private Long id;

    private String name;

    private OperationType type;

    @OneToMany
    private List<ArgumentDTO> arguments;
}
