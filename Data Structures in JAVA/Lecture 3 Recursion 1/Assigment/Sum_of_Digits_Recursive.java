
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
		if(input <= 0){
		return 0;
		}
		int ans = input % 10;
		return ans + sumOfDigits(input/10);

	}
}
