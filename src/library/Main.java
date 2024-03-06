package library;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner;
   static DataBase dataBase;

    public static void main(String[] args) {

        dataBase = new DataBase();

         System.out.println("Welcome to Library Management System!");

         int num;
        do {

             System.out.println(" 0. Exit\n1. Login\n2. New User");

             scanner= new Scanner(System.in);
            num = scanner.nextInt();
             switch (num){
                 case 1: login();
                 case 2: newuser();
             }
         } while (num != 0);

    }


    private static void login(){
        System.out.println("Enter phone Number");
        String phonenumber = scanner.next();
        System.out.println("Enter Email:");
        String email = scanner.next();
        int n= dataBase.login(phonenumber,email);
        if ( n != -1 ){
            User user = dataBase.getUser(n);
            System.out.println("Welcome "+ user.getName());
            user.menu();


        }else {
           System.out.println("User doesn't exist!");
        }
    }


    private static void newuser() {
        System.out.println("Enter name");
        String name = scanner.next();
         System.out.println("Enter phone Number");
            String phonenumber = scanner.next();
            System.out.println("Enter Email:");
            String email = scanner.next();
            System.out.println("1. Admin\n2. Normal User");
            int n2 = scanner.nextInt();
            User user;
            if (n2 == 1){
                user = new Admin( name, email,phonenumber);
            }else {
               user = new NormalUser( name, email,phonenumber);
            }

            dataBase.AddUser(user);
            System.out.println("User created successfully");
    }
}
