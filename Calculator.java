public class Calculator{
	public static void main(String[] args){
           	System.out.println("Welcome to calculator");
			System.out.println(addition(2, 5));
			System.out.println(substraction(2, 5));


	}
	public static double addition(double num1, double num2) {
		return num1 + num2;
	}

	public static double substraction(double num1, double num2) {
		return num1 - num2;
	}
}
