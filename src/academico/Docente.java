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
class Docente extends Persona{
    // Atributos:
    String asignatura;
    
    // Metodos:
    public Docente(String cd, String nm, String g, String a) {
        super(cd, nm, g);
        asignatura = a;
    }
    
    public void leerD() {
        Scanner sc = new Scanner(System.in);
        leer();
        System.out.print("ingresar la asignatura: ");
        asignatura=sc.nextLine();
    }
    
    public void escribirD () {
        escribir();
        System.out.println("Asignatura: " + asignatura);
    }
}
