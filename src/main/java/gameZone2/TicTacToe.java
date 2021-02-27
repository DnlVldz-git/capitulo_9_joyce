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
public class TicTacToe {
    private Tablero tablero;
    private String letra_j;
    private String letra_c;
    Random rnd = new Random();
    
    public TicTacToe(){        
        this.tablero = new Tablero();
    }
    
    public Boolean tiro(int num){
        return tablero.setEspacios(letra_j, num);
    }
    
    
    
    public Boolean tiro_c(){
        int num;
        int c=0;
        do {
            num = rnd.nextInt(9);           
            if (tablero.setEspacios(letra_c, num)) {
                break;
            }
            c++;
            if (c>=30) {
                System.out.println("Empate");
                return true;
            }
            
        } while (true);    
        return false;
    }
    
    
    
    public Boolean ganar(){
        return this.tablero.condicionesGanar();
    }
    
    public void imprimir(){
        this.tablero.imprimirTablero();
    }
    
    public void setLetraJugador(String letra){
        this.letra_j = letra;
        if ("X".equals(letra)) {
            this.letra_c = "O";
        }else if("O".equals(letra)){
            this.letra_c = "X";
        }
    }
    
    
}
