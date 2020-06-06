package com.codingdojo.projectone;
import java.util.ArrayList;

public class Calculator implements java.io.Serializable {
	// member variables set private, accessible using get/set
	// zero argument constructor (add override with param)
	// implement serializable interface
	
	private double OperandOne;
	private String Operation;
	private double OperandTwo;
	private ArrayList<Object> allOperations = new ArrayList<Object>();
	
	public Calculator() {
		
	}
	
	public double performOperation() {
		if (this.Operation == "+") {
			return this.OperandOne + this.OperandTwo;
		} else if (this.Operation == "-") {
			return this.OperandOne - this.OperandTwo;
			
		}
		return 0.0;
	}
	
	public double performOperation2() {
		ArrayList<Object> newlist = new ArrayList<Object>();
		for (int i=0;i<allOperations.size()-1;i++) {
			if (allOperations.get(i) == "*") {
				double temp = (double) newlist.get(newlist.size()-1) * (double) allOperations.get(i+1);
				newlist.set(newlist.size()-1, temp);
				i+=1;
				
			} else if (allOperations.get(i) == "/") {
				double temp = (double) newlist.get(newlist.size()-1) / (double) allOperations.get(i+1);
				newlist.set(newlist.size()-1, temp);
				i+=1;
				
			} else {
				newlist.add(allOperations.get(i));
			}
			System.out.println(newlist);
		}
		double total = (double) newlist.get(0);
		for (int j = 1; j<newlist.size()-1;j++) {
			if (newlist.get(j)=="+") {
				total+= (double) newlist.get(j+1);
			} else if (newlist.get(j) =="-") {
				total-= (double) newlist.get(j+1);
			}
		}
		return total;
	}
	
	public void getResults() {
		System.out.println(performOperation());
	}

	public double getOperandOne() {
		return OperandOne;
	}

	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}

	public String getOperation() {
		return Operation;
	}

	public void setOperation(String operation) {
		Operation = operation;
	}

	public double getOperandTwo() {
		return OperandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}

	public ArrayList<Object> getAllOperations() {
		return allOperations;
	}

	public void setAllOperations(Object n) {
		
		this.allOperations.add(n);
	}

	
	
}
