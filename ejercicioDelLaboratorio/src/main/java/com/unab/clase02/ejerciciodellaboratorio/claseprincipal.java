/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.ejerciciodellaboratorio;

import java.util.Scanner;

/**
 *
 * @author nelson
 */
public class claseprincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String Nombre = sc.nextLine();
        System.out.println("ingrese su edad ");
        int Edad = sc.nextInt();
        System.out.println("ingrese su genero ");
        char Sexo = sc.next().charAt(0);
        System.out.println("ingrese su peso ");
        Double Peso = sc.nextDouble();
        System.out.println("ingrese su Altura ");
        Double Altura = sc.nextDouble();
        
        
        
        
//        RECIBIENDO DATOS DEL OBJETO DE PARTE DEL TECLADO
        Persona per1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
        System.out.println(per1.toString());
        System.out.println(per1.EsmayordeEdad());
        
        Persona per2 = new Persona(per1.getNombre(),per1.getEdad(),per1.getSexo());
        System.out.println(per2.toString2());
        System.out.println(per2.EsmayordeEdad());
        
        Persona per3 = new Persona();
        per3.setNombre(Nombre);
        per3.setEdad(Edad);
        per3.setSexo(Sexo);
        per3.setPeso(Peso);
        per3.setAltura(Peso);
        
        
        System.out.println(per3.toString());
        System.out.println(per3.EsmayordeEdad());
        
        
        
        
        
        
        

        
        

    
    }
    
}
