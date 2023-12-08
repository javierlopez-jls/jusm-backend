package org.inge84.useme.backend.model.enums;

public enum ArgumentType {
    INT("int"), 
    FLOAT("float"), 
    DOUBLE("double"), 
    BYTE("byte"), 
    ARRAY_INT("int[]"), 
    ARRAY_FLOAT("float[]"), 
    ARRAY_DOUBLE("double[]"), 
    ARRAY_BYTE("byte[]");

    private String type;

		private ArgumentType(String type) {
			this.type = type;
		}

		public String toString() {
			return type;
		}
}
