package src.main.java.com.dsa.arrays.aug;

public class P05Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    private static int fibonacci(int n) {
        if (n<=1){
            return n;
        }
        int a=0;
        int b=1;
        for (int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    private static int nThFibonacci(int n){
        int [] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];

    }
}
