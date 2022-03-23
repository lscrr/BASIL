/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basil;

/**
 *
 * @author lisa et baptiste
 */
public class Partie {
    
    Joueur [] ListeJoueurs= new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    
    public Partie (Joueur J1, Joueur J2){
        ListeJoueurs[0] = J1;
        ListeJoueurs [1]= J2;
        
    }
    
    
    public void intialiserPartie(){
        grilleJeu= new Grille ();
        System.out.println(joueurCourant+ " Lancer le dé");
        joueurCourant.lancerDe();
    }
    
    public void débuterPartie(){
        boolean coupValide= false;
        
    }
}
