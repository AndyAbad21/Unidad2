/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public interface IReceta 
{
    public Ingrediente crear(Ingrediente i);
    public ArrayList<Ingrediente> listar();
    public Ingrediente modificar(int c, Ingrediente i);
    public Ingrediente eliminar(int c);
}
