
import java.io.*;

class BinarySearch {
	public static int searchInsertPosition(int arr[],int k){
	    int n = arr.length;
	    int low=0 , high=n-1;
	    int ans=-1;
	    while(low<=high){
	        int mid = low+(high-low)/2;
	        if(arr[mid]>=k){
	            high=mid-1;
	            ans=mid;
	        }
	        else{
	            low=mid+1;
	        }
	    }
	    return ans;
	}
}