public class Print1ToNWithoutLoop {
    public static void main(String[] args) {
        int a = 13;
        System.out.println("Print 1 to N:");
        print1toN(a);
		
        System.out.println("\nPrint N to 1:");
        printNto1(a);
    }

    static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n - 1);  // Recursive call first to print in ascending order
        System.out.print(n + " ");
    }

    static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNto1(n - 1);  // Corrected to descending order
    }
}
