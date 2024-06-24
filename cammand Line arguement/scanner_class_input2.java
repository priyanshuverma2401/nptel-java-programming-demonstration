import java.util.Scanner;

class circle{
  double r;
  circle(double rad){
    this.r = rad;
  }
  double area(){
    return 3.14*r*r;
  }
}

public class scanner_class_input2 {
  public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      System.out.println("Enter the radious of the circle: ");
      double radious = scr.nextDouble();
      circle c1 = new circle(radious);
      System.out.flush();
      System.out.printf("the area of circle having radious %f is: %f",radious, c1.area());

  }}
