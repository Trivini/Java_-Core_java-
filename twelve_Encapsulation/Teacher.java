package twelve_Encapsulation;

public class Teacher {

    public static void main(String[] args) {
        NewStudent newStu = new NewStudent();
        
        newStu.setAge(10);
        System.out.println("Student Age:"+newStu.getAge());


        newStu.setAge(-10);
        System.out.println("Student Age:"+newStu.getAge());


    }
    
}
