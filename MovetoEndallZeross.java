import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MovetoEndallZeross {
    public static void main(String[] args) {
        int [] arr = {2,1,2,3,0,9,8,6,50,0,8};
		moveZeros(arr);
		System.out.println(Arrays.toString(arr));  
    }
	static void moveZeros(int arr []){
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
	}
}