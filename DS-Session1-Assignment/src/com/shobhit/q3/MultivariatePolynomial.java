package com.shobhit.q3;

import java.util.*;

public class MultivariatePolynomial {
	
	
	public List<Term> polynomialTerms= new ArrayList<>();
	
	public MultivariatePolynomial(List<Term> terms){
		this.polynomialTerms= terms;
	}
	
	public int calculatePolynomialDegree()
	{
		int variablePowerSum;
		int degreeOfPolynomial = 0;
		for(Term term : polynomialTerms)
		{
			variablePowerSum = 0;
			for(Variable variable : term.variableList)
			{
				variablePowerSum += variable.getPower();
			}
			if(degreeOfPolynomial < variablePowerSum)
				degreeOfPolynomial = variablePowerSum;
		}
		return degreeOfPolynomial;
	}
	
	
	public String toString(){
		
		String polynomial= new String("");
		for(Term term: polynomialTerms){
			polynomial+= term.coefficient;
			for(Variable variable: term.variableList){
				polynomial = polynomial + "*" + variable.getVariable() + "^" + variable.getPower();
			}
			if(term != polynomialTerms.get(polynomialTerms.size() - 1))
				polynomial = polynomial + " + ";
		}
		
		return polynomial;
	}

	
	
}
