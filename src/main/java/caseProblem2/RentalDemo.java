/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

/**
 *
 * @author dani
 */
import caseProblem1.Event;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RentalDemo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String n = "", phone = "";
        int op = 0;

        List<Rental> lista = new ArrayList<Rental>();

        Rental renta = null;

        for (int i = 0; i < 3; i++) {

            System.out.println("Renta: " + (i + 1));

            System.out.println("Introduzca el numero de contracto");
            n = leer.nextLine();

            if (((n.charAt(0) >= 65) && (n.charAt(0) <= 90)) && (n.length() == 4)) {
                if (((n.charAt(1) >= 48) && (n.charAt(1) <= 57))) {
                    if (((n.charAt(2) >= 48) && (n.charAt(2) <= 57))) {
                        if (((n.charAt(3) >= 48) && (n.charAt(3) <= 57))) {

                        } else {
                            n = "A000";
                        }
                    } else {
                        n = "A000";
                    }
                } else {
                    n = "A000";
                }
            } else {
                n = "A000";
            }
            n = n.toUpperCase();

            int m = 0;
            do {
                System.out.println("Introduzca el numero de minutos");
                m = leer.nextInt();
                if ((m >= 60) || (m <= 7200)) {
                    break;
                }
            } while (true);

            System.out.println("Intoduzca el número telefónico");
            phone = leer.nextLine();
            leer.nextLine();

            System.out.println("Introduzca el tipo de renta");
            op = leer.nextInt();
            leer.nextLine();

            renta = new Rental(m, n);
            renta.setEqui_type(op);
            renta.setPhoneNumber(phone);
            lista.add(renta);
        }

        do {

            System.out.println("Por qué elemento desea ordenar?");
            System.out.println("Numero de contrato = 1");
            System.out.println("Precio = 2");
            System.out.println("Tipo de equipo = 3");
            System.out.println("Salir = 4");
            int resp = leer.nextInt();

            if (resp == 4) {
                break;
            }

            renta.comparaciones(resp, renta);

            Collections.sort(lista);

            for (Rental rental : lista) {
                rental.toString();
            }

        } while (true);

    }
}
