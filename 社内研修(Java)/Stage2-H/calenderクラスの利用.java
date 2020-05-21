import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Timer; 
import java.util.TimerTask;

class Stage2H {
 
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
      //出力フォーマットを指定
        SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
        System.out.println("20秒カウントスタート");
        
         Timer timer = new Timer();
         TimerTask task = new TimerTask() {
             int cnt = 0;
             public void run() {
                 calendar.add(Calendar.SECOND,1);
                 System.out.println(now.format(calendar.getTime()));
                 cnt++;
                 if (cnt >= 20) {
                     timer.cancel();
                     System.out.println("20秒カウント終わりました");
                 }
        }
         };
          timer.scheduleAtFixedRate(task,1000,1000);
       
    }
}