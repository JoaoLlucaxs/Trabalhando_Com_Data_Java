/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author queir
 */
public class FaixaDeTempo2 {
    public static void main(String[] args) {
        
         LocalDate dataBase=LocalDate.parse("2024-04-10");
         
          // Brincando com geração de boletos
          
          for(int data=1; data <= 12; data ++){
            dataBase=dataBase.plusMonths(1);
            
              System.out.println("Data de vencimento do boleto " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
              + "do mês" + data);
          }
         
         System.out.println("Adiciona + 5 dias " + (dataBase=dataBase.plusDays(5)));
        
         System.out.println("Adiciona + 5 semanas " + (dataBase=dataBase.plusWeeks(5)));
         
         System.out.println("Adiciona + 5 anos " + (dataBase=dataBase.plusYears(5)));
         
          System.out.println("Adiciona + 5 meses " + (dataBase=dataBase.plusMonths(2)));
          
          System.out.println("Menos 1 ano " + (dataBase=dataBase.minusYears(1)));
          
          
         
    }
}
