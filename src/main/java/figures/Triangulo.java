/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author administradorcito
 */
public class Triangulo implements IFigura {

    int altura;
    int base;
    
    
    
    
    
    

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

   
    

    public void calArea() {

        System.out.println("EL AREA ES:"+(getBase() * getAltura()) / 2);
    }

}
