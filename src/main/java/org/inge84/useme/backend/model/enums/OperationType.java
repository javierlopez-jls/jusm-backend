package org.inge84.useme.backend.model.enums;

public enum OperationType {
    COMMAND_SYNC("CommandSync"),
    
    COMMAND_ASYNC("CommandAsync"), 
    
    EVENT("Event");

		private String name;

		private OperationType(String name) {
			this.name = name;
		}

		public String toString() {
			return name;
		}
}
