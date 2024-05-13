/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author queir
 */
public class Datas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // NOTE QUE ESTÃO DEPRECIADAS DEVIDO A MUDANCA PARA CALENDAR
        Date data=new Date();
        
        System.out.println("DATA EM MILESEGUNDOS " + data.getTime()); // RESPOSTA = 1715621340540
        
        System.out.println("DIA DO MES " + data.getDate()); 
        
        System.out.println("DIA DA SEMANA " + data.getDay());
        
        System.out.println("HORA DO DIA " + data.getHours());
        
        System.out.println("MINUTO DA HORA " + data.getMinutes());
        
        System.out.println("SEGUNDOS " + data.getSeconds());
        
        System.out.println("ANO " + (data.getYear() + 1900)); // COMO BASE O ANO DE 1900
        
        
        /*SIMPLE DATA FORMAT - BEM USADA*/
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data atual em formata padrão e string " + sdf.format(data));
        
        
        sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Data em formato para banco de dados " + sdf.format(data));
        
        System.out.println("Objeto date " + sdf.parse("1987-10-18")); // por ser objeto date pede para adiconar exception
    }
    
}
