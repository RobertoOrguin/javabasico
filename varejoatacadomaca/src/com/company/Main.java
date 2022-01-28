package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	      Scanner entrada= new Scanner(System.in);
                int qnt;
                double total;
                System.out.println("Quantas maças você quer?");
                qnt= entrada.nextInt();
                   if (qnt>=11){
                       total=(qnt*0.30);
                   System.out.println("o total é: R$"+total);
                } else {
                       total=(qnt*0.25);
                    System.out.println("o total é: R$"+total    );
                }

            }
    }

