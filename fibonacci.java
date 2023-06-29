// Fibonacci

public class fibonacci {
    public static int fib(int n){

if(n==0 || n==1){ 
 return n;
}
  int fb1 = fib(n-1);
  int fb2 = fib(n-2);
  int fb = fb1 + fb2;
  return fb;
 
    }

    public static void main(String args[]){
        int n=25;
        System.out.println(fib(1));
         System.out.println(fib(2));
          System.out.println(fib(3));
           System.out.println(fib(4));
            System.out.println(fib(5));
             System.out.println(fib(6));
    }
}