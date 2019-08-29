package com.shobhit.q1;

import java.util.HashMap;

public class ExpressionEvaluate {

	static HashMap<String, Integer> map = new HashMap<>();
	static {

		
		//Arithmetic Operators
		map.put("*", 7);
		map.put("/", 7);
		map.put("+", 6);
		map.put("-", 6);
		//Relational Operators
		map.put(">", 5);
		map.put(">=", 5);
		map.put("<", 5);
		map.put("<=", 5);
		map.put("==", 4);
		map.put("!=", 4);
		
		//Boolean operators
		map.put("&&", 3);
		map.put("||", 2);
		map.put("!", 1);
		
		map.put("(", 0);
	}

	
	/**
	 * Evaluate the Expression
	 * @param expression : string type, the expression you want to evaluate.
	 * @return	string type, the evaluated value of expression.
	 * @throws StackException
	 */
	public String evaluateExpression(String expression) throws StackException {

		String postfix = infixToPostfix(expression);			//converts to postfix expression
		StackArray operands = new StackArray(10);
		int operand1, operand2;
		String[] splittedString = postfix.split(" ");
		for (int i = 0; i < splittedString.length; i++) {
			if (map.containsKey(splittedString[i])) {

				operand1 = Integer.parseInt(operands.top());
				operands.pop();
				operand2 = Integer.parseInt(operands.top());
				operands.pop();
				operands.push(Integer.toString((evaluate(operand2, operand1,
						splittedString[i]))));
			} else {

				operands.push(splittedString[i]);
			}
		}
		return operands.top();
	}
	

	/**
	 * Convert Infix Expression into Postfix Expression.
	 * @param expression a String variable, The Infix expression in a form of string.
	 * @return	returns a String variable, The Postfix expression in a form of string.
	 * @throws StackException 
	 */
	public String infixToPostfix(String expression) throws StackException {

		String[] infixExpresionSplit = expression.split(" ");		// Infix Expression split on the basis of space.
		String postfix = "";

		StackArray s1 = new StackArray(infixExpresionSplit.length);

		for (int index = 0; index < infixExpresionSplit.length; index++) {
			if ("(".equals(infixExpresionSplit[index])) {
				s1.push(infixExpresionSplit[index]);
			} else if (map.containsKey(infixExpresionSplit[index])) {
				while (map.get(s1.top()) > map.get(infixExpresionSplit[index])) {
					postfix += s1.top() + " ";
					s1.pop();
				}
				s1.push(infixExpresionSplit[index]);
			} else if (")".equals(infixExpresionSplit[index])) {
				while (!"(".equals(s1.top())) {
					postfix += s1.top() + " ";
					s1.pop();
				}
				s1.pop();
			} else{
				try 
		        { 
		            // checking valid integer using parseInt() method 
		            Integer.parseInt(infixExpresionSplit[index]); 
		        }  
		        catch (NumberFormatException e)  
		        { 
		            System.out.println(infixExpresionSplit[index] + " is not a valid integer number"); 
		            System.exit(0);
		        } 
				postfix += infixExpresionSplit[index] + " ";
			}
				
				
		}
		while (!s1.isEmpty()) {
			postfix += s1.top();
			s1.pop();
		}
		return postfix;
	}


	/**
	 * Evaluate the Data passed in the method
	 * @param operand1	An integer variable, the first number which we have to evaluate.
	 * @param operand2	An integer variable, the second number which we have to evaluate.
	 * @param operator	A String variable, tell us the operation we have to perform on the two numbers.
	 * @return	returns integer variable, The Answer after the evaluation of two number.
	 */
	int evaluate(int operand1, int operand2, String operator) {

		switch (operator) {
		case "+":
			return operand1 + operand2;

		case "-":
			return operand1 - operand2;

		case "*":
			return operand1 * operand2;

		case "/":
			return operand1 / operand2;

		case ">":
			return (operand1 > operand2 ) ? 1 : 0;

		case "<":
			return (operand1 < operand2 ) ? 1 : 0;

		case ">=":
			return (operand1 >= operand2 ) ? 1 : 0;

		case "<=":
			return (operand1 <= operand2 ) ? 1 : 0;
			
		case "==":
			return (operand1 == operand2 ) ? 1 : 0;
			
		case "&&":
			return (operand1 * operand2>0 )? 1 : 0;
			
		case "!=":
			return (operand1 == operand2 ) ? 1 : 0;
			
		case "||":
			return (operand1 + operand2>0 ) ? 1 : 0;
			
		}
		return 0;
	}



}