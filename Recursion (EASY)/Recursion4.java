// PRINT SUM OF FIRST n NATURAL NOS

// import java.util.*;
// public class Recursion4 {
//     public static void sumNatural(int n) {
//         if(n == 0){
//             return;
//         }
//         System.out.println(n*(n+1)/2);
//         sumNatural(n);
//     }
//     public static void main(String[] args) {
//         Scanner myobj = new Scanner(System.in);
//         int n = myobj.nextInt();
//         myobj.close();
//         System.out.println("Enter the no. of digits:");
//         sumNatural(n);
//     }
// }


public class Recursion4{
    public static void printSum(int i, int n, int sum) {
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;  
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);  
    }
}