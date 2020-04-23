import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main (String[] args) {
        printColors("red","blue","yellow","green");
    }
    
    private static void printColors(String ... colors) {
    
        try {
        File file = new File("home/ec2-user/environment/サンプル実行/output");
        FileWriter fw = new  FileWriter("{200423}_output.txt");
        for (int i = 0; i < colors.length; i++) {
             fw.write(colors[i]);
            }
        fw.close();
          } catch (IOException ex) {
                ex.printStackTrace();
        }
       
        }
       	
    }

        
