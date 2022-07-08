class FibonacciTail{
    public static long fib(int n){
        // These are the base cases and are static in the numbers and outputs
        if (n == 0) {
            return 0;
        }
        //This the base cases and are static in the numbers and outputs
        else if( n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }    
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
    
}