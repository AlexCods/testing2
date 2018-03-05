/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumne
 */
public class Comparador {
    
    public static String comparaArea(Figura f1, Figura f2){
        
        if (f1.getArea() > f2.getArea()) {
            return "f1 es mayor";
        } else if ( f1.getArea() == f2.getArea()){
            return "son iguales";
        } else {
            return "f2 es mayor";
        }
        
    }
    
    public static Figura comparaPerimetro(Figura f1, Figura f2){
         if (f1.getPerimetro() > f2.getPerimetro()) {
            return f1;
        } else {
            return f2;
        }
    }
    
}
