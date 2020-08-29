/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.ejerciciolaboratorio;

import java.util.Scanner;

/**
 *
 * @author nelson
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese tu nombre");
        String Nombre = sc.nextLine();
        System.out.println("ingrese tu edad ");
        int Edad = sc.nextInt();
        System.out.println("ingrese tu genero ");
        char Sexo = sc.next().charAt(0);
        System.out.println("ingrese tu peso ");
        Double Peso = sc.nextDouble();
        System.out.println("ingrese tu Altura ");
        Double Altura = sc.nextDouble();
        
        persona per = new persona();
        per.setNombre(Nombre);
        per.setSexo(Sexo);
        per.setEdad(Edad);
        per.setPeso(Peso); 
        per.setAltura(Altura);
        
        
        persona persona1 = new persona(Nombre, Edad, Sexo, Peso, Altura);
        System.out.println(persona1.toString());
        System.out.println(persona1.EsmayordeEdad());
        
        persona persona2 = new persona(persona1.getNombre(),persona1.getEdad(),persona1.getSexo());
        System.out.println(persona2.toString2());
        System.out.println(persona2.EsmayordeEdad());
        
        persona per3 = new persona();
        per3.setNombre(Nombre);
        per3.setEdad(Edad);
        per3.setSexo(Sexo);
        per3.setPeso(Peso);
        per3.setAltura(Peso);
        System.out.println(per3.toString());
        System.out.println(per3.EsmayordeEdad());
    }
    
}
