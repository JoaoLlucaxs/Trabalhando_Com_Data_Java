/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datas;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author queir
 */
public class TempoProcesso {
    public static void main(String[] args) throws InterruptedException {
        Instant inicio=Instant.now();
        
        
        // É mais para saber quanto tempo leva um processo a ser executado
        
        Thread.sleep(2000); // Pode ser um processo com tempo qualquer que não conhecemos
        Instant iFinal=Instant.now();
        
        Duration duracao=Duration.between(inicio, iFinal);
        
        System.out.println("Duração em nano segundos " + duracao.toNanos());
        System.out.println("Duração em minutos " + duracao.toMinutes());
        System.out.println("Duração em horas " + duracao.toHours());
        System.out.println("Duração em mili segundos " + duracao.toMillis());

        
    }
}
