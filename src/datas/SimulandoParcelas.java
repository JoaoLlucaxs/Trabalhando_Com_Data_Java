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
public class SimulandoParcelas {
    public static void main(String[] args) throws ParseException {
        // geração de parcela. como pegar uma data e apartir dela gerar 10 datas de vencimentos ou menos
        // exemplo gerar 12 parcelas de boleto vencimento
        Date dataInicial= new SimpleDateFormat("dd/MM/yyyy").parse("14/05/2024"); // data que a pessoa fez a compra
        
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(dataInicial);
        
        for(int parcela=1; parcela <= 12; parcela++){ // parcelou em 12 vezes
            calendar.add(Calendar.MONTH, 1);
            System.out.println("Parcela de numero " + parcela + " vencimento é em " + new SimpleDateFormat("dd/MM/yyyy")
            .format(calendar.getTime()));
        }
    }
}
