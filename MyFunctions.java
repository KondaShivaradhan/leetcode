public class MyFunctions {

  public void printHorizontal(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(", "); // Add a comma and space if not the last element
      }
    }
    System.out.println(); // Move to the next line after printing the array
  }

  public void printHorizontalc(char[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(", "); // Add a comma and space if not the last element
      }
    }
    System.out.println(); // Move to the next line after printing the array
  }
}
