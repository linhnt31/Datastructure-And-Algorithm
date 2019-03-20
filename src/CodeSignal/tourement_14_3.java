package CodeSignal;

/**
 *
 * @author Linh Nguyen Thanh
 */

/*
-Link: https://app.codesignal.com/tournaments/E48qaTn588PuT68Fw
*/
public class tourement_14_3 {
    
    private int myMaxOfThree(int a, int b, int c) {
        if (a > b) {
          if (a > c) {
            return a;
          }
          return b;
        }
        if (b > c) {
          return b;
        }
        return c;
      }
    
    
    private String whoseMove(String lastPlayer, boolean win) {
        if (lastPlayer.equals("white")) {
          if (win) {
            return "white";
          }
          else {
            return "black";
          }
        }
        else {
          if (win) {
            return "black";
          }
          else {
            return "white";
          }
        }
    }

    
    private int[][] create2DArray(int[] lengths) {
        int[][] res = new int[lengths.length][];

        for(int i = 0 ; i < lengths.length; i++){
            res[i] = new int[lengths[i]];
            for(int j = 0;j < lengths[i]; j++){
                res[i][j] = j;
            }
        }
        return res;
    }

    
    private int parabole(int a, int b, int c, int x) {
        return a*x*x + b*x+c;
    }

}
