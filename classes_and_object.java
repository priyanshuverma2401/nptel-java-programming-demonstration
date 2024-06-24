class circle {
  double x, y;
  double r;

  double circumference() {
    return 2 * 3.14 * r;
  }

  double area() {
    return 3.14 * r * r;
  }
}

class box {
  double height;
  double width;
  double depth;

  double area() {
    return (width * height + height * depth + depth * width);
  }
  double volumn(){
    return (width*height*depth);
  }
}

public class classes_and_object {
  public static void main(String args[]) {
    circle c1 = new circle();
    c1.x = 0;
    c1.y = 0;
    c1.r = 5;
    System.out.println("The area of circle having radious "+ c1.r +" is "+ c1.area());

    System.out.println("The circumference of circle having radious "+ c1.r +" is "+ c1.circumference());

    box b1 = new box();
    b1.height = 5;
    b1.width = 4;
    b1.depth = 3;
    System.out.println("The surface area of box  "+ b1.area());
    System.out.println("The volumn of box is: "+ b1.volumn());
  }
}
