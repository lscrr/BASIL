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
    int nbpoints =0;
    boolean CarteCourante;
    boolean etreJoker;
    boolean etreJokpasnul;
    boolean etreJoknul;
    int nbdeCartes;
    
    
    public String lireMotif(){
        return motif;
    }
    
    public boolean RetournerCarte(){
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
    public boolean etreJokpasnul(){
        nbdeCartes=2;
        if (etreJokpasnul==true){
            nbpoints=-1;
        }
        return true;
    }
    public boolean etreJoknul(){
        nbdeCartes=2;
        if (etreJoknul==true){
            nbpoints=-2;
        }
        return true;
    }
}

