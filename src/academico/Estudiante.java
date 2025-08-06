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
class Estudiante extends Persona{
     // Atributos:
    float nota;
    
    // Metodos:
    public Estudiante(String c, String n, String g, float nt) {
        super (c, n, g);
        nota = nt;
    }
    
    public void leerE() {
        Scanner sc = new Scanner(System.in);
        leer();
        System.out.print("ingresar la nota: ");
        nota=sc.nextFloat();
    }
    
    public void escribirE() {
        escribir();
        System.out.println("Nota: " + nota);
    }
}
