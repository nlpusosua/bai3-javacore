package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap username");
        String guessUser = scanner.nextLine();
        String user = "techmaster";
        System.out.println("nhap pass");
        String guessPass = scanner.nextLine();
        String pass = "hoclacoviec";
        if (user.equals(guessUser) && pass.equals(guessPass)){
            System.out.println("dang nhap thanh cong");

        }
         else {
            System.out.println("sai thong tin dang nhap");
        }



    }
}
