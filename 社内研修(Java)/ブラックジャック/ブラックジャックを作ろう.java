import java.security.SecureRandom;
import java.util.Scanner;

public class Black {
    
    public static void main(String[] args) {
     int player = 0;
    //  プレイヤーの値(1-10)をランダムで取得、出力
        SecureRandom card = new SecureRandom();
        int first = card.nextInt(10) + 1;
        player += first;
        System.out.println("『数値：[" + player + "]　合計：[" + player + "]』");
        
        String answer ="";
        while(true){
        System.out.println("次のランダム数値を取得しますか[Y/N]");
        // 文字を入力してもらう
        Scanner scanner = new Scanner(System.in);
        answer =scanner.next();
        
        // Yの時
        if("Y".equals(answer)){
            int second = card.nextInt(10) + 1;
            player += second;
            System.out.println("『数値：[" + second + "]　合計：[" + player + "]』");
            if(player > 21){
                System.out.println("LOSE");
               return;
            }
        }
    
        // Nの時
       if("N".equals(answer)){
        //   親の値(15-22)を取得、出力
           SecureRandom dealerCard = new SecureRandom();
           int dealer = dealerCard.nextInt(8) + 15;
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
    }
}
