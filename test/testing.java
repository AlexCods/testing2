

import org.junit.Assert;
import org.junit.Test;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumne
 */
public class testing {
    
    @Test
    public void ComparandoCuadradoRectangulo(){
        Figura rectangulo = new Rectangulo("rectangulo",10,10);
        Figura cuadrado = new Cuadrado("cuadrado",10);
        String result = Comparador.comparaArea(rectangulo, cuadrado);
        Assert.assertEquals("son iguales", result);
    }
    
    @Test
    public void ComparandoCuadradoCirculo(){
        Figura cuadrado = new Cuadrado("cuadrado",10);
        Figura circulo = new Circulo("circulo",5);
        String result = Comparador.comparaArea(cuadrado, circulo);
        Assert.assertEquals("f1 es mayor", result);
    }
    
    @Test
    public void ComparandoRectanguloCirculo(){
        Figura cuadrado = new Cuadrado("cuadrado",10);
        Figura circulo = new Circulo("circulo",5);
        String result = Comparador.comparaArea(cuadrado, circulo);
        Assert.assertEquals("f1 es mayor", result);
    }
    
    
}
