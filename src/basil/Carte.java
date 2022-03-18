/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basil;

/**
 *
 * @author titou
 */
public class Carte {
    String motif;
    boolean visibilité;
    int nbpoints;
    boolean etreJoker;
    boolean etreJokpasnul;
    boolean etreJoknul;
    
    
    public String lireMotif(){
        return motif;
    }
    
    public boolean RetournerCarte(){
        if (visibilité==false){
            visibilité = true;
        }else{
            visibilité = false;
        }
        return false;
    }
}

