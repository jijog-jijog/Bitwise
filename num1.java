public class num1 {
    public static void main(String[] args) {
        
        int n =  11;
        bitcount(n);


    }

    static int bitcount(int n){
        
        if (n > 1) {
            bitcount(n/2);
        }

        System.out.print(n%2);
        return 0;
    }
    
}
