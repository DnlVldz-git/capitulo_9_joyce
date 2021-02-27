/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class RockPaperScissors3 {

    public static void main(String[] args) {

        Computadora comp = new Computadora();

        Scanner leer = new Scanner(System.in);
        String n_j;
        
        
        for (int i = 0; i < 10; i++) {

            do {
                System.out.println("Introduzca su jugada:  roca, papel, tijeras");
                n_j = leer.nextLine();
                if ((n_j.charAt(0) == 'r') && (n_j.charAt(1) == 'o') || (n_j.charAt(0) == 'p') && (n_j.charAt(1) == 'a') || (n_j.charAt(0) == 't') && (n_j.charAt(1) == 'i')) {
                    break;
                }
            } while (true);

            int n = 0;

            if ((n_j == "roca") || (n_j == "ROCA") || (n_j == "Roca") || ((n_j.charAt(0) == 'r') && (n_j.charAt(1) == 'o'))) {
                n = 1;
            } else if ((n_j == "papel") || (n_j == "PAPEL") || (n_j == "Papel") || ((n_j.charAt(0) == 'p') && (n_j.charAt(1) == 'a'))) {
                n = 2;
            } else if ((n_j == "tijeras") || (n_j == "TIJERAS") || (n_j == "Roca") || ((n_j.charAt(0) == 't') && (n_j.charAt(1) == 'i'))) {
                n = 3;
            }

            System.out.println(comp);

            comp.juego(n);
            
        }
        
        comp.mostrarMarcador();
        
    }
}

