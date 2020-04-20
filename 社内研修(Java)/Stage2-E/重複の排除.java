class Main {
  public static void main(String[] args) {
      //文字列変数fruitsを宣言
      String fruits =  "orange/apple/cherry/orange/grape/apple";
      //配列変数fruits2に変換
      String[] fruits2 = fruits.split("/", 0);
     //変数fruits2から重複している値を取得
      String dup = "";
     
      for (int i = 1 ; i <fruits2.length; i++) {
        if (fruits2[0].equals(fruits2[i])){
          dup = fruits2[0];
        }  
      }
     
      for (int i = 2 ; i <fruits2.length; i++) {
        if (fruits2[1].equals(fruits2[i])){
          dup = dup + "/" + fruits2[1];
        }  
      }
     
      for (int i = 3 ; i <fruits2.length; i++) {
        if (fruits2[2].equals(fruits2[i])){
          dup = dup + "/" + fruits2[2];
        }
      }
     
      for (int i = 4 ; i <fruits2.length; i++) {
        if (fruits2[3].equals(fruits2[i])){
          dup = dup + "/" + fruits2[3];
        }
      }
     
      for (int i = 5 ; i <fruits2.length; i++) {
        if (fruits2[4].equals(fruits2[i])){
          dup = dup + "/" + fruits2[4];
        }
      }
      String[] dup2 = dup.split("/", 0);
     
      for (int i = 0 ; i <dup2.length; i++) {
        System.out.println(i + 1 + ":" + dup2[i]);
      }
   
  }
}
