/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basil;

/**
 *
 * @author titou
 */
public class Grille {
    Cellule CellulesJeu [][]=new Cellule[6][8];
    
    public Grille (){
        CellulesJeu = new Cellule [6][7];
        for (int i=0; i<=5; i++){
            for (int j=0; j<=7;j++){
                CellulesJeu[i][j]= new Cellule();
            }
        }
    }
    
    public boolean CelluleVide(int i, int j){
        if (CellulesJeu[i][j]==null){
            System.out.println("Veuillez sélectionner une autre carte");
        }
            return false;
    }
    
    public void RemplirGrille
}
