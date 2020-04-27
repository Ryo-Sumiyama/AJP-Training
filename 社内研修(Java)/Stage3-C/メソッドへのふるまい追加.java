import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main (String[] args) {
        printColors("red","blue","yellow","green");
    }
    
    private static void printColors(String ... colors) {
    　　//テキストファイルを作成
        try {
        File file = new File("/home/ec2-user/environment/サンプル実行/output/{200427}_output.txt");
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < colors.length; i++) {
             fw.write(colors[i]);
            }
        fw.close();
          } catch (IOException ex) {
                ex.printStackTrace();
                 
        }
        //5ファイル以上存在する場合、過去のファイルを削除
        File dir = new File("/home/ec2-user/environment/サンプル実行/output");
        File[] f = dir.listFiles();
        Arrays.sort(f, Collections.reverseOrder());
        f[4].delete();
    }
}