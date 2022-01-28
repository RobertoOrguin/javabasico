package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num1,num2;
        String nome;
        System.out.println("Olá Digite seu primeiro nome:");
        nome=entrada.next();
        System.out.println("Bem-vinda,"+nome+" digite 1 número:");
        num1= entrada.nextInt();
        System.out.println("Digite outro número");
        num2= entrada.nextInt();
        if (num1>num2){
            System.out.println("o maior número é o: "+num1);
        } else {
            System.out.println("o maior número é o: "+num2);
        }

    }
}
