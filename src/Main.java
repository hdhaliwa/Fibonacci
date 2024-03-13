public class Main {
    public static void main(String[] args) {
        int N = 10;

        Fibonacci(N);
    }

    private static void Fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;

        for(int i = 0; i<=n;i++) {
            System.out.print(n1 + " ");
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}

//added branch2
//123
