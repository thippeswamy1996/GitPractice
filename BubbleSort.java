import java.util.*;
public class BubbleSort{
public static void main(String [] args){
	int arr[] ={3,2,1,3,4,0,7,8,6,9};
	sort(arr);
	System.out.println(Arrays.toString(arr));
	
}
static void sort(int arr []){
	  int n =arr.length;
	  boolean swaped;
	  for(int i=0;i<n-1;i++){
		  swaped=false;
		  for(int j=0;j<n-i-1;j++){
			  if(arr[j]>arr[j+1]){
				  int temp = arr[j];
				   arr[j]=arr[j+1];
				  arr[j+1]=temp;
				  
				  swaped=true;
			  }
		  }
		  if(swaped==false)
			  break;
	  }
}
}