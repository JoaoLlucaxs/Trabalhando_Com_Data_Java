/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author queir
 */
public class ObjectPeriodo {
    public static void main(String[] args) {
        LocalDate dataAntiga=LocalDate.parse("2024, 04, 7");
        
         LocalDate dataNova=LocalDate.parse("2024, 05, 10");
         
         System.out.println("Data antiga posterior ? " + dataAntiga.isAfter(dataNova));
         
         System.out.println("Data antiga é anterior a nova ? " + dataAntiga.isBefore(dataNova));
         
          System.out.println("Datas são iguais ? " + dataAntiga.isEqual(dataNova));
          
         Period periodo=Period.between(dataAntiga, dataNova);
         System.out.println("Periodo de dias entre a data antiga e a data nova " + periodo.getDays());
         System.out.println("Periodo de meses entre a data antiga e a data nova " + periodo.getMonths());
         System.out.println("Periodo de anos entre a data antiga e a data nova " + periodo.getYears());
         
          System.out.println("Somente meses " + periodo.toTotalMonths());
         
         System.out.println("Periodo é ano " + periodo.getYears() + " meses " + periodo.getMonths() + " e dias " + periodo.getDays());
    }
}
