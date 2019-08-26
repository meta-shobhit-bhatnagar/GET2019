package com.shobhit.q1;

import java.util.*;

public class Main {
	public static void main(String[] args) throws StackException{
		
		Scanner sc= new Scanner(System.in);
		String expression= new String();
		
		System.out.println("Enter the infix expression");
		expression= sc.nextLine();
		expression= "( " + expression + " )";
		
		ExpressionEvaluate infixObj= new ExpressionEvaluate();
		
		System.out.println(infixObj.infixToPostfix(expression));
		System.out.println(infixObj.evaluateExpression(expression));
		
		System.out.println("The logical expression(if is?)");	
		System.out.println(infixObj.evaluateForLogical(expression));
	}
}
