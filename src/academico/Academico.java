/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

/**
 *
 * @author Scrappy Doo Coco
 */
public class Academico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente d = new Docente("0904453363", "Ing. Fausto Meneses, Mgs", "M", "Programacion Orientada a Objetos");
        Estudiante e = new Estudiante("1720203012", "Erika Zeas", "F", 17);
        d.escribirD();
        e.escribirE();
        d.leerD();
        d.escribirD();
        e.leerE();
        e.escribirE();
    }
    
}
