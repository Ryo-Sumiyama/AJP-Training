import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("入力された値:" );
    String text =scanner.next();
    
    
    
    int number = text.length();
    
    int cut_length = 1;
    
     System.out.println("入力された値は{" + text + "}です");
     System.out.println("桁数:{" + number + "}桁");
     System.out.println("頭文字:{" + text.charAt(0) + "}");
     System.out.println("語尾:{" +  text.substring(number - cut_length) + "}");
    
   }
  }