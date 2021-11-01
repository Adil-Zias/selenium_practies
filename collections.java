package Cyram;

import java.util.ArrayList;
import java.util.HashMap;

public class collections {










    public static void main(String[] args) {

        HashMap<String, String> phonebook = new HashMap<String, String>();

        phonebook.put("adil", "123-123-123");
        phonebook.put("dsfl", "123-453-143");
        phonebook.put("asdl", "123-623-123");
        phonebook.put("gbtl", "123-003-103");



        for (String i : phonebook.keySet()) {
            System.out.println(i + " number: " + phonebook.get(i));
        }


        ArrayList<String>grocore = new ArrayList<>();
        grocore.add("lala");
        grocore.add("lfsd");
        grocore.add("hreg");
        grocore.add("sdfjb");
        grocore.add("nief");

        for (String items : grocore){
            //System.out.println(grocore.indexOf(items)+ "items is:" + items);
        }

    }
}
