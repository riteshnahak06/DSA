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
        System.out.println(sumOfArrayValues(new int[]{2,3,1,3},0));
        System.out.println(sumOfDigit(1234));
        System.out.println(sumOfDigit2(1234));
        System.out.println(isAscSortedArr(new int[]{1,3,2,5},0));
        System.out.println(removeMfromString("amxmcm"));



    }

    private static String removeMfromString(String s) {
        if (s.length()==0) return "";
        String l= s.charAt(0)!='m'? String.valueOf(s.charAt(0)) : "";
        String r=removeMfromString(s.substring(1));
        return l+r;
    }

    private static boolean isAscSortedArr(int[] arr, int i) {
        if (i==arr.length-1) return true;
        boolean l =arr[i]<arr[i+1];
        boolean r= isAscSortedArr(arr,i+1);
        return l && r;
    }

    private static int sumOfDigit(int num) {
        if (num/10==0) return num;
        int l=num%10;
        int r=sumOfDigit(num/10);
        return l+r;
    }
    private static int sumOfDigit2(int num) {
        if (num/10==0) return num;
        return num%10+sumOfDigit2(num/10);
    }

    private static int sumOfArrayValues(int[] ints, int index) {
        if (index==ints.length) return 0;
        int l=ints[index];
        int r=sumOfArrayValues(ints,index+1);
        return l+r;
    }
    private static int sumOfArrayValues2(int[] ints, int index) {
        if (index==ints.length) return 0;
        return ints[index]+sumOfArrayValues2(ints,index+1);
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
