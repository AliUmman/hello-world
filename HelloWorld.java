public class HelloWorld {
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        
        int maxNum = 100;
        for(int i = 0; i < maxNum; i++)
          System.out.println( i + "! is " + factorial(i)); 
    }
    
    public int factorial(int n) {
      int result = 1;
      for(int i = 2; i <= n; i++)
        result *= i; 
      return result;
    }
}