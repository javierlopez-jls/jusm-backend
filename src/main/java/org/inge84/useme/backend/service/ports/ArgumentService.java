package org.inge84.useme.backend.service.ports;

import java.util.List;
import java.util.Objects;

import org.inge84.useme.backend.model.dao.ports.Argument;
import org.inge84.useme.backend.model.dto.ports.ArgumentDTO;
import org.inge84.useme.backend.model.repository.ArgumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import jakarta.transaction.Transactional;

@Service
public class ArgumentService {
    
    private final ArgumentRepository repository;

    @Autowired
    public ArgumentService(final ArgumentRepository repository){
        this.repository = repository;
    }

    public List<ArgumentDTO> getAllArguments(){
        return repository.findAll().stream().map(ArgumentDTO::buildBy).toList();
    }

    public ArgumentDTO getArgumentById(final long id){
        Argument arg = repository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Argument by ID " + id + " Not Found"));
        return ArgumentDTO.buildBy(arg);
        
    }

    @Transactional
    public void createArgument(final ArgumentDTO dto){
        Objects.requireNonNull(dto.getName(), "Argument name is required");
        Objects.requireNonNull(dto.getDirection(), "Arguments directions is required");
        Objects.requireNonNull(dto.getType(), "Arguments type is required");
        
        if(repository.existByName(dto.getName())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Argument " + dto.getName() + " already exists" );
        }

        Argument argument = new Argument();
        argument.setName(dto.getName());
        argument.setDirection(dto.getDirection());
        argument.setType(dto.getType());
        repository.save(argument);
    }


    @Transactional
    public void updateArgument(final ArgumentDTO dto){
        Argument argument = repository.findById(dto.getId())
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Argument by ID " + dto.getId() + " Not Found"));

        Objects.requireNonNull(dto.getName(), "Argument name is required");
        Objects.requireNonNull(dto.getDirection(), "Arguments directions is required");
        Objects.requireNonNull(dto.getType(), "Arguments type is required");
        
        argument.setName(dto.getName());
        argument.setDirection(dto.getDirection());
        argument.setType(dto.getType());
        repository.save(argument);
    }

    @Transactional
    public void deleteArgumentById(final long id){
        this.repository.deleteById(id);
    }

}
