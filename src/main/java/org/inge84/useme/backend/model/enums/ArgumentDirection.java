package org.inge84.useme.backend.model.enums;

public enum ArgumentDirection {
    IN("in"), 
    
    OUT("out");

		private String direction;

		private ArgumentDirection(String direction) {
			this.direction = direction;
		}

		public String toString() {
			return direction;
		}
}
