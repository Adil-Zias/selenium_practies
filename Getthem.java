package Cyram;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Properties;

public class Getthem {



    public static void main(String[] args){


        int[] num = {1, 2, 3, 4, 5, 6};


        try{
            int result = num[7];
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("its out of bounds");
        }


        try{
            FileInputStream fis = new FileInputStream("src/name1.properties");
            Properties prop = new Properties();
            prop.load(fis);

        }
        catch (Exception e){
            try{
                FileInputStream fis = new FileInputStream("src/name.properties");
                Properties prop = new Properties();
                prop.load(fis);

            }
            catch (Exception a){
                System.out.println("wrong bro");

            }
        }




    }


}
