package com.shobhit.q3;

/**
 * This class represents a single variable along with its power in a multivariable polynomial
 * @author Shobhit
 * Dated 07/30/2019
 */
public class Variable {
	int power;
	char variable;
	
	public Variable(char var, int pow){
		this.variable= var;
		this.power= pow;
	}
	/**
	 * This method returns the power of the variable
	 * @return {int} power of the variable
	 */
	public int getPower() {
		return power;
	}

	/**
	 * This method returns the char value of the variable
	 * @return {char} name of the variable
	 */
	public char getVariable() {
		return variable;
	}

	
}
