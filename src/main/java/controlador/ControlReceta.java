/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.*;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class ControlReceta 
{
    Receta r;
    public Receta crearReceta(String nR, int tPR, String aER, double cPI)
    {
        if(validarAltoEn(aER))
        {
           return r=new Receta(nR, tPR, aER, cPI); 
        }
        throw new IllegalArgumentException("El valor de alto en es incorrecto");
    }
    
    public Ingrediente crearIngrediente(String nI, String cI, String sI, int cPI
            , String tI)
    {
        Ingrediente i=new Ingrediente(nI, cI, sI, cPI, tI);
        r.crear(i);
        return i;
    }
    public ArrayList<Ingrediente> listarIngredientes()
    {
        return r.listar();
    }
    public Receta listarReceta()
    {
        return r;
    }
    public Ingrediente modificarIngrediente(String nI, String cI, String sI, int cPI
            , String tI, int ip)
    {
        Ingrediente i=new Ingrediente(nI, cI, sI, cPI, tI);
        return r.modificar(ip, i);
    }
    public Ingrediente eliminarIngrediente(String nombreI)
    {
        return r.eliminar(obtenerPosicionIngrediente(nombreI));
    }
    public int obtenerPosicionIngrediente(String nombreI)
    {
        int x=0;
        for(Ingrediente i: r.listar())
        {
            if(i.getNombre()==nombreI)
            {
                break;
            }
            x++;
        }
        return x;
    }
    public boolean validarAltoEn(String ae)
    {
        boolean llave;
        if(ae.equals("Azucar"))
        {
            llave=true;
        }else if(ae.equals("Sal"))
        {
            llave=true;
        }else if(ae.equals("Grasa"))
        {
            llave=true;
        }else{
           llave=false;
        }
        return llave;
    }
}
