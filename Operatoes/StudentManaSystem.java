package Operatoes;
public class StudentManaSystem {

    public static void main(String[] args) {

        int ID = 1;
        String name = "Sakshi";
        int age = 23;
        float scoreOf_quiz = 30;
        float scoreOf_assignment = 25;
        float scoreOf_exam = 350;



        System.out.println("ID is:"+ID);
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
        System.out.println("Score of quiz is:"+scoreOf_quiz);
        System.out.println("Score of assignment is:"+scoreOf_assignment);
        System.out.println("Score in Exam is:"+scoreOf_exam);

        float total_score = (scoreOf_quiz+scoreOf_assignment+scoreOf_exam);
        System.out.println("Total Score of "+name+"is:" +total_score);

        float average_score = ((scoreOf_quiz+scoreOf_assignment+scoreOf_exam)/3);
        System.out.println("Average score of "+name+"is:" +average_score);

        //Student passed or not (Passed means average score above 75)
        boolean passed = average_score>=75;
        System.out.println(name+" is passed");

        //Increase Attendance By One day

        int attendancePercentage = 75;
        attendancePercentage+=1;
        System.out.println("Increase Attendance :"+attendancePercentage);

        //Awarded 
        //-> Average Score 80 or above
        //-> Attendance above 75

        boolean awarded = average_score>80 && attendancePercentage>75;
        System.out.println(name+" is Awaded");

        
    }
    
}
