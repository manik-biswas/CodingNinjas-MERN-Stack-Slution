public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
    
		for(int i=start; i<=end; i+=step){
            int c = (5*(i-32))/9;
            System.out.println(i+" "+c);
        }
	}
}