package main;

import java.util.Scanner;

/**
 * Created by avoge on 16/07/2016.
 */
public class Main {

    public static void main(String[] args){

        System.out.println("----WORD COUNT----");

        int option = 0;
        Scanner scr = new Scanner(System.in);

        String file="";

        do{
            printarMenu();
            option = scr.nextInt();
            switch(option){
                case 1: //-Seleccionar fitxer d'dentrada

                    System.out.println("Introdueix la ruta del fitxer d'entrada: ");
                    file = scr.next();

                    break;
                case 2: //-Calcular aparicions (no es podra executar si no sha seleccionat un fitxer d'entrada)
                    if(file == ""){
                        System.out.println("No s'ha seleccionat un fitxer d'entrada.");
                        break;
                    }

                    // calculaAparicions(file)
                    break;

                case 3: //-Visualitzar resultats de l'ultim calcul d'aparicions

                    if(file ==""){
                        System.out.println("No s'ha seleccionat un fitxer d'entrada.");
                        break;
                    }

                    //-Comprovar si s'ha fet el primer calcul i, en cas afirmatiu, mostrar menu de resultats.

                    break;

                case 4: //-Sortir

                    break;

                default:
                    System.out.println("Opcio no valida.");
                    break;
            }
        }while(option != 4);
        scr.close();
    }

    public static void printarMenu(){

        System.out.println("1-Seleccionar fitxer d'entrada");
        System.out.println("2-Calcular aparicions");
        System.out.println("3-Visualitzar resultats");
        System.out.println("4-Sortir");
        System.out.println("Opcio: ");
    }

}
