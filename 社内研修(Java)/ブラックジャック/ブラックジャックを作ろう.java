import java.security.SecureRandom;
import java.util.Scanner;

public class Black {
    public static String answer;
    public static int player;
    public static int dealer;
    public static int card;
    
    public static void main(String[] args) {
    //  startメソッドの呼び出し  
        start();
        
        // ゲームが終了するまでループ
        while(true){
            
        // inputメソッドの呼び出し
        input();
        
        // yesメソッドの呼び出し
        if("Y".equals(answer)){
            yes();
        }
        
         // noメソッドの呼び出し
        if("N".equals(answer)){
            no();
            return;
            }
        }
    }
    
    //  プレイヤーの値(1-10)をランダムで取得、出力するメソッド
    public static void start(){
        SecureRandom card = new SecureRandom();
        int first = card.nextInt(10) + 1;
        player += first;
        System.out.println("『数値：[" + player + "]　合計：[" + player + "]』");
    }
    
    // 次の値を取得するか聞き、入力してもらうメソッド
    public static void input(){
        System.out.println("次のランダム数値を取得しますか[Y/N]");
        Scanner scanner = new Scanner(System.in);
        answer =scanner.next();
    } 
    
    // Yの時に動作するメソッド
    public static void yes(){
        // 新たに引いたカードの値を追加し出力
        SecureRandom nextCard = new SecureRandom();
        int second = nextCard.nextInt(10) + 1;
        player += second;
        System.out.println("『数値：[" + second + "]　合計：[" + player + "]』");
            // バーストした時
        if(player > 21){
            System.out.println("LOSE");
            System.exit(0);
            }
    }
    
    // Nの時に動作するメソッド
    public static void no(){
        //   親の値(15-22)を取得、出力
       SecureRandom dealerCard = new SecureRandom();
       dealer = dealerCard.nextInt(8) + 15;
       System.out.println("『親数値：[" + dealer + "]　合計：[" + dealer + "]』");
           
    //   親がバーストした時
       if(dealer > 21){
           System.out.println("WIN");
           return;
       }   
    //   親＞プレイヤーの時
       else if(player < dealer){
           System.out.println("LOSE");
           return;
       }
    //   親＝プレイヤーの時
       else if(player==dealer){
           System.out.println("DRAW");
           return;
       }
    //   親＜プレイヤーの時
       else if(player > dealer){
           System.out.println("WIN");
           return;
            }
       }

}