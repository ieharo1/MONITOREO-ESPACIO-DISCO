/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

import java.util.Scanner;

/**
 *
 * @author Scrappy Doo Coco
 */
public class Persona {
    // Atributos:
    private String cedula, nombre, genero;
     
    // Metodos:
    public Persona (String ced, String nom, String gn) {
        cedula = ced;
        nombre = nom;
        genero = gn;
    }
    
    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresar la cedula: ");
        cedula=sc.nextLine();
        System.out.print("ingresar el nombre: ");
        nombre=sc.nextLine();
        System.out.print("ingresar el genero: ");
        genero=sc.nextLine();
    }
    
    public void escribir () {
       System.out.println("C.I es: "+cedula+", nombre: "+nombre+", genero: "+genero);
    }
}
