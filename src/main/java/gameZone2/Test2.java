/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

import java.util.Scanner;

/**
 *
 * @author daniX
 */
public class Test2 {

    public static void main(String[] args) {
        TicTacToe2 j = new TicTacToe2();
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca la ficha del jugador (X/O)");
        String ficha = leer.nextLine();
        j.setLetraJugador(ficha);
        j.imprimir();

        do {
            do {
                
                System.out.println("Introduzca su tiro del 1 al 9");
                int jugada = leer.nextInt();
                if (j.tiro(jugada)) {
                    break;
                }
                System.out.println("");
                j.imprimir();                
            } while (true);

            if (j.tiro_c()) {
                System.out.println("Empate");
                break;
            }
            j.imprimir();

        } while (!j.ganar());

    }
}

