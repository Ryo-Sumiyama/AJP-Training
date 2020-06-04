public class Stage3A {
   //メンバ変数piを宣言
  static double pi =3.14;
  public static void main(String[] args) {
    
		 double result = area(5.5);
		 System.out.println(result);
	}
 //privateメソッドareaを作成
	private static double area(double radius) {
		  double mul = radius * radius * pi;
	  	return mul;
	}
 
}