/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author mimak0s
 */
public class Contex {
    private final  Compreser compreser; 
    
    public Contex (Compreser compreser){
        this.compreser= compreser;}

    
    
    public void publishComp(String Text){
        compreser.compression(Text);
    }
        
    }
    

    

