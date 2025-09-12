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

        //checking pas or not
        if(average_score>=75)
        {
            System.out.println(name+" is pass");
        }
        else{
            System.out.println(name+" is fail");
        }
        int daily_attendance=80;
        daily_attendance+=1;


        if(average_score>=80&&daily_attendance>=75)
        {
            System.out.println(name+"is Awared with First class");
        }
        else{
            System.out.println(name+"is not Awared with First class");
        }
    }
    
}
