

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
    public void CalculandoAreaCuadrado(){
        Figura cuadrado = new Cuadrado("cuadrado",10);
        Double result = cuadrado.getArea();
        Assert.assertEquals(100.0,100.0, result);
    }
    
    @Test
    public void CalculandoAreaCirculo(){
        Figura circulo = new Circulo("circulo",5);
        Double result = circulo.getArea();
        Assert.assertEquals(78.54,78.54, result);
    }
    
    @Test
    public void CalculandoAreaRectangulo(){
        Figura rectangulo = new Rectangulo("rectangulo",10,10);
        Double result = rectangulo.getArea();
        Assert.assertEquals(100.0,100.0, result);
    }
    
    @Test
    public void CalculandoPerimetroCuadrado(){
        Figura cuadrado = new Cuadrado("cuadrado",10);
        Double result = cuadrado.getPerimetro();
        Assert.assertEquals(40.0,40.0, result);
    }
    
    @Test
    public void CalculandoPerimetroCirculo(){
        Figura circulo = new Circulo("circulo",5);
        Double result = circulo.getPerimetro();
        Assert.assertEquals(31.41,31.41, result);
    }
    
    @Test
    public void CalculandoPerimetroRectangulo(){
        Figura rectangulo = new Rectangulo("rectangulo",10,10);
        Double result = rectangulo.getPerimetro();
        Assert.assertEquals(40.0,40.0, result);
    }
    
    @Test
    public void ComparandoCuadradoRectanguloArea(){
        Figura rectangulo = new Rectangulo("rectangulo",10,10);
        Figura cuadrado = new Cuadrado("cuadrado",10);
        String result = Comparador.comparaArea(rectangulo, cuadrado);
        Assert.assertEquals("son iguales", result);
    }
    
    @Test
    public void ComparandoCuadradoCirculoArea(){
        Figura cuadrado = new Cuadrado("cuadrado",10);
        Figura circulo = new Circulo("circulo",5);
        String result = Comparador.comparaArea(cuadrado, circulo);
        Assert.assertEquals("f1 es mayor", result);
    }
    
    @Test
    public void ComparandoRectanguloCirculoArea(){
        Figura rectangulo = new Rectangulo("rectangulo",10,10);
        Figura circulo = new Circulo("circulo",5);
        String result = Comparador.comparaArea(rectangulo, circulo);
        Assert.assertEquals("f1 es mayor", result);
    }
    
    @Test
    public void ComparandoCuadradoRectanguloPerimetro(){
        Figura rectangulo = new Rectangulo("rectangulo",10,10);
        Figura cuadrado = new Cuadrado("cuadrado",10);
        String result = Comparador.comparaArea(rectangulo, cuadrado);
        Assert.assertEquals("son iguales", result);
    }
    
    @Test
    public void ComparandoCuadradoCirculoPerimetro(){
        Figura cuadrado = new Cuadrado("cuadrado",10);
        Figura circulo = new Circulo("circulo",5);
        String result = Comparador.comparaArea(cuadrado, circulo);
        Assert.assertEquals("f1 es mayor", result);
    }
    
    @Test
    public void ComparandoRectanguloCirculoPerimetro(){
        Figura rectangulo = new Rectangulo("rectangulo",10,10);
        Figura circulo = new Circulo("circulo",5);
        String result = Comparador.comparaArea(rectangulo, circulo);
        Assert.assertEquals("f1 es mayor", result);
    }
    
    
}
