public class xmp {
    public static void Tower(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("move disk " + n + " from " + src + " to " + dest);
            return;
        }
        Tower(n-1, src, dest, helper);
        System.out.println("move disk " + n + " from " + src + " to " + dest);
        Tower(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 4;
        Tower(n, "S", "H", "D");
    }
}