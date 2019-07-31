package com.shobhit.q3;

import java.util.*;

/**
 * The class represents a single term in multivariable polynomial with integer as its coefficient and Variable type list as its variables 
 * @author Shobhit
 * Dated 07/30/2019
 */
public class Term {
	int coefficient;
	List<Variable> variableList= new ArrayList<>();
	
	/**
	 * Constructor to initialize the data members of the class
	 * @param termCoefficient is the term's coefficient
	 * @param variableList is list of variables in the term
	 */
	public Term(int coeff, List<Variable> varList){
		this.coefficient= coeff;
		this.variableList= varList;
	}
}
