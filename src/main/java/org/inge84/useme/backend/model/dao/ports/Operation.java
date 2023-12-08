package org.inge84.useme.backend.model.dao.ports;

import java.util.List;

import org.inge84.useme.backend.model.enums.OperationType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Operation {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private OperationType type;

    @OneToMany
    private List<Argument> arguments;

}
