
public class solution {

	public static int count = 0;
	public static int countZerosRec(int input){
		// Write your code here
		if(input == 0){
			return 1;
		}
		if(input % 10 == 0){
			count ++;
		}
		countZerosRec(input/10);
		return count;
	}
}
