class box {
  double height;
  double width;
  double depth;

  box(double height, double width, double depth) {
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  double surface_area(){
    return (width*height + height*depth + depth*width);
  }
}

public class contructor1 {
  public static void main(String args[]){
    box b1 = new box(3, 4, 5);
    System.out.println("The surface area of given box is:" + b1.surface_area());
  }
}
