package com.company;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите год рождения: ");
        int year = scanner.nextInt();
        while(true){
            if (age < 0){
                throw new IOException();
            }
            if (year > 2022){
                throw new IOException();
            }
        }
    }
}
