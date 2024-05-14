/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author queir
 */
public class FaixaDeTempo {
    public static void main(String[] args) throws ParseException {
        // exemplo saber quantos dias existem em uma faixa de data (periodo de data)
        // quantos dias está vencido uma conta
        
         // Exemplo saber quantos dias está atrasado um pagamento exemplo já a 7 dias , muito usado , ai manda uma mensagem para pessoa
        long dias= ChronoUnit.DAYS.between(LocalDate.parse("2024-02-01"),LocalDate.now()); // total de dias de uma data até hoje
        System.out.println("Possue " + dias + " entre as faixas das datas");
        
        // pode varias, pode verificar total de meses entre os dias e etc
        
       
    }
}
