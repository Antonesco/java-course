package javaKurs;

//class for calcualte numbers

public class Calculator extends AddFunction{
	
	public double add(double num1, double num2){
		res = num1 + num2;
		return res;
	}
	
	public double substract(double num1, double num2){
		res = num1 - num2;
		return res;
	}
	
	public double multiply(double num1, double num2){
		res = num1 * num2;
		return res;
	}
	
	public double div(double num1, double num2){
		res = num1 / num2;
		return res;
	}
	
	
}
