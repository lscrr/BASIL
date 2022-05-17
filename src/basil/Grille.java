/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basil;

/**
 *
 * @author lisa et baptiste
 */


public class Grille {
    Carte CellulesJeu [][]=new Carte [8][6];
    Carte Carte;
    boolean Joker;
    boolean JokNul;
    boolean JokPasNul;
    String motif;
    
    
    //private final boolean [][] Grille;
    public Grille (){
        //Grille=new boolean [7][5];
        for (int i=0; i<=7; i++){
            for (int j=0; j<=5;j++){
                
                CellulesJeu[i][j]= new Carte();
            } 
        } 
        for (int x=0; x<=7; x++){
            for (int y=0; y<=5;y++){
                if (CellulesJeu[x][y].CarteVisible()== false){
                    CellulesJeu[x][y].motif="-";
                    
                } else {
                    CellulesJeu[0][0].motif = "A";
                    CellulesJeu[1][0].motif = "A";
                    CellulesJeu[2][0].motif = "B";
                    CellulesJeu[3][0].motif = "B";
                    CellulesJeu[4][0].motif = "C";
                    CellulesJeu[5][0].motif = "C";
                    CellulesJeu[6][0].motif = "D";
                    CellulesJeu[7][0].motif = "D";
                    CellulesJeu[0][1].motif = "E";
                    CellulesJeu[1][1].motif = "E";
                    CellulesJeu[2][1].motif = "F";
                    CellulesJeu[3][1].motif = "F";
                    CellulesJeu[4][1].motif = "G";
                    CellulesJeu[5][1].motif = "G";
                    CellulesJeu[6][1].motif = "H";
                    CellulesJeu[7][1].motif = "H";
                    CellulesJeu[0][2].motif = "I";
                    CellulesJeu[1][2].motif = "I";
                    CellulesJeu[2][2].motif = "J";
                    CellulesJeu[3][2].motif = "J";
                    CellulesJeu[4][2].motif = "K";
                    CellulesJeu[5][2].motif = "K";
                    CellulesJeu[6][2].motif = "L";
                    CellulesJeu[7][2].motif = "L";
                    CellulesJeu[0][3].motif = "M";
                    CellulesJeu[1][3].motif = "M";
                    CellulesJeu[2][3].motif = "N";
                    CellulesJeu[3][3].motif = "N";
                    CellulesJeu[4][3].motif = "O";
                    CellulesJeu[5][3].motif = "O";
                    CellulesJeu[6][3].motif = "P";
                    CellulesJeu[7][3].motif = "P";
                    CellulesJeu[0][4].motif = "Q";
                    CellulesJeu[1][4].motif = "Q";
                    CellulesJeu[2][4].motif = "R";
                    CellulesJeu[3][4].motif = "R";
                    CellulesJeu[4][4].motif = "S";
                    CellulesJeu[5][4].motif = "S";
                    CellulesJeu[6][4].motif = "T";
                    CellulesJeu[7][4].motif = "T";
                    CellulesJeu[0][5].motif = "U";
                    CellulesJeu[1][5].motif = "U";
                    CellulesJeu[2][5].motif = "V";
                    CellulesJeu[3][5].motif = "V";
                    CellulesJeu[4][5].motif = "W";
                    CellulesJeu[5][5].motif = "W";
                    CellulesJeu[6][5].motif = "X";
                    CellulesJeu[7][5].motif = "X";
    }
            }
        }
    }
        
    public boolean CelluleVide(int i, int j){
        if (CellulesJeu[i][j]==null){
            System.out.println("Veuillez sélectionner une autre case");
        }
            return false;
    }
    
    public boolean RemplirGrille(){
        for (int i=0; i<=5; i++){
            for (int j=0; j<= 7; j++){
                if (CellulesJeu[j][i] == null){ // si la cellule contient une carte alors on retourne vrai
                    return true;
                }
            // sinon on retourne faux
            }
            }
        return false;
    }
    
    public void afficherGrilleSurConsole (){
        for (int i=0; i<=5; i++){
            for (int j=0; j<= 7; j++){
                System.out.print(" " + CellulesJeu[j][i].lireMotif()+ " ");
            }System.out.println();
        }
    }
    public boolean présenceJoker(int i, int j){
        if (Joker==true){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean présenceJokNul(){
        if (JokNul==true){
            return true;
        }
        else{
            return false;
        }
    }
        
    public boolean présenceJokpasnul(){
        if (JokPasNul==true){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String RetournerCarteDeCoordonneesXY(int x, int y){
        //CellulesJeu[x][y].CarteVisible()=true;
            return CellulesJeu[x][y].lireMotif();
        }
        
}


            