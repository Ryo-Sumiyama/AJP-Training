public class Main {
   //メンバ変数piを宣言
  static double pi =3.14;
  public static void main(String[] args) {
    
		 double result = area(5.5, pi);
		 System.out.println(result);
	}
 //privateメソッドareaを作成
	private static double area(double radius, double pi) {
		  double mul = radius * radius * pi;
	  	return mul;
	}
 
}