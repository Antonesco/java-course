public class Calculator {
	
	private int num1;
	public int num2;
	public int result;
	public boolean save;
	public String operation;
	
	public int getNum1(){
		return num1;
	}
	public void setNum1(int num1){
		this.num1 = num1;
	}
	
	public double calculator(){
		switch(operation){
		case "+":
			result = num1 + num2;
		    break;
		case "-":
			result = num1 + num2;
			break;
		case ":":
			result = num1 + num2;
			break;
		case "*":
			result = num1 + num2;
			break;
		}
		return result;
	}
	
	
	public void clearResult(){
		this.result = 0;
	}
	
	public int getResult(){
		return result;
	}
	
	public void setResult(int result){
		this.result = result;
	}
	
	public String getOperation(){
		return operation;
	}
	
	public void setOperation(String operation){
		this.operation = operation;
	}
	
	public boolean isSave(){
		return save;
	}
	
}