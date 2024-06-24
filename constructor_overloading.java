class box{
  double height;
  double width;
  double depth;

  box(){ // default constructor
    this.height = this.width = this.depth = 1;
  }
  box(double height, double width, double depth ){ // paramaterized constructor
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  box(box b){ // copy constructor
    this.height = b.height;
    this.width = b.width;
    this.depth = b.depth;
  }

  double area(){
    return (width*height + height*depth + depth*width);
  }
}

public class constructor_overloading {
  public static void main(String args[]){
    box b1 = new box(4,5,6);
    System.out.println("The area of the given box is: "+ b1.area());

    box b2 = new box();
    System.out.println("The area of box 2 is: "+ b2.area());

    box b3 = new box(b1);
    System.out.println("The area of box 3 is: "+b3.area());
    
  }
}
