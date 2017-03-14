package utp0001;
public class PacmanUnyu {
    private int x,y;
    private int counter=0;
    int i,j;
   
   public void setAwal(){
      this.x = 1;
       this.y = 1;
   }
   public void setNaik(){
       i=y;
       i--;
       if (i == 0 || i == 9 || x == 0 || x == 9 ||
                            i == 2 && x == 1 || i == 2 && x == 5 ||
                            i == 2 && x == 6 || i == 2 && x == 7 ||
                            i == 2 && x == 8 || i == 4 && x == 1 ||
                            i == 4 && x == 9 || i == 5 && x == 5 ||
                            i == 5 && x == 6 || i == 5 && x == 7 ||
                            i == 5 && x == 8 || i == 5 && x == 9 ){
       i++;
      }
      else {
        y--;
        counter++;
      }
   }
   public void setTurun() {
       i=y;
       i++;
       if (i == 0 || i == 9 || x == 0 || x == 9 ||
                            i == 2 && x == 1 || i == 2 && x == 5 ||
                            i == 2 && x == 6 || i == 2 && x == 7 ||
                            i == 2 && x == 8 || i == 4 && x == 1 ||
                            i == 4 && x == 9 || i == 5 && x == 5 ||
                            i == 5 && x == 6 || i == 5 && x == 7 ||
                            i == 5 && x == 8 || i == 5 && x == 9 ){
       i--;
       }
       else {
        y++;
        counter++;
      }
    }
   public void setKiri() {
       j=x;
       j--;
       if (y == 0 || y == 9 || j == 0 || j == 9 ||
                            y == 2 && j == 1 || y == 2 && j == 5 ||
                            y == 2 && j == 6 || y == 2 && j == 7 ||
                            y == 2 && j == 8 || y == 4 && j == 1 ||
                            y == 4 && j == 9 || y == 5 && j == 5 ||
                            y == 5 && j == 6 || y == 5 && j == 7 ||
                            y == 5 && j == 8 || y == 5 && j == 9 ){
       j++;
      }
      else {
        x--;
        counter++;
      }
    }

    public void setKanan() {
       j=x;
       j++;
       if (y == 0 || y == 9 || j == 0 || j == 9 ||
                            y == 2 && j == 1 || y == 2 && j == 5 ||
                            y == 2 && j == 6 || y == 2 && j == 7 ||
                            y == 2 && j == 8 || y == 4 && j == 1 ||
                            y == 4 && j == 9 || y == 5 && j == 5 ||
                            y == 5 && j == 6 || y == 5 && j == 7 ||
                            y == 5 && j == 8 || y == 5 && j == 9 ){
       j--;
      }
      else {
        x++;
        counter++;
      }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getCounter(){
        return counter;
    }
}
