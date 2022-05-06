/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Receta implements IReceta
{
    private String nombre;
    private int tiempoDePreparacion;
    private String altoEn;
    private double costoPreparacion;
    private final ArrayList<Ingrediente>ingredienteList=new ArrayList();
    //Constructor
    public Receta(String nombre, int tiempoDePreparacion, String altoEn, 
            double costoPreparacion) {
        this.nombre = nombre;
        this.tiempoDePreparacion = tiempoDePreparacion;
        this.altoEn = altoEn;
        this.costoPreparacion = costoPreparacion;
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoDePreparacion() {
        return tiempoDePreparacion;
    }
    public void setTiempoDePreparacion(int tiempoDePreparacion) {
        this.tiempoDePreparacion = tiempoDePreparacion;
    }

    public String getAltoEn() {
        return altoEn;
    }
    public void setAltoEn(String altoEn) {
        this.altoEn = altoEn;
    }

    public double getCostoPreparacion() {
        return costoPreparacion;
    }
    public void setCostoPreparacion(double costoPreparacion) {
        this.costoPreparacion = costoPreparacion;
    }
    
    public boolean validarCostoMinPreparacion(double p)
    {
        boolean llave;
        if(p>costoPreparacion)
        {
            llave=true;
        }else{
            llave=false;
        }
        return llave;
    }
    public int calcularIngredientesTotales()
    {
        return ingredienteList.size();
    }
    
    //Implementacion de los metodos abstractos
    @Override
    public Ingrediente crear(Ingrediente i) {
        
        ingredienteList.add(i);
        return i;
    }

    @Override
    public ArrayList<Ingrediente> listar() 
    {
        return ingredienteList;
    }

    @Override
    public Ingrediente modificar(int c, Ingrediente i)
    {
        ingredienteList.set(c, i);
        
        return i;
    }

    @Override
    public Ingrediente eliminar(int c)
    {
        return ingredienteList.remove(c);
    }
    //Sobreescribir el metodo toString
    @Override
    public String toString() {
        String cadena="";
        String ingrediente;
        for(Ingrediente i: ingredienteList)
        {
            ingrediente=String.valueOf(i);
            cadena=cadena+ingrediente;
        }
        return "Receta"+"\n"+"Nombre: "+nombre+"\n"+"TiempoDePreparacion: "+
                tiempoDePreparacion+"\n"+"AltoEn: "+altoEn+"\n"+
                "CostoPreparacion: "+costoPreparacion+"\n"+"IngredienteList: "+
                "\n"+cadena;
    }
    
    
    
}
