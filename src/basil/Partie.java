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
    Carte carte1 = null;
    Carte carte2= null;
    Grille grilleJeu= new Grille ();
    
    public Partie (Joueur J1, Joueur J2){
        ListeJoueurs[0] = J1;
        ListeJoueurs [1]= J2;
        
    }
    
    public void intialiserPartie(){
        String d ;
        String c; 
       Scanner nom1 = new Scanner (System.in);
       System.out.println ("Joueur 1, entrez un nom ");
       d=nom1.nextLine();
  
       Scanner nom2= new Scanner (System.in);
       System.out.println ("Joueur 2, entrez un nom ");
       c=nom2.nextLine();
       
       grilleJeu.afficherGrilleSurConsole();
       grilleJeu.RemplirGrille();
    
           }
       //}
       
        //System.out.println(joueurCourant+ " Lancer le dé");
        //joueurCourant.lancerDe();
    //}
    
    public void débuterPartie(){
        
        boolean coupValide= false;
        int col=-1;
        int lig=-1;
        int col2=-1;
        int lig2=-1;
        Joueur ga;
        Joueur per;
        boolean jouer;
        
        //joueurCourant = ListeJoueurs[0];
        while (grilleJeu.RemplirGrille()==false){  // tant que la grille n'est pas vide
            
    
      // joueurCourant=ListeJoueurs[0];
        
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Scanner sc3 = new Scanner (System.in);
        Scanner sc4 = new Scanner (System.in);
        
        // le joueur sélectionne la carte à retourner
        
        System.out.println ("Veuillez séléctionner une colonne" );  // on prend en compte les coordonnées sélectionnées par le joueur 
        col=sc1.nextInt();
        
        System.out.println ("Veuillez sélectionner une ligne" );
        lig= sc2.nextInt();
        
        String motifcarte1 = grilleJeu.RetournerCarteDeCoordonneesXY(col, lig);  // motif de la carte 1 visible
        System.out.println("la carte a été retournée");
            
        System.out.println("A présent vous allez choisir la deuxième carte"); 
        
        
        System.out.println ("Veuillez séléctionner une colonne" + sc3); // on prend en compte les coordonnées sélectionnées par le joueur
        col2=sc3.nextInt();
        
        System.out.println ("Veuillez sélectionner une ligne" + sc4);
        lig2= sc4.nextInt();
        
        String motifcarte2 = grilleJeu.RetournerCarteDeCoordonneesXY(col2, lig2); // motif de la carte 2 visible 
        
      
        
        while (jouer = true){ 
            if (motifcarte1== motifcarte2){
                System.out.println("Félicitations vous avez trouvé la paire, vous gagnez 2 points!");
                joueurCourant.PointsCartes += 2;
                carte1 = null;   // la carte disparait 
                carte2= null;   // la carte disparait 
                jouer = true;
    
            // Comment faire en sorte que le joueur courant puisse jouer de nouveau ??????????????
            
            } else if (motifcarte1 != motifcarte2){
                System.out.println("Dommage!");
                joueurCourant.PointsCartes += 0; // le joueur prend 0 point
                motifcarte1 = grilleJeu.RetournerCarteDeCoordonneesXY(col, lig); // on retourne de nouveau la carte préalablement visible 
                motifcarte2= grilleJeu.RetournerCarteDeCoordonneesXY(col2, lig2);
                jouer = false;
        }
        } // fin du while sur jouer
        
        // place au joueur 
          if (joueurCourant == ListeJoueurs[0]){  // si le joueur courant est le J1
            joueurCourant = ListeJoueurs[1];      // alors on laisse la place au J2 qui deveint donc le nouveau joueur courant
        }else {
            joueurCourant= ListeJoueurs[0];  // sinon J1 reste le joueur courant
        }
          
    } // la grille est vide : on détermine le gagnant et le perdant (fin du while)
       
        if (ListeJoueurs[0].PointsCartes > ListeJoueurs[1].PointsCartes){ //si le nombre de point du J1 est supérieur à celui du J2
            ga= ListeJoueurs[0]; // alors le gagnant est J1
            per= ListeJoueurs[1]; // le perdant est J2
            System.out.println("Félicitations " + ga + " vous avez gagné!");
            System.out.println(per + " Ne voulez pas prendre votre revanche? ");
            
        }else if (ListeJoueurs[1].PointsCartes == ListeJoueurs[0].PointsCartes){ //si le nombre de point du J1 est ségal à celui du J2
            System.out.println ( "Egalité! ");
            
        }else{   //sinon le nombre de point du J1 est inférieur à celui du J2
            ga = ListeJoueurs[1]; // alors le gagnant est J2
            per = ListeJoueurs[0]; // le perdant est J1
            System.out.println("Félicitations " + ga + " vous avez gagné!");
            System.out.println(per + " Ne voulez pas prendre votre revanche? ");
        }
    }// fin de débuter Partie
}