import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
  
    public static void main(String[] args) {
      //List変数dayを宣言
        List <String> day = new ArrayList<>();
      
        day.add("monday");
        day.add("tuesday");
        day.add("wednesday");
        day.add("thursday");
        day.add("friday");
        day.add("saturday");
        day.add("sunday");
      
      //Map変数weekを宣言
        Map<String,String> week = new LinkedHashMap<>();
      
        for(String str : day) {
      //keyとvalueに割り当て  
            week.put(day.get(0),"月曜日");
            week.put(day.get(1),"火曜日");
            week.put(day.get(2),"水曜日");
            week.put(day.get(3),"木曜日");
            week.put(day.get(4),"金曜日");
            week.put(day.get(5),"土曜日");
            week.put(day.get(6),"日曜日");
      }
      Iterator<Map.Entry<String, String>> itr = week.entrySet().iterator();
      
      while(itr.hasNext()) {
          Map.Entry<String, String> entry = itr.next();
          System.out.println(entry.getKey() + " ( " + entry.getValue() + ")");
      }
    }
}