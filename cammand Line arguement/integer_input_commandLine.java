import java.util.ArrayList;

public class integer_input_commandLine {
  public static void main(String [] args){
    ArrayList<Integer> list = new ArrayList<>();
    if(args.length > 0){
      for(String val : args){
        list.add(Integer.parseInt(val));
      }
    }else{
      System.out.println("No commandLine arguement has been passed");
    }
    System.out.println(list);
  }
}
