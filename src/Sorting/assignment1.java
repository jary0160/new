/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author jary0160
 */
public class assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numbers myNumbers[] = new Numbers[5000];
        
        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = new Numbers
                        ("" + (i+1), 
                        (int)(Math.random() * 0 + 5000),
                        (int)(Math.random() * 0 + 5000)
                        );
        
            System.out.println(myNumbers[i]);
        }
        }
        
    }
    

