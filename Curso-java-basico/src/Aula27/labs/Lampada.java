
package Aula27.labs;

public class Lampada {
    
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoluz;
    int garantiMeses;
    String[] tipos;
    boolean tipoAbajur;
    
    boolean ligada;
    
    void ligar(){
        ligada = true;
    }      
    void desligar(){
        ligada = false;   
    }
    
    void mostrarEstado(){
        if (ligada){
            System.out.println("Lampada esta ligada");
        } else {
            System.out.println("Lampada esta desligada");
        }
    }
    
    
    
