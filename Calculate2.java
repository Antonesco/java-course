public class Calculate {
	public static void main (String[] args){

		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		System.out.println (sum);

		int second = Integer.valueOf(arg[2]);
		int third = Integer.valueOf(arg[3]);
		int sum2 = second - third;
		System.out.println (sum2);

		int fourth = Integer.valueOf(arg[4]);
		int fifth = Integer.valueOf(arg[5]);
		int min = fourth - fifth;
		System.out.println (min);

		double num1 = Double.valueOf(arg[4]);
		double num2 = Double.valueOf(arg[5]);
		double pow = Math.pow(num1, num2);
		System.out.println (pow);
	}
}