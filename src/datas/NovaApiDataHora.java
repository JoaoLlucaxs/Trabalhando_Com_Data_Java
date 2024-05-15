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
public class NovaApiDataHora {
    public static void main(String[] args) {
        // Nova Api de data a partir do Java 8
        LocalDate dataAtual=LocalDate.now();
        
        System.out.println("Data atual " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        LocalTime horaAtual=LocalTime.now();
        System.out.println("Hora atual " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));
        
        LocalDateTime dataAtualHoraAtual=LocalDateTime.now();
        System.out.println("Hora e data atual " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
    }
}
