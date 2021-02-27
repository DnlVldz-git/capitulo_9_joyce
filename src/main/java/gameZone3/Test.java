/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone3;

/**
 *
 * @author dani
 */
public class Test {

    public static void main(String[] args) {
        FullDeck2 f = new FullDeck2();
        int g_j = 0, g_c = 0, e = 0;

        f.arrayAleatorio();

        for (int i = 0; i < 26; i++) {
            int n = f.tomarCarta1(i);
            int n2 = f.tomarCarta2(i + 26);
            if (n > n2) {
                System.out.println("Gano el jugador");
                g_j++;
            } else if (n < n2) {
                System.out.println("Gano la computadora");
                g_c++;
            } else {
                System.out.println("empate");
                e++;
            }

        }

        System.out.println("Victorias jugador: " + g_j);
        System.out.println("Victorias computadora: " + g_c);
        System.out.println("Empates: " + e);
    }
}

