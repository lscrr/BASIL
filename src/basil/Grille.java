/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basil;

/**
 *
 * @author lisa et baptiste
 */
import java.util.Random;


public class Grille {
    Carte CellulesJeu [][]=new Carte [8][6];
    Carte Carte;
    boolean Joker;
    boolean JokNul;
    boolean JokPasNul;
    int etat;
    
    
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
                    etat=0;
                    
                } else {
                    
                    etat =1;
                   /** Random r = new Random();
                    String motif [] = {"A", "B","C","D","E","F","G","H","I","J", "K", "L" ,"M","N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "A", "B","C","D","E","F","G","H","I","J", "K", "L" ,"M","N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X" };
                    int n=r.nextInt(48);
                    
                    while (motif[n]=="0"){
                        n=r.nextInt(48);
                    }**/
                   String motif [] = {"A", "B","C","D","E","F","G","H","I","J", "K", "L" ,"M","N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "A", "B","C","D","E","F","G","H","I","J", "K", "L" ,"M","N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X" };
                    int n=tirage(motif);
                    CellulesJeu[0][0].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[1][0].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[2][0].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[3][0].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[4][0].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[5][0].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[6][0].motif =motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[7][0].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[0][1].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[1][1].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[2][1].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[3][1].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[4][1].motif = motif[n];
                    motif[n]="0";
                    
                    
                    CellulesJeu[5][1].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[6][1].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[7][1].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[0][2].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[1][2].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[2][2].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[3][2].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[4][2].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[5][2].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[6][2].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[7][2].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[0][3].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[1][3].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[2][3].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[3][3].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[4][3].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[5][3].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[6][3].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[7][3].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[0][4].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[1][4].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[2][4].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[3][4].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[4][4].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[5][4].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[6][4].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[7][4].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[0][5].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[1][5].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[2][5].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[3][5].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[4][5].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[5][5].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[6][5].motif = motif[n];
                    motif[n]="0";
                    
                    n=tirage(motif);
                    CellulesJeu[7][5].motif = motif[n];
                    motif[n]="0";
    }
            }
        }
    }
        public int tirage (String [] motif){
            
             Random r = new Random();
                    
                    int n=r.nextInt(48);
                    
                    while (motif[n]=="0"){
                        n=r.nextInt(48);
                    }
                    return n;
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
        System.out.println("affichage grille");
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
          String motif1;
          
        if (CellulesJeu[x][y].motif == "-"){   // si le motif de la cellule est "-"
            etat=1;  //alors son état est de 1
            CellulesJeu[x][y].CarteVisible();
            if (CellulesJeu[x][y].CarteVisible()== false){
                    CellulesJeu[x][y].motif=motif[];
            System.out.println(CellulesJeu[x][y].CarteVisible());
                
            
            //on récupère le motif se trouvant en x,y et on le place dans la grille
            
           
        }return CellulesJeu[x][y].lireMotif();         
        
}
}

            