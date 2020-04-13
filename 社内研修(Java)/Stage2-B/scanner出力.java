import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("入力された値:" );
    String text =scanner.next();
    
    System.out.println("入力された値は" + text + "です");
    
    int number = text.length();
    System.out.println(number);
    
     System.out.println(text.charAt(0));
     System.out.println(text.charAt(8));
    
  }
  }