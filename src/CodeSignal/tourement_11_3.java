/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeSignal;

/**
 *
 * @author silverbullet
 */
public class tourement_11_3 {
    
    private int rightmostRoundNumber(int[] inputArray)    {
        int ans = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 10 == 0) {
            ans = i;
        }
  }

  return inputArray[ans];
    } 
    
    
    
    
    private int candles(int candlesNumber, int makeNew) {
        int burned = 0;
        int leftovers = 0;
        while (candlesNumber > 0) {
          burned += candlesNumber;
          leftovers += candlesNumber;
          candlesNumber = leftovers / makeNew;
          leftovers %= makeNew;
        }
        return burned;
      }
    
    
    private int deleteDigit(int n) {
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n;i*=10){
            max = Math.max(max, (n/i/10)*i + n % i);
        }
        return max;
    }
    
    
    private boolean isPerfectScore(boolean ans1, boolean ans2, boolean ans3) {
        if(ans1 == false || ans2 == false || ans3 == false) return false;
        return true;
    }

    
    private boolean checkFactorial(int n) {
    if(n <= 2) return true;
    
    int i = 1;
    int res = 1;
    while(res <= n){
        if(res == n){
            return true;
        }
        
        res *= i;
        i += 1;
    }
    return false;
}

}
