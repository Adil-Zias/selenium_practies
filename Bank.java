package Cyram;

import java.util.Scanner;

public class Bank {

    private int balance;
    private String name;
    private int id;

    public int getBalance() {
        return balance;
    }
    public String getName(){return name;}
    public int getId(){return id;}


    public void setBalance(int amount) {
        this.balance += amount;

    }

    public void withdraw(int amount){
        balance -= amount;
    }


    public void Showmanu(){
        Scanner t0 = new Scanner(System.in);
        System.out.println("please enter your name: ");
        name = t0.nextLine();
        System.out.println("please enter your ID: ");
        id = t0.nextInt();
        System.out.println("Welcome " + name);



        String option = "";
        while (!option.equals("D")){
            System.out.println("=================================");
            System.out.println(" please chose from below options");
            System.out.println("=================================");

            System.out.println("A. deposit");
            System.out.println("B. withdraw");
            System.out.println("C. check balance");
            System.out.println("D. exit");

            Scanner t1 = new Scanner(System.in);
            option = t1.nextLine();




            if (option.equals("A")){
                System.out.println("please enter deposit amount");
                int amount = t1.nextInt();
                setBalance(amount);
            }
            if (option.equals("B")){
                System.out.println("please enter withdraw amount");
                int amount = t1.nextInt();
                withdraw(amount);
            }
            if (option.equals("C")){
                System.out.println("Here is your current balance");
                System.out.println(getBalance());
            }
            if (option.equals("D")){
                System.out.println("Thanks for visit BOA, Bye");
            }

        }


    }



}
