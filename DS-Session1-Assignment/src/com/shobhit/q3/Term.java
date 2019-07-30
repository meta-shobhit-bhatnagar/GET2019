package com.shobhit.q3;

import java.util.*;

public class Term {
	int coefficient;
	List<Variable> variableList= new ArrayList<>();
	
	public Term(int coeff, List<Variable> varList){
		this.coefficient= coeff;
		this.variableList= varList;
	}
}
