import java.util.Scanner;

class three_dimensional_array {
  /**
   * @param args
   */
  public static void main(String[] args) {
    int row, col, pages;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter total number of pages: ");
    pages = sc.nextInt();
    System.out.println("Enter total number of rows: ");
    row = sc.nextInt();
    System.out.println("Enter total number of column: ");
    col = sc.nextInt();

    int[][][] arr;
    arr = new int[row][col][pages];

    for (int k = 0; k < pages; k++) {
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          arr[i][j][k] = (i * j * k);
        }
      }
    }

    for (int k = 0; k < pages; k++) {
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          System.out.print(arr[i][j][k] + " ");
        }
        System.out.print("\n");
      }
      System.out.println("\n");
    }
  }
}