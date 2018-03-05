/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alumne
 */
public class Circulo implements Figura {
    private int radio;
    private int perimetro;
    private int area;
    private String nombre;

    public Circulo(String nombre,int radio) {
        this.radio = radio;
        this.nombre = nombre;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double getPerimetro() {
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }

    public String getNombre() {
        return this.nombre;
    }
}
