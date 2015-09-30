/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht8;
import java.lang.Character;

/**
 *
 * @author diego_000
 */
public class Paciente implements Comparable {
    
    protected String nombre;
    protected String sintoma;
    protected char prior;
    
    public Paciente(String name, String sint, String pri){
        this.nombre = name;
        this.sintoma = sint;
        this.prior = pri.charAt(0);
    }
    
//    public Paciente(){
//        this.Paciente("John Doe", "Trauma", "A");
//    }
    public int compareTo(Paciente other){
        int num;
        char dif = other.getPrior();
        if(this.prior==dif){
            num=0;
        }
        else if(this.prior<dif){
            num=-1;
        }
        else{
            num=1;
        }
        return num;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    

    
    public String getSintoma(){
        return this.sintoma;
    }
    
    public Character getPrior(){
        return this.prior;
    }
    
    
    @Override
    public String toString(){
        String str = "";
        str+=nombre+", ";
        str+=sintoma+", ";
        str+=prior+"\n";
        return str;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
