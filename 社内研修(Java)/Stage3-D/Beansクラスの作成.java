import java.io.Serializable;
import java.util.Date;

class Main {
  
  public static void main(String[] args){
    }
  public class UserBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String userId;
    private String userName;
    private String password;
    private Date birthday;
    private int age;
    
    public UserBean() {}
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
    }
}
