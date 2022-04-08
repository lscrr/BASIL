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
    Carte CellulesJeu [][]=new Carte [6][8];
    boolean Joker;
    boolean JokNul;
    boolean JokPasNul;

    
    public Grille (){
        CellulesJeu = new Carte [6][8];
        for (int i=0; i<=5; i++){
            for (int j=0; j<=7;j++){
                CellulesJeu[i][j]= new Carte();
            }
        }
    }
    
    public boolean CelluleVide(int i, int j){
        if (CellulesJeu[i][j]==null){
            System.out.println("Veuillez sélectionner une autre case");
        }
            return false;
    }
    
    public boolean RemplirGrille(int i, int j){
        if(CellulesJeu[i][j].CarteCourante== false){
                    return true;
                }
           return false;
            }
        
    

    
    public void afficherGrilleSurConsole (){
        for (int i=0; i<=6; i++){
            for (int j=0; j<= 7; j++){
                System.out.print(""+ CellulesJeu[i][j].lireMotif()+ "");
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
    
    public String RetournerCarte(int x, int y){
        CellulesJeu[x][y].CarteVisible();
        return CellulesJeu[x][y].lireMotif();
        } 
    }
}
/**  Scanner sc = new Scanner (System.in);
        System.out.println("Veuillez sélectionner des coordonnées" + sc);
        coo=sc.nextInt();
        //if (coo ==null){
            System.out.println("Case vide: choissisez d'autres coordonnées");
            