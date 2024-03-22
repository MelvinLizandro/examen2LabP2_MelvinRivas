/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2labp2_melvinrivas;

import javax.swing.JLabel;

/**
 *
 * @author l3306
 */
public class Cronometro extends Thread{
    
    JLabel label ;
    int minutos;
    int segundos;

    public Cronometro(JLabel label, int minutos, int segundos) {
        this.label = label;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    @Override
    public void run(){
    
    boolean corriendo = true;
        while (corriendo == true) {            
            try{
            Thread.sleep(1000);
            segundos++;
            String segundos2 = String.valueOf(segundos );
            label.setText(minutos+" : "+segundos2);
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                    String minutos2 = String.valueOf(minutos);
                     label.setText(minutos+" : "+segundos2);
                }
            }catch (Exception e){
             
            }
        }
    
    }
            
    
}
