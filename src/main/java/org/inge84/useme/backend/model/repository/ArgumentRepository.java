package org.inge84.useme.backend.model.repository;

import org.inge84.useme.backend.model.dao.ports.Argument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArgumentRepository extends JpaRepository<Argument, Long>{

    boolean existByName(String name);
    
}
