public class PowerOfB{
public static void main(String[] args){
	double b=3;
	int e=4;
	double res=(double)power(b,e);
	System.out.println(res);
}

   static double power(double b, int e) {
        // code here
       return Math.pow(b,e);
    }
}