package Cyram;

import java.util.ArrayList;
import java.util.Random;

public class Listss {


    public static void main(String[] args) {

        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("Good, better, best. Never let it rest. 'Til your good is better and your better is best");
        quotes.add("With the new day comes new strength and new thoughts.");
        quotes.add("Ever tried. Ever failed. No matter. Try Again. Fail again. Fail better.");
        quotes.add("“The best time to plant a tree was 20 years ago. The second best time is now.”");
        quotes.add("“Only the paranoid survive.” – Andy Grove");
        quotes.add("“It’s hard to beat a person who never gives up.” – Babe Ruth");

        Random random = new Random();
        int rana = random.nextInt(quotes.size());
        String quot = quotes.get(rana);
        System.out.println(quot);
    }
}
