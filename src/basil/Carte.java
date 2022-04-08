/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basil;

/**
 *
 * @author lisa et baptiste
 */
public class Carte {
    String motif;
    boolean visibilité;
    boolean CarteCourante;
    int nbpoints =0;
    boolean etreJoker;
    boolean etreJokpasnul;
    boolean etreJoknul;
    int nbdeCartes;
    
    
    public String lireMotif(){
        return motif;
    }
    
    public boolean CarteVisible(){
        if (visibilité==false){
            visibilité = true;
        }
        else{
            visibilité = false;
        }
        return false;
    }
    
    public boolean etreJoker(){
        nbdeCartes=2;
        if (etreJoker==true){
            nbpoints = 2;
        }
        return true;
    }
    public boolean etreJokPasNul(){
        nbdeCartes=2;
        if (etreJokpasnul==true){
            nbpoints=-1;
        }
        return true;
    }
    public boolean etreJokNul(){
        nbdeCartes=2;
        if (etreJoknul==true){
            nbpoints=-2;
        }
        return true;
    }
}

