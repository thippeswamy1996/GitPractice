public class Print1ToNWithoutLoop {
    public static void main(String[] args) {
        int a = 13;
        print1toN(a);
    }

    static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n - 1);  // Recursive call first to print in ascending order
        System.out.print(n + " ");
    }
}
