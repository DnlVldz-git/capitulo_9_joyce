/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Arbol {

    private Nodo raiz;
    private Nodo inicio;
    Scanner leer = new Scanner(System.in);

    public Arbol() {
        inicio = new Nodo();
        Nodo pregunta = new Nodo();
        inicio.setPregunta("El animal que estás pensando tiene piernas?");
        inicio.setIzq(null);        
        pregunta.setPregunta("Es un perro?");
        pregunta.setAnimal("perro");
        inicio.setDer(pregunta);
        raiz = inicio;
    }

    public void jugar() {
        char resp;
        do {
            Nodo aux = raiz;
            Nodo ant = aux;
            while (aux != null) {

                System.out.println("Responda con y/n");
                System.out.println(aux.getPregunta());
                char resp2 = leer.nextLine().charAt(0);

                if (resp2 == 'y') {
                    ant = aux;
                    aux = this.avanzarDer(aux);
                    if (aux == null) {
                        Nodo nuevo = new Nodo();
                        nuevo.setPregunta("");
                        ant.setDer(nuevo);
                        System.out.println("Yei, gané");

                    }
                } else if (resp2 == 'n') {
                    ant = aux;
                    aux = this.avanzarIzq(aux);
                    if (aux == null) {
                        System.out.println("Me rindo, cuál es el animal?");
                        String animal = leer.nextLine();
                        String oracion = ("Es un " + animal + "?");
                        Nodo nuevo = new Nodo();
                        nuevo.setPregunta(oracion);
                        nuevo.setAnimal(animal);
                        ant.setIzq(nuevo);
                        if ((aux == null) && (ant.getDer() != null)&&(ant!=raiz)) {
                            System.out.println("Dime una pregunta que sea sí para " + ant.getAnimal() + " y no para " + animal);
                            String nuevaOracion = leer.nextLine();
                            ant.getDer().setPregunta(ant.getPregunta());
                            ant.getDer().setAnimal(ant.getAnimal());
                            ant.setPregunta(nuevaOracion);
                            ant.getIzq().setAnimal(ant.getAnimal());
                            
                        }
                    }
                }

            }
            System.out.println("Desea seguir jugando? y/n");
            resp = leer.nextLine().charAt(0);

        } while (resp != 'n');

    }

    public Nodo avanzarDer(Nodo nodo) {
        return nodo.getDer();
    }

    public Nodo avanzarIzq(Nodo nodo) {
        return nodo.getIzq();
    }

    public void insertarDer(Nodo nodo, Nodo ant) {
        ant.setDer(nodo);
        nodo.setDer(null);
        nodo.setIzq(null);
    }

    public void insertarIzq(Nodo nodo, Nodo ant) {
        ant.setIzq(nodo);
        nodo.setDer(null);
        nodo.setIzq(null);
    }

}
