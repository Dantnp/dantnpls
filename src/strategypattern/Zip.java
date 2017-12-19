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
public class Zip implements Compreser{

    public Zip() {
    }
      
    @Override
    public void compression(String Text) {
            System.out.println("Zip Compresion");
    }

    
}
