import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

  class Main {
      //クラス変数 cntを作成
    private static int cnt = 0;
    
    public class UserBean implements Serializable {
    UserBean(int cnt) {Main.cnt++;}
    private static final long serialVersionUID = 1L;
    
    private String userId;
    private String userName;
    private String password;
    private Date birthday;
    private int age;
    private String residence;
    
    UserBean() {}
    //userIdのsetter、getter
    public void setUserId(String userId) {this.userId = userId;}
    public String getUserId() {return this.userId;}
    //userNameのsetter、getter
    public void setUserName(String userName) {this.userName = userName;}
    public String getUserName() {return this.userName;}
    //passwordのsetter、getter
    public void setPassword(String password) {this.password = password;}
    public String getPassword() {return this.password;}
    //birthdayのsetter、getter
    public void setBirthday(Date birthday) {this.birthday = birthday;}
    public Date getBirthday() {return this.birthday;}
    //ageのsetter、getter
    public void setAge(int age) {this.age = age;}
    public int getAge() {return this.age;}
    //residenceのsetter,getter
    //初期値に所属地を割りあてるコンストラクタを作成、インスタンスの生成数をカウント
    UserBean(String residence) {
        Main.cnt++;
        this.residence = residence;
  }
    
    //日付フォーマットを指定
    SimpleDateFormat now = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
    //toStringメソッドをオーバーライド
     @Override 
     public String toString() {
        return "ユーザID：{" + this.getUserId() + "}\r\nユーザ名：{" + this.getUserName() + "}\r\nパスワード：{" + this.getPassword() +  "}\r\n生年月日：{" + now.format(this.getBirthday()) + "}\r\n年齢：{" + this.getAge() + "}\r\n居住地：{" + this.residence + "}";
        }
        
        //getCntメソッドを作成
        public  int getCnt(){return Main.cnt;}
        }
          }

 public class Meibo{ 
   
   public static void main(String[] args){
     
     Main a = new Main();
     
     Main.UserBean userBean = a.new UserBean("和歌山"); 
     //インスタンスに値をセット
     userBean.setUserId("1234"); 
     userBean.setUserName("炭山諒");
     userBean.setPassword("5678");
     userBean.setAge(23);
     
     try {
           String strDate = "1997/05/26";
         
            SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdFormat.parse(strDate);
          
        userBean.setBirthday(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
     
    //セットした値を出力
    System.out.println(userBean.toString());
    System.out.println(userBean);
    System.out.println("カウント数:{" + userBean.getCnt() + "}");
    }
}