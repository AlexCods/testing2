/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alumne
 */
public class Rectangulo implements Figura{
    private int base;
    private int altura;
    private int perimetro;
    private int area;
    private String nombre;

    public Rectangulo(String nombre, int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }
       
    public double getArea() {
        double area = this.base * this.altura;
        return area;
    }

    public double getPerimetro() {
        double perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
