package Functions;
import java.util.*;
public class fiboSeries {
    public static void findFibo(int limit){
        int prev = 0;
        int curr = 1;
        for (int i = 0; i < limit; i++) {
            System.out.print(prev + " ");
            int next = prev + curr;
            prev = curr;
            curr = next;
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int limit = sc.nextInt();
        findFibo(limit);
    }
}