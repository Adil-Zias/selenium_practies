package Cyram;

import java.util.ArrayList;

public class demo {

    private String name = "adil";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static int add(int n1, int n2)
    {
        return n1+n2;
    }
    int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }



    public static void main(String[] args) {
        String[] mum = new String[3];
        mum[0] = "mamam";
        mum[1] = "bang";
        mum[2] = "nununu";



        int[] num1 = {3, 4, 5, 6};
        for(int i = 0; i < num1.length; i++){
            System.out.println(num1[i]);
        }

        ArrayList<String> name = new ArrayList<>();
        name.add("adil");
        name.add("bull");
        name.add("blablabla");

        name.add("bala");
        System.out.println(name);
       demo t1 = new demo();
       demo.add(1, 2);









        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }





    }
}
