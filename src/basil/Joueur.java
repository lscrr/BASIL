/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basil;

/**
 *
 * @author lisa et baptiste
 */
public class Joueur {
    String Nom;
    int PointsCartes=0; // au départ le joueur a 0 point
  
    int valeurduDe;
    
    public Joueur (String unNom){
        Nom=unNom;
    }
    public int lancerDe(){  // permet de prendre en compte la valeur du dé
        valeurduDe=0;
        valeurduDe= (int)(1+ 6*Math.random());
        return valeurduDe;
    }
}
