/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basil;

/**
 *
 * @author lisa et baptiste
 */
public class Basil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Joueur J1 = new Joueur ("Nom");
       Joueur J2 = new Joueur ("Nom2");
       
       
        Partie p= new Partie( J1, J2 );
        p.intialiserPartie();
        p.débuterPartie();
        
    }
    
    
}
