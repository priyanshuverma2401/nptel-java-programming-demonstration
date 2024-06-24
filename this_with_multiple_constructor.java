class box{
  double height;
  double width;
  double depth;

  box(double height, double width, double depth){
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  box(box b){
    this(b.height, b.width, b.depth);
  }

  box(){
    this(1,1,1);
  }

  double area(){
    return (width*height + height*depth + depth*width);
  }

  void printInfo(){
    System.out.println("height: "+ this.height);
    System.out.println("width: "+this.width);
    System.out.println("depth: "+this.depth);
  }
}

public class this_with_multiple_constructor {
  public static void main(String args[]){
    box b1 = new box(4,5,6);
    System.out.println("The area of the given box is:" + b1.area());

    box b2 = new box(b1);
    b2.printInfo();
    System.out.println("the area of b2 is: "+ b2.area());

    box b3 = new box();
    b3.printInfo();
    System.out.println("the area of b3 is:" + b3.area());

  }
}
