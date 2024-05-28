/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulandoDatas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author queir
 */
public class AppCurrencyFormat {
    public static void main(String[] args) {
        
        Locale locale1 = new Locale("pt", "BR");
        Locale locale2 = new Locale("pt", "PT");
        Locale locale3 = new Locale("en", "US");

        // NumberFormat -> utilizada para formatar e analisar números. 
        //Ela pode ser usada para formatar números, moedas e percentuais de acordo com as convenções locais.
        NumberFormat nb1 = NumberFormat.getCurrencyInstance(locale1);
        NumberFormat nb2 = NumberFormat.getCurrencyInstance(locale2);
        NumberFormat nb3 = NumberFormat.getCurrencyInstance(locale3);

        Double valor = 10_045.5487;

        System.out.println(nb1.format(valor));//R$ 10.045,55
        System.out.println(nb2.format(valor));//10 045,55 €
        System.out.println(nb3.format(valor));//$10,045.55


        //converter modeda para numeral
        try {
            Number numeroConvertido = nb1.parse("R$ 10.045,55");
            System.out.println(numeroConvertido.doubleValue());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
