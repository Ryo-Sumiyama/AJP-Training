import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// 外部クラスStage1Iを宣言
public class Stage1I {    
    public static void main(String[] args) {
        cnt();
    }
    // 田が付くレコード数を取得するメソッド
    public static void cnt(){
    // 内部クラスAcquisitionを宣言        
    class Acquisition{
        Acquisition(){
            // MySQLに接続
            final String URL 
            = "jdbc:mysql://localhost:3306/TASK_DB?useUnicode=true&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "";
            final String SQL = "SELECT COUNT(*) FROM T_USER WHERE USER_NM like '%田%';";
            //MySQLのConectionを返すgetConnectionメソッド
            try(Connection conn = 
            DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps = conn.prepareStatement(SQL)){
                try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    System.out.println(
                    rs.getInt("COUNT(*)"));
                }           
            };
        // 例外をキャッチ
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    }
        new Acquisition();
    }
}