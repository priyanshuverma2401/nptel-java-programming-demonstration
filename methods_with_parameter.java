class box{
  double height;
  double width;
  double depth;
  double area(double height,double width, double depth){
    this.height = height;
    this.depth = depth;
    this.width = width;
    return (width*height + height*depth + depth*width);
  }
}


public class methods_with_parameter {
  public static void main(String args[]){
    box c1 = new box();
    double area = c1.area(4,5,6);
    System.out.println("The area of the given box is : "+area);

  }
}
