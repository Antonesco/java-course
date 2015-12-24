package javaKurs;

//class for additional options

public class AddFunction implements CloseOpen{
	
	public double res = 0;
	public boolean save = true;
	
	//очистка результата
	public void clearResult(){
		this.res = 0;
	}
	//сохранение результата
	public boolean save(){
		return save;
	}
	
	//метод получения результата
	@Override
	public double getResult() {
		return res;
	}
	//метод возведения в степень
	@Override
	public double pow() {
		double num1 = 0;
		double num2 = 0;
		res = Math.pow(num1, num2);
		return res;
	}
	
}