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
public class La_Carrera extends Thread{
    
    JProgressBar barra1;
    int velocidad1;
    int contador = 0;
    public La_Carrera(JProgressBar barra1, int velocidad1) {
        this.barra1 = barra1;
        this.velocidad1 = velocidad1;
    }

    

    
    @Override
    public void run(){
   
       boolean corriendo = true;
        
        while (corriendo == true) {            
            try{
            contador++;
            barra1.setValue(contador);
             Thread.sleep(velocidad1);
                if (contador == 100000) {
                    JOptionPane.showMessageDialog(barra1, "Carro 1 ah ganado");
                }
            }catch (Exception e){
            
            }   
        }
    
    }
   
}
