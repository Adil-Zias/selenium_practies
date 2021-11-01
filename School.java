package Cyram;
import java.util.Scanner;



public class School {

    public static void main(String[] args) {

        demo p1 = new demo();
        p1.getName();
        System.out.println(p1.getName());
        p1.setName("baza");
        System.out.println(p1.getName());


        while (true){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String fname = sc1.next();

            System.out.println("Enter you last name");
            String lname = sc1.next();

            System.out.println("Enter your ID: ");
            String id = sc1.next();

            System.out.println("are you done? ");
            String answer = sc1.next();
            if (answer.equals("yes")){
                break;
            }


            Student st1 = new Student(fname, lname, id);

            st1.displayInfo();


        }







    }

}



 /*   public static void main(String[] args) {
        Address ad1 = new Address("123 main st", "10","fairfax", "VA", "9006", "U.S");

        Address ad2 = new Address("122 quatro", "10", "garden", "CA", "9006", "U.S");


        Student st1 = new Student("adil", "abdu", "666",ad1);
        Student st2 = new Student("baza", "langza", "888", ad2);


        st1.adr.displayAddress();
        st2.adr.displayAddress();
        System.out.println(ad1.apt);
        System.out.println(st1.adr.st);
        System.out.println();



       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\alxe8\\Downloads\\chromedriver.exe");
        // WbDriver driver = new ChromeDriver();// driver.get("https://www.google.com");

    }
}

  */
