
public class Solution {

	public static boolean isPalindrome(String str) {
int n = str.length();
int i = 0;
int j = n-1;
while(i != j && i < j){
	if (str.charAt(i) != str.charAt(j)){
		return false;
	}
	else {
		i++;
		j--;
	}
}
return true;
	}
}