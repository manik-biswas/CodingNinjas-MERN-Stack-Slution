
public class Solution {

	public static char highestOccuringChar(String str) {
		char ans = 'a';
      int maxfreq = 0, n = str.length();
      int count[] = new int[256];
      for (int i = 0; i < n; i++) {
         count[str.charAt(i)]++;
         if (count[str.charAt(i)] > maxfreq) {
            maxfreq = count[str.charAt(i)];
            ans = str.charAt(i);
         }
          else if(count [str.charAt(i)]==maxfreq)
              ans = str.charAt(0);
                 
      }
      return ans;
	}

}