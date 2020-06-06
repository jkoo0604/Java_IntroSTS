package com.codingdojo.projectone;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc1 = new Calculator();
		calc1.setOperandOne(10.5);
		calc1.setOperation("+");
		calc1.setOperandTwo(5.2);
		calc1.performOperation();
		calc1.getResults();
		
		Calculator calc2 = new Calculator();
		calc2.setAllOperations(10.5);
		calc2.setAllOperations("+");
		calc2.setAllOperations(5.2);
		calc2.setAllOperations("*");
		calc2.setAllOperations(10.0);
		calc2.setAllOperations("/");
		calc2.setAllOperations(2.0);
		calc2.setAllOperations("-");
		calc2.setAllOperations(13.0);
		calc2.setAllOperations("=");
//		calc2.setAllOperations(10.5);
//		calc2.setAllOperations("+");
//		calc2.setAllOperations(5.2);
//		calc2.setAllOperations("*");
//		calc2.setAllOperations(10.0);
//		calc2.setAllOperations("=");
		System.out.println(calc2.performOperation2());
		
	}

}
