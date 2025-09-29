package Static;

import java.util.Random;

public class All {

    //instance data
    int studentID;

    //static data
    static String institutename  = "Digital Edify";

    public static void main(String[] args) {
        //local data
        int marks = 90;
        if(marks>35){
            System.out.println("You are pass");
        }


        All s1 = new All();
        s1.studentID = new Random().nextInt();
        System.out.println("Student s1 ID is:"+s1.studentID);
        System.out.println("Student s1 Institute:"+All.institutename);

        All s2 = new All();
        s2.studentID = new Random().nextInt();
        System.out.println("Student s2 ID is:"+s2.studentID);
        System.out.println("Student s2 Institute:"+All.institutename);

        All s3 = new All();
        s3.studentID = new Random().nextInt();
        System.out.println("Student s3 ID is:"+s3.studentID);
        System.out.println("Student s3 Institute:"+All.institutename);
    }

    
}
