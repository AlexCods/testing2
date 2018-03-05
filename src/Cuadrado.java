/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alumne
 */
public class Cuadrado implements Figura {
    private int lado;
    private int perimetro;
    private int area;
    private String nombre;
    
    public Cuadrado(String nombre, int lado) {
        this.lado = lado;
        this.nombre = nombre;
    }
       
    public double getArea() {
        double area = this.lado * this.lado;
        return area;
    }

    public double getPerimetro() {
        double perimetro = (this.lado) * 4;
        return perimetro;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
