package org.inge84.useme.backend.model.dto.ports;

import org.inge84.useme.backend.model.dao.ports.Argument;
import org.inge84.useme.backend.model.enums.ArgumentDirection;
import org.inge84.useme.backend.model.enums.ArgumentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ArgumentDTO {

    private final Long id;
    
    private final String name;

    private final ArgumentDirection direction;

    private final ArgumentType type;

    public static ArgumentDTO buildBy(final Argument arg){
        return ArgumentDTO.builder()
            .id(arg.getId())
            .name(arg.getName())
            .direction(arg.getDirection())
            .type(arg.getType()).build();
    }
}
