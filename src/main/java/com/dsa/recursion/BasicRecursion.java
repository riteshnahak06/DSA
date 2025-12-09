package src.main.java.com.dsa.recursion;

public class BasicRecursion {
    public static void main(String[] args) {
        printInDescOrder(5);
        printInAscOrder(5);
        System.out.println(sumTillNaturalNumber(5));
        System.out.println(sumTillNaturalNumber2(5));
        System.out.println(sumTillNaturalNumber2(5));
        System.out.println(factorial(5));
        System.out.println(power(3,3));


    }

    private static int power(int a ,int b){
        if (b==0) return 1;
        return a* power(a,b-1);
    }

    private static int factorial(int n) {
        if (n==0) return 1;
        return n * factorial(n-1);
    }

    private static int sumTillNaturalNumber2(int i) {
        if (i==0) return 0;
        return i+sumTillNaturalNumber2(i-1);
    }
    private static int sumTillNaturalNumber(int i) {
        if (i==1) return 1;
        int l=i;
        int r=sumTillNaturalNumber(i-1);
        int sum=l+r;
        return sum;
     }

    private static void printInAscOrder(int i) {
        if (i>0){
            printInAscOrder(i-1);
            System.out.print(i + " ");
        }
    }
    private static void printInDescOrder(int i) {
        if (i>0){
            System.out.print(i + " ");
            printInDescOrder(i-1);
        }
    }
}
