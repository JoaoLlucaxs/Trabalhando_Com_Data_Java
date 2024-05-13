/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author queir
 */
public class SimulandoDatas {
    public static void main(String[] args) throws ParseException {
        // VAMOS SUPOR QUE O BOLETO PASSOU DA DATA DE VENCIMENTO
        
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        
        Date dataVencimentoBoleto=sdf.parse("14/05/2024");
        
        Date dataAtualHoje=sdf.parse("13/05/2024");
        
        // After - se a data 1 é maior que data 2
        // Before se a data 1 é menor que data 2
        if(dataVencimentoBoleto.after(dataAtualHoje)){ /*Posterior ou maior ou depois da data atual*/
            System.out.println("Boleto ainda não venceu!");
        }else{
            System.out.println("Boleto vencido!");
        }
    }
}
