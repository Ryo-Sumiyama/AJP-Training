import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
  public static void main(String[] args) {
      //文字列変数fruitsを宣言
      String fruits =  "orange/apple/cherry/orange/grape/apple";
      //配列変数fruits2に変換
      String[] fruits2 = fruits.split("/", 0);
     
      List<String> list = new ArrayList<String>();
     //変数fruits2から重複している値を取得
      for (int i = 0 ; i < 5 ; i++) {
        for(int i2 = 1 ; i2 < fruits2.length; i2++)
        if (fruits2[i].equals(fruits2[i2]) && i != i2 ){
          list.add(fruits2[i]);}
       }
       //重複した値を出力
       
       System.out.println( 1 + ":" +list.get(0));
       System.out.println( 2 + ":" +list.get(1));
    }
}
