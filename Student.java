package Cyram;



public class Student {


    String fname;
    String lname;
    String id;

    public Student(String finame, String llname, String iid){
        fname = finame;
        lname = llname;
        id = iid;


    }


    public void displayInfo(){
        System.out.println("here is your Info");
        System.out.println("your First name: " + fname);
        System.out.println("your Last name:" + lname);
        System.out.println("your ID number: " + id);
    }





    public static void main(String[] args) {





    }



}







