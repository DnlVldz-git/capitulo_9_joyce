/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

import java.util.Random;

/**
 *
 * @author dani
 */
public class Tablero {
    private String[] espacios;
    Random rnd = new Random();
    
    public Tablero(){
        this.espacios = new String[9];
        for (Integer i = 0; i < 9; i++) {
            this.espacios[i] = i.toString();
        }
    }
    
    public Boolean setEspacios(String jugada, int n){
        if (("X".equals(this.espacios[n]))||("O".equals(this.espacios[n]))) {            
            System.out.println("casilla ocupada");
            return false;
        }
        this.espacios[n] = jugada;
        
        return true;
    }
    
    public int espacioOcupado(int n){
        if ((this.espacios[n]=="X")||(this.espacios[n]=="O")) {
            return rnd.nextInt(8);
        }else{
            return n;
        }
    }
    
    public int posicionGanadora(){
        if ((this.espacios[0].equals(this.espacios[1]))) {
            return espacioOcupado(2);
        }else if ((this.espacios[1].equals(this.espacios[2]))) {
            return espacioOcupado(0);
        }else if ((this.espacios[3].equals(this.espacios[4]))) {
            return espacioOcupado(5);
        }else if ((this.espacios[4].equals(this.espacios[5]))) {
            return espacioOcupado(3);
        }else if ((this.espacios[6].equals(this.espacios[7]))) {
            return espacioOcupado(8);
        }else if ((this.espacios[8].equals(this.espacios[7]))) {
            return espacioOcupado(6);
        }else if ((this.espacios[0].equals(this.espacios[3]))) {
            return espacioOcupado(6);
        }else if ((this.espacios[1].equals(this.espacios[4]))) {
            return espacioOcupado(7);
        }else if ((this.espacios[2].equals(this.espacios[5]))) {
            return espacioOcupado(8);
        }else if ((this.espacios[6].equals(this.espacios[3]))) {
            return espacioOcupado(0);
        }else if ((this.espacios[7].equals(this.espacios[4]))) {
            return espacioOcupado(1);
        }else if ((this.espacios[8].equals(this.espacios[5]))) {
            return espacioOcupado(2);
        }else if ((this.espacios[0].equals(this.espacios[4]))) {
            return espacioOcupado(8);
        }else if ((this.espacios[8].equals(this.espacios[4]))) {
            return espacioOcupado(0);
        }else if ((this.espacios[2].equals(this.espacios[4]))) {
            return espacioOcupado(6);
        }else if ((this.espacios[6].equals(this.espacios[4]))) {
            return espacioOcupado(2);
        }else{
            return rnd.nextInt(8);
        }
    }
   
    
    public Boolean condicionesGanar(){        
        if ((this.espacios[0].equals(this.espacios[1]))&&(this.espacios[0].equals(this.espacios[2]))) {
            System.out.println("Ha ganado la ficha: "+this.espacios[0]);
            return true;
        }else if ((this.espacios[3].equals(this.espacios[4]))&&(this.espacios[3].equals(this.espacios[5]))) {
            System.out.println("Ha ganado la ficha: "+this.espacios[3]);
            return true;
        }else if ((this.espacios[6].equals(this.espacios[7]))&&(this.espacios[6].equals(this.espacios[8]))) {
            System.out.println("Ha ganado la ficha: "+this.espacios[6]);
            return true;
        }else if ((this.espacios[0].equals(this.espacios[3]))&&(this.espacios[0].equals(this.espacios[6]))) {
            System.out.println("Ha ganado la ficha: "+this.espacios[0]);
            return true;
        }else if ((this.espacios[1].equals(this.espacios[4]))&&(this.espacios[1].equals(this.espacios[7]))) {
            System.out.println("Ha ganado la ficha: "+this.espacios[1]);
            return true;
        }else if ((this.espacios[2].equals(this.espacios[5]))&&(this.espacios[2].equals(this.espacios[8]))) {
            System.out.println("Ha ganado la ficha: "+this.espacios[2]);
            return true;
        }else if ((this.espacios[0].equals(this.espacios[4]))&&(this.espacios[0].equals(this.espacios[8]))) {
            System.out.println("Ha ganado la ficha: "+this.espacios[0]);
            return true;
        }else if ((this.espacios[2].equals(this.espacios[4]))&&(this.espacios[2].equals(this.espacios[6]))) {
            System.out.println("Ha ganado la ficha: "+this.espacios[2]);
            return true;
        }
        
        
       return false;
    } 
    
    public void imprimirTablero(){
        System.out.println(this.espacios[0]+"|"+this.espacios[1]+"|"+this.espacios[2]);
        System.out.println("-----");
        System.out.println(this.espacios[3]+"|"+this.espacios[4]+"|"+this.espacios[5]);
        System.out.println("-----");
        System.out.println(this.espacios[6]+"|"+this.espacios[7]+"|"+this.espacios[8]);
    }
    
    
    
    
    
}
