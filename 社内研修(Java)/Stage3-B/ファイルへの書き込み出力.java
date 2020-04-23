import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main (String[] args) {
        printColors("red","blue","yellow","green");
    }
    
    private static void printColors(String ... colors) {
    
        try {
        File file = new File("/home/ec2-user/environment/サンプル実行/output/{200423}_output.txt");
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < colors.length; i++) {
             fw.write(colors[i]);
            }
        fw.close();
          } catch (IOException ex) {
                ex.printStackTrace();
        }
       
        }
       	
    }

        

        
