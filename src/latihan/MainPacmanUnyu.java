package utp0001;
import java.util.Scanner;
public class MainPacmanUnyu {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        PacmanUnyu aa = new PacmanUnyu();
        int score = 0,stepLeft=20;
        String pilih;
        aa.setAwal();
        int pjg [][] = new int [10][10];
        //1 : pagar, 2 : makanan, 3 : pacman 
        pjg[1][4] = 2;
        pjg[4][4] = 2;
        pjg[4][5] = 2;
        pjg[7][2] = 2;
        pjg[7][3] = 2;
        pjg[8][4] = 2;
        
        do{
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                     if (pjg[i][j] != 2) {
                         pjg[i][j] = 0;
                        if (i == 0 || i == 9 || j == 0 || j == 9 ||
                            i == 2 && j == 1 || i == 2 && j == 5 ||
                            i == 2 && j == 6 || i == 2 && j == 7 ||
                            i == 2 && j == 8 || i == 4 && j == 1 ||
                            i == 4 && j == 9 || i == 5 && j == 5 ||
                            i == 5 && j == 6 || i == 5 && j == 7 ||
                            i == 5 && j == 8 || i == 5 && j == 9 ){
                            pjg[i][j] = 1;
                        }
                     }
               }
           }
            if ( pjg[aa.getY()][aa.getX()] == 2){
                 score = score + 1;
            }
            pjg[aa.getY()][aa.getX()] = 3;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (pjg[i][j] == 1) {
                        System.out.print("#");
                    } else if (pjg[i][j] == 0) {
                        System.out.print(" ");
                    } else if (pjg[i][j] == 2) {
                        System.out.print("@");
                    } else if (pjg[i][j] == 3) {
                        System.out.print("<");
                    }
                }
                System.out.println(" ");
            }
            stepLeft = stepLeft - 1;
            System.out.println("Step Left : "+(20-aa.getCounter()));
            System.out.println("Score : "+score);
            System.out.print("enter move (w, a, s, d, and q for quit)>> ");
            pilih = in.nextLine();
            System.out.println("");
            if ("w".equals(pilih)){
                aa.setNaik();
                if (aa.getY() == 0) {
                       aa.setTurun();
                }
                else if (pjg[aa.getY()][aa.getX()] == 1) {
                       aa.setTurun();
                }
            }
            else if ("a".equals(pilih)){
                 aa.setKiri();
                 if (aa.getX() == 0) {
                        aa.setKanan();
                 }
                 else if (pjg[aa.getY()][aa.getX()] == 1) {
                        aa.setKanan();
                 }
            }
            else if ("s".equals(pilih)){
                    aa.setTurun();
                    if (aa.getY() == 9) {
                        aa.setNaik();
                    }
                    else if (pjg[aa.getY()][aa.getX()] == 1) {
                        aa.setNaik();
                    }
            }
            else if ("d".equals(pilih)){
                    aa.setKanan();
                    if (aa.getX() == 9) {
                        aa.setKiri();
                    }
                    else if (pjg[aa.getY()][aa.getX()] == 1) {
                        aa.setKiri();
                    }
            }
            //stepLeft = stepLeft - 1;
            //System.out.println("Step Left : "+(20-aa.getCounter()));
            //System.out.println("Score : "+score);
            if (score==6){
                System.out.println("YOU WIN");
                System.exit(0);
            }
}while(aa.getCounter()<=20);
        if (score == 6){
            System.out.println("YOU WIN");
        }
        else {
            System.out.println("GAME OVER");
        }
}
}
