package org.inge84.useme.backend.model.records.ports;

import org.inge84.useme.backend.model.enums.ArgumentDirection;
import org.inge84.useme.backend.model.enums.ArgumentType;

/**
 * Record Argument
 * 
 * Argument of an Operation, int a project defined by name, direction and type  
 */
public record Argument(long id, long projectId, String name, ArgumentDirection direction, ArgumentType type) {

}
