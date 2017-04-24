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
public class Rectangulo implements IFigura{
    
private int base;
private int altura;





    

    public void calArea() {
        System.out.println((getBase()*getAltura()));

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    

   
}
