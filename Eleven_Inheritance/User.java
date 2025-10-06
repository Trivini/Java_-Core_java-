package Eleven_Inheritance;

public class User {

    public static void main(String[] args) {

         System.out.println("=====Learner======");
        Learner learner = new Learner();
        learner.watchVideo();

        System.out.println("===== Video Admin======");

        VideoAdmin videoAdmin = new VideoAdmin();
        videoAdmin.watchVideo();
        videoAdmin.UpdateVideo();

        System.out.println("===== Super Admin======");

        SuperAdmin superadmin = new SuperAdmin();
        superadmin.watchVideo();
        superadmin.UpdateVideo();
        superadmin.DeleteVideo();
    }
    
}
