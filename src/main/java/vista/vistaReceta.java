/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;
import controlador.*;
/**
 *
 * @author ASUS
 */
public class vistaReceta {

    public static void main(String[] args) 
    {
        ControlReceta cr=new ControlReceta();
        cr.crearReceta("Sopa", 18, "Sal", 10.0);
        cr.crearIngrediente("Zanahoria", "Naranja", "Dulce", 100, "Verdura");
        cr.crearIngrediente("Papa", "Cafe", "Simple", 50, "Verdura");
        cr.crearIngrediente("Poroto", "Verde", "Amargo", 1, "Legumbre");
        System.out.println(cr.listarReceta());
        System.out.println("\n"+"Lista modificada"+"\n");
        cr.modificarIngrediente("Culantro", "Verde", "Sin Sabor", 1, "Verdura", 0);
        System.out.println(cr.listarReceta());
        System.out.println("\n"+"objeto eliminado"+"\n");
        cr.eliminarIngrediente("Papa");
        System.out.println(cr.listarReceta());
        
    }
}
