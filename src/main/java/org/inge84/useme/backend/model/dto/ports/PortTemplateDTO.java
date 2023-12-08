package org.inge84.useme.backend.model.dto.ports;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PortTemplateDTO {
 
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    private List<OperationDTO> operations;

}
