class Main {
  public static void main(String[] args) {
      
      String S =  "orange/apple/cherry/grape/apple";
      String[] H = S.split("/", 0);
     
     for (int i = 0 ; i <H.length; i++) {
        System.out.println(i + 1 + ":"+H[i]);
      }
      
  }
}