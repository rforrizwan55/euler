
public class Euler {

	public static void main(String[] args) {
		new Euler().evenFibonacci(1, 2, 0);

	}

	void evenFibonacci(int num1,int num2, int sum) {
		int num3 = num1 + num2;
		if (num3 < 4000000) {
			if (num3 % 2 == 0)
				sum += num3;
			evenFibonacci(num2,num3, sum);
		}
		else
			System.out.println("The sum is "+(sum+2));
	}

}
