/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Ingrediente 
{
    private String nombre;
    private String color;
    private String sabor;
    private int cantDeProteinas;
    private String tipo;
    //Constructor
    public Ingrediente(String nombre, String color, String sabor,
            int cantDeProteinas, String tipo) {
        this.nombre = nombre;
        this.color = color;
        this.sabor = sabor;
        this.cantDeProteinas = cantDeProteinas;
        this.tipo = tipo;
    }
    //Getters y Setters 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getCantDeProteinas() {
        return cantDeProteinas;
    }
    public void setCantDeProteinas(int cantDeProteinas) {
        this.cantDeProteinas = cantDeProteinas;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int calcularProteinasExtra()
    {
        if(cantDeProteinas>=1000)
        {
            cantDeProteinas=cantDeProteinas+150;
        }else if(cantDeProteinas<=999)
        {
            cantDeProteinas=cantDeProteinas+25;
        }
        return cantDeProteinas;
    }
    public boolean validarTipoDeAlimento()
    {
        boolean llave;
        switch(tipo)
        {
            case "Verdura":
                llave=true;
                break;
            case "Fruta":
                llave=true;
                break;
            case "Legumbre":
                llave=true;
                break;
            case "Procesados":
                llave=true;
                break;
            default:
                llave=false;
                break;
        }
                
        return llave;
    }
    
    //Sobreescritura de metodo to String
    @Override
    public String toString() {
        return "Ingrediente"+"\n"+"Nombre: "+nombre+"\n"+"Color: "+color+"\n"+
                "Sabor: "+sabor+"\n"+"CantDeProteinas: "+cantDeProteinas+"\n"+
                "Tipo: "+tipo+"\n";
    }
    
    
    
    
}
