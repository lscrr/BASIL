/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basil;

/**
 *
 * @author titou
 */
public class Cellule {
    Carte CarteCourante;
    boolean Cartes;
    boolean Joker;
    boolean JokPasNul;
    boolean JokNul;
    public Cellule (){
        CarteCourante= null;
        Joker = false;
        JokPasNul=false;
        JokNul= false;
    }
    public boolean affecterCarte(Carte c){
        if (CarteCourante != null){
            CarteCourante =c;
            return true;
        } else{
            return false;
        }
    }
    public boolean PrésenceCarte(){
        if (Cartes == true){
            return true;
        }else{
            return false;
        }
    }
    public boolean présenceJoker(){
         if (Joker  == true){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean présenceJokNul(){
         if (JokNul == true){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean présenceJokPasNul(){
        if (JokPasNul == true){
            return true;
        }else{
            return false;
        } 
    }
    
    public void retournerCarte (int x, int y ){
        
    }
    
    public String lireImage(){
        
    }
}

