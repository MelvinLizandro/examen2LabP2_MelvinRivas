/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2labp2_melvinrivas;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author l3306
 */
public class La_Carrera2 extends Thread {
    
    JProgressBar barra2;
    int velocidad2;
    int contador = 0;

    public La_Carrera2(JProgressBar barra2, int velocidad2) {
        this.barra2 = barra2;
        this.velocidad2 = velocidad2;
    }
    
    @Override
    public void run(){
   
       boolean corriendo = true;
        
        while (corriendo == true) {            
            try{
            contador++;
            barra2.setValue(contador);
             Thread.sleep(velocidad2);
                if (contador == 100000) {
                    JOptionPane.showMessageDialog(barra2, "Carro 1 ah ganado");
                }
            }catch (Exception e){
            
            }   
        }
    
    }
   
    
}
