/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beeva.app.utils;

import figures.IFigura;

/**
 *
 * @author administradorcito
 */
public class Calculadora {

    private int f;
    private int h;
    
    private String nombre;
    private String nombreFigura;
    private IFigura figura;
    
    
    
    public void Calculo(){
     figura.calArea();
    }
    
    

    public Calculadora(String nombre) {
        //this.f = d;
       this.nombreFigura=nombre;
       
    }

    public int suma(int a, int b) {
        return a + b + h;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public void saludo() {
        System.out.println("*********************************HOLA A TODOS****************************");
    }

    public void despedida() {
        System.out.println("***************************ADIOSSSSSS***********************************");
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public IFigura getFigura() {
        return figura;
    }

    public void setFigura(IFigura figura) {
        this.figura = figura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    

}
