import java.util.Scanner;

public class scanner_class_input {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int first_number = sc.nextInt();

    System.out.println();
    System.out.print("Enter the second number: ");
    int second_number = sc.nextInt();
    System.out.println();

    System.out.printf("the sum of %d and %d is: %d ",first_number, second_number,(first_number + second_number));
  }
}
