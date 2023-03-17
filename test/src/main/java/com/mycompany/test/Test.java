/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.tp_0_function;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class TP_0_Function {

    public static void main(String[] args) {
        
       

        tableDeMultiplication(5,13);
        
    }



public static void tableDeMultiplication(int intTable, int intNbLimite)
    {
        
        for(int i=1; i<=intNbLimite; i++){
            int resultat=intTable*i;
            System.out.println(intTable+"*"+intNbLimite+"="+resultat);
        }
}

import java.util.Scanner;

public class Main {
  
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       System.out.print("Entrez un nombre binaire: ");
       String bn = sc.nextLine();
       System.out.println("Le nombre décimal est: "+Integer.parseInt(bn,2));
    }
}