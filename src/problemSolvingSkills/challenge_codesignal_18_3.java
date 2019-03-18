package problemSolvingSkills;

/**
 *
 * @author Linh Nguyen Thanh
 */

/*
- Link problem: https://app.codesignal.com/challenge/psPwaweBhsAhGBPEK

*/
public class challenge_codesignal_18_3 {
    private static int cyclicString(String s) {
    for(int i = 1; i <= s.length();i++){
        String temp = s.substring(0, i);
        boolean check  = true;
        
        for(int j = 0 ; j < s.length();j++){
            if(s.charAt(j) != s.charAt(j % temp.length())){
                check = false;
                break;
            }
        }
        if(check){
            return i;
        }
    }
    return 0;
}

}
