package org.inge84.useme.backend.model.dao.ports;

import org.inge84.useme.backend.model.enums.ArgumentDirection;
import org.inge84.useme.backend.model.enums.ArgumentType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Argument {
 
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private ArgumentDirection direction;

    private ArgumentType type;
}
