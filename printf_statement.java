public class printf_statement{
  public static void main(String args[]){
    int x = 100;
    System.out.printf("the value of x is: %d\n",x);

    float n = 5.2f;
    System.out.printf("The value of n is: %.4f\n",n);

    n = 235475375.47563f;
    System.out.printf("The value of n is: %4.2f",n);
  }
}
