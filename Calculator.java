public class Calculator {
	
	public int result;
	
	public void plus(int num1, int num2){
		result = num1 + num2;
	}
	
	public void minus(int num1, int num2){
		result = num1 - num2;
	}
	
	public void div(int num1, int num2){
		result = num1 / num2;
	}
	
	public void multiply(int num1, int num2){
		result = num1 * num2;
	}
	
	public void clearResult(){
		this.result = 0;
	}
	
	public int getResult(){
		return result;
	}
	
}