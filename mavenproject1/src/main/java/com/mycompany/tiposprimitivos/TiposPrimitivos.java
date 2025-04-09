/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author Victor Yudi Rossi Marimoto
 */

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Declaração de variáveis primitivas
        byte idadehumana = 25; // Guarda números relativamente pequenos
        short periodo = 2025; // Guarda números relativamente grandes em comparação ao byte
        int populacaoregional = 500000; // Guarda números inteiros
        long populacaoglobal = 8000000000L; // Requer o 'L' para números extenos
        
        float alturaEmMetros = 1.75f; // Requer 'f' no final para afirmar que é o float
        double PesoEmKg = 72.5; // Não requer F e é mais preciso
        char começo = 'J';  // Guarda apenas uma letra ou número
        boolean ligado = true; // Guarda falso ou verdadeiro
        
        // Demonstração dos valores
        System.out.println("Idade humana; " + idadehumana);
        System.out.println("Periodo; " + periodo);
        System.out.println("Populacao regional/ " + populacaoregional);
        System.out.println("Populacao Global: " + populacaoglobal);
        System.out.println("Altura Em Metros: " + alturaEmMetros + "M");
        System.out.println("Peso Em Kg: " + PesoEmKg + "Kg");
        System.out.println("Começo " + começo);
        System.out.println("Está Ligado? " + ligado);
        
    }
} 