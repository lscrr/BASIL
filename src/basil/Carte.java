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
    int nbdeCartes;
    int nbpoints =0;
    boolean etreJoker;
    boolean etreJokpasnul;
    boolean etreJoknul;
    
        
    public String lireMotif(){
        return motif;
    }
    
    public boolean CarteVisible(){
        if (visibilité==false){
            visibilité = false;
        }
        else{
            visibilité = true;
        }
        return visibilité; //on récupère l'état de visibilité de la carte
    }
    
    //public boolean RetournerLaCarteEnQuestion(){
        
    //}
    
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

