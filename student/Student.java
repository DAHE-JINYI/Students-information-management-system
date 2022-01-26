package student; 
/**
 * 第一个类，主类
 */
public class Student{
    //这些是变量
    private String sid ;
    //学号
    private String name ;
    //姓名
    private String age; 
    //年龄
    private String address ;
    //居住地
    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }//下面是方法，vscode 
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

 

}