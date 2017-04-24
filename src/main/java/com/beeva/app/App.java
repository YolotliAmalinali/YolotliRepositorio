package com.beeva.app;

import com.beeva.app.utils.Calculadora;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
       "Hola_Spring-context.xml" });
       
        Calculadora cal=context.getBean("calculadora",Calculadora.class);
        
        
        
        
        
       /* for(int i=0; i< args.length; i++){
        System.out.println(i +" >> "+args[i]);
        
    }
        
        
        if(args[0].compareTo("suma")==0){
            System.out.println("resultado = " + cal.suma(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }else if(args[0].compareTo("resta")==0){
            System.out.println("resultado = " + cal.resta(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }else{ 
            
          System.out.println("opcion invalida");
        
        }*/
         
        ((AbstractApplicationContext)context).close();
        
        }
    
    
    
    
    
    
    
    }
    
    
    


