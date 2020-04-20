import java.util.Calendar;
import java.text.SimpleDateFormat;

class Main {
 
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
     //現在時刻を取得
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
      //出力フォーマットを指定
        SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
        System.out.println(now.format(calendar.getTime()));
       
        for (int i = 1; i <= 19; i++) {
            calendar.add(Calendar.SECOND,1);
            System.out.println(now.format(calendar.getTime()));
        }
        
        System.out.println("20秒カウント終わりました");
    }
}