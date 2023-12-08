package org.inge84.useme.backend.model.dao.ports;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class PortTemplate {
 
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    private List<Operation> operations;

}
