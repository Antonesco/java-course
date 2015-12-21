public class InteractRunner {
	
	public String exit = "No";
	public String clearResult = "No";
	public String first;
	public String second;
	public String operation;
	public double num1;
	public double num2;
	
	Scanner scan = new Scanner(System.in);
	Calculator calculator = new Calculator();
	
	//input method
	public void inputNumbers(){
		while(true){
			if(!calculator.isSave()){
				System.out.println("Enter the first number: ");
				num1 = scan.nextDouble();
				System.out.println("Enter the second number: ");
				num2 = scan.nextDouble();
				System.out.println("Result: " + calculator.calculator());
			}}}
	
	//result method
	public void result(){
		clearResult = scan.next();
		if(clearResult.equals("No"))
			calculator.clearResult();
	}
	
	//exit method
	public void exit(){
		if(scan.next().equals("yes")){
			System.out.println("See you");
		}else if(!scan.nextLine().equals("nо")){
			calculator.getResult();
		}
	}
	
}