/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basil;

/**
 *
 * @author lisa et baptiste
 */
import java.util.Scanner;

public class Partie {
    
    Joueur [] ListeJoueurs= new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    String carte1;
    String carte2;
    
    
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
        int col=-1;
        joueurCourant=ListeJoueurs[0];
        Scanner sc = new Scanner (System.in);
        // le joueur sélectionne la carte à retourner
        System.out.println ("Veuillez séléctionner des coordonnées"+ sc);
        col=sc.nextInt();
        carte1= joueurCourant.; // Retourner la première carte
        carte2= joueurCourant; // retourner la seconde carte
        if (carte1==carte2){
            
        }
            
       
    }
}
