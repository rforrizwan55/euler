
public class Euler {

	public static void main(String[] args) {
		int sumOfnNum=0,sumOfsNum=0;
		
		for (int i = 1; i <= 100; i++) {
			sumOfnNum = sumOfnNum +i;
			sumOfsNum = sumOfsNum + i*i;
		}
		sumOfnNum = sumOfnNum*sumOfnNum;
		System.out.println("Diff is "+(sumOfnNum - sumOfsNum));
	}

}
