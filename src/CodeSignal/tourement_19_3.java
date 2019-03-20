package CodeSignal;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Linh Nguyen Thanh
 */
/*
-problem link: https://app.codesignal.com/tournaments/sPmGZc7HTgLYfDyGp/D
*/
public class tourement_19_3 {
    private int squareDigitsSequence(int a0) {

        int cur = a0;
        Set<Integer> was = new HashSet<>();

        while (!was.contains(cur)) {
          was.add(cur);
          int next = 0;
          while (cur >= 0) {
            next += (cur % 10) * (cur % 10);
            cur /= 10;
          }
          cur = next;
        }

        return was.size() + 1;
    }
    
    private int power(int x, int exponent) {
        int result = 1;
        for (int count = 0; count < exponent; count++) {
          result *= x ;
        }
        return result;
      }
    
    //Not optimize
    private String stolenLunch(String note) {
        String[] numb = {"a","b","c","d","e","f","g","h","i","j"};
        StringBuilder s = new StringBuilder();

        for(int i = 0 ; i < note.length();i++){
            char t = note.charAt(i) ;
            boolean check = true;
            if(Character.isLetter(t)){
                for(int j = 0 ; j < numb.length ;j++){
                    if((t+"").equals(numb[j])){
                        s.append(j + "");
                        check = false;
                        break;
                    }
                }
            }
            if(check == false) continue;
            if(Character.isDigit(t)){
                s.append(numb[Integer.parseInt(t+"")]);
            }else{
                s.append(t +"");
            }
        }
        return s.toString();
    }


}
