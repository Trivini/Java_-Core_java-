package thirteen_Abstraction;

//contract for persons like student and trainer and Mentors etc.

public interface Personable {

    //abstarct method
    public void setPersonDetails();

    public void displayPersonDetails();

    default void achievementStatus(){
        
    }

}
