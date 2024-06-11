// PRINT nos such that their square < 100 starting from n
public class Recursion3 {
    public static void maxSquare(int n) {
        if(n > 100){
            return;
        }
        System.out.println(n);
        maxSquare(n*n);
    }
    public static void main(String[] args) {
        int n = 2;
        maxSquare(n);
    }
}
