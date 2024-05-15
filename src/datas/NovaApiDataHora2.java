/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author queir
 */
public class NovaApiDataHora2 {
    public static void main(String[] args) {
        // Nova Api de data a partir do Java 8
        LocalDate localDate=LocalDate.now();
        System.out.println("Data atual " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
    System.out.println("Dia da semana " + localDate.getDayOfWeek().name());
      
    System.out.println("Dia do mês " + localDate.getDayOfMonth());
       
    System.out.println("Dia do ano " + localDate.getDayOfYear());
        
    System.out.println("Mês " + localDate.getMonth());
    
    System.out.println("Ano " + localDate.getYear());
    }
}
