
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	int n = arr.length;
        int st, end=n-1, mid;
        for(st=0; st<=end;){
            
            mid = (st+end)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(x>arr[mid]){
                 st = mid+1;
            }
            else if (x<arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }

}