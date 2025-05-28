import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MovetoEndallZeros {
    public static void main(String[] args) {
        int [] arr = {2,1,2,3,0,9,8,6,50,0,8};
        int[] res = moveZeros(arr);
        System.out.println(Arrays.toString(res));
    }
	static int [] moveZeros(int arr []){
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				arr[count++]=arr[i];
			}
			
			
		}
		while(count<arr.length){
				arr[count++]=0;
			}
		return arr;
	}
}