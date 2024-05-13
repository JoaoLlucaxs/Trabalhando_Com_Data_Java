/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datas;

import java.util.Date;

/**
 *
 * @author queir
 */
public class Datas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NOTE QUE ESTÃO DEPRECIADAS DEVIDO A MUDANCA PARA CALENDAR
        Date data=new Date();
        
        System.out.println("DATA EM MILESEGUNDOS " + data.getTime());
        
        System.out.println("DIA DO MES " + data.getDate());
        
        System.out.println("DIA DA SEMANA " + data.getDay());
        
        System.out.println("HORA DO DIA " + data.getHours());
        
        System.out.println("MINUTO DA HORA " + data.getMinutes());
        
        System.out.println("SEGUNDOS " + data.getSeconds());
        
        System.out.println("ANO " + (data.getYear() + 1900)); // COMO BASE O ANO DE 1900

    }
    
}
