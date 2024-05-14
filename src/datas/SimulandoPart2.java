/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author queir
 */
public class SimulandoPart2 {
    public static void main(String[] args) throws ParseException {
        // exemplos muito bons para usar em sistema de contas parceladas
        
        Calendar calendar=Calendar.getInstance(); // pegando a data atual
        
        // Simular que data vem no banco de dados , colocando em mente que data pode vim em formato String
        
        calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2024")); // definindo uma data qualquer
         
        calendar.add(Calendar.DAY_OF_MONTH, 5); // adicionando 5 dias a minha data atual que era 10
        
        System.out.println("Somando dia do mÊs " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())); // apenas formatando
        
        calendar.add(Calendar.MONTH, 1); // somando 1 mês a mais
        
        System.out.println("Somando um mês " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())); // apenas formatando
        
        calendar.add(Calendar.YEAR, 1); // somando 1 ano a mais
        System.out.println("Somando um ano a mais " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())); // apenas formatando
    }
    
}
