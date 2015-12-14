public class InteractRunner {
	
	public String exit = "No";
	public String clearResult = "No";
	public String first;
	public String second;
	public String operation;
	public int num1;
	public int num2;
	
	Scanner scan = new Scanner(System.in);
	Calculator calc = new Calculator();
	
	public void inputNumbers(){
		while(!exit.equals("Yes")){
			if (clearResult.equals("Yes")){
				num1 = calc.getResult();
			}else{
				System.out.println("Input first argument: ");
				first = scan.nextLine();
				num1 = Integer.valueOf(first);
				System.out.println("Input second argument: ");
				second = scan.nextLine();
			    num2 = Integer.valueOf(second);
			}
		}
	}
	
	public void chooseOperations(){
		switch(operation){
		case "+":
			calc.plus(num1, num2);
		    break;
		case "-":
			calc.minus(num1, num2);
			break;
		case ":":
			calc.div(num1, num2);
			break;
		case "*":
			calc.multiply(num1, num2);
			break;
		}
		System.out.println(calc.getResult());
	}
	
	public void result(){
		clearResult = scan.next();
		if(clearResult.equals("No"))
			calc.clearResult();
	}
	
	public void exit(){
		System.out.println("Exit: Yes or No");
		exit = scan.next();
	}
	
}