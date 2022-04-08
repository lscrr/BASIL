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
    Grille carte1;
    Grille carte2;
    Grille grilleJeu= new Grille ();
    
    public Partie (Joueur J1, Joueur J2){
        ListeJoueurs[0] = J1;
        ListeJoueurs [1]= J2;
        
    }
    
    
    public void intialiserPartie(){
       
        System.out.println(joueurCourant+ " Lancer le dé");
        joueurCourant.lancerDe();
    }
    
    public void débuterPartie(){
        boolean coupValide= false;
        int col=-1;
        int lig=-1;
        int col2=-1;
        int lig2=-1;
        joueurCourant=ListeJoueurs[0];
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Scanner sc3 = new Scanner (System.in);
        Scanner sc4 = new Scanner (System.in);
        // le joueur sélectionne la carte à retourner
        System.out.println ("Veuillez séléctionner une colonne"+ sc1);
        System.out.println ("Veuillez sélectionner une ligne" + sc2);
        col=sc1.nextInt();
        lig= sc2.nextInt();
        carte1.RetournerCarte(col, lig);
        System.out.println("A présent vous allez choisir la deuxième carte");
        System.out.println ("Veuillez séléctionner une colonne"+ sc3);
        System.out.println ("Veuillez sélectionner une ligne" + sc4);
        col2=sc3.nextInt();
        lig2= sc4.nextInt();
        carte2.RetournerCarte(col2, lig2);

        if (carte1==carte2){
            
        }
            
        /**  Scanner sc = new Scanner (System.in);
        System.out.println("Veuillez sélectionner des coordonnées" + sc);
        coo=sc.nextInt();
        //if (coo ==null){
            System.out.println("Case vide: choissisez d'autres coordonnées");**/
    }
}
