package student;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，用来存数据
        ArrayList < Student > array = new ArrayList< Student > ();

//写一个循环.下面是一个死循环
        while (true){

        System.out.println("--------欢迎来到本系统--------");
//
        System.out.println("1 添加学生");
//
        System.out.println("2 删除学生");
//
        System.out.println("3 修改学生");
//  
        System.out.println("4 查看所有学生");
//
        System.out.println("5 退出");
//
        System.out.println("请输入你的选择：");

        //这是一个Scanner
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        switch(line){
            case"1":
            System.out.println("添加学生");
            //调用方法
            addstudent(array);
            break;
            case"2":
            System.out.println("删除学生");
            //调用方法
            deleteStudent(array);
            break;
            case"3":
            System.out.println("修改学生");
            modifyStudent(array);
            break;
            case"4":
            System.out.println("查看所有学生");
            //调用方法
            findallstudent(array);
            break;
            case"5":
            System.out.println("慢走，不送 !");
            //JVM
                System.exit(0);

        }
    }
    
    }
    //定义一个方法  addstudent array 是一个数组
    public static void addstudent( ArrayList < Student > array ){
        //让你键盘能输入System中的值
        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("请输入学生学号");
        String sid = sc.nextLine();

        boolean flag = isuesd(array, sid);
        if(flag){
            System.out.println("你输入的学号有误");
        }else{
            break;
        }

        System.out.println("请输入学生姓名");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        System.out.println("请输入学生居住地");
        String address = sc.nextLine();

        //创建学生变量，赋值给学生对象的成员变量
        Student s = new Student(sid, name, age, address);
        s.setAddress(address);
        s.setAge(age);
        s.setName(name);
        s.setSid(sid);

        //将“S”加入数组 array 中
        array.add(s);
        System.out.println("添加学生成功");
    }
}
    //查看学生方法
    public static void findallstudent( ArrayList < Student > array ){
        if(array.size() == 0){
            System.out.println(" 无有效信息，请添加信息 ");
            //return 是结束一个方法
            return;
        }
        //信息对不齐用\t
        System.out.println("学号\t姓名\t年龄\t居住地");
        //将学生数据取出，按照 S.get 顺序显示  补充一个“ 岁 ”上去
        for(int i=0; i<array.size(); i++ ){
            Student s = array.get(i);
            System.out.println( s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress() );
        }
    }
    public static void deleteStudent( ArrayList < Student > array ){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生学号");
        String sid = sc.nextLine();

        for( int i=0; i<array.size(); i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                //删除 array.remove( );
                array.remove(i);
                break;
            }
            System.out.println("删除成功");
        }
        int a = -1 ;
        for( int i=0; i<array.size(); i++ ){
            Student s = array.get(i);
            if( s.getSid().equals(sid) ){
                a = i;
                break;
            }
        }
        if ( a == -1 ){
            System.out.println("改用户不存在");
        }else{
            array.remove(a);
            System.out.println("删除成功");
        }

    }
    public static void modifyStudent( ArrayList < Student > array ){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号:");
        String sid = sc.nextLine();

        System.out.println("请输入学生新姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地");
        String addString = sc.nextLine();

        Student s = new Student(sid, name, age, addString);
        s.setAddress(addString);
        s.setAge(age);
        s.setName(name);
        s.setSid(sid);

        for(int i=0; i<array.size(); i++){
           Student   student = array.get(i);
           if ( student.getSid().equals(sid) ) { 
               array.set(i, s);
               break;
             }
        }
        System.out.println("修改成功");
    }
    public static boolean isuesd ( ArrayList < Student > array, String sid ) {
        boolean flag = false;

        for(int i=0;i<array.size(); i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid) );
            flag = true;
            break;
        }

        return flag;
        
    }

}
