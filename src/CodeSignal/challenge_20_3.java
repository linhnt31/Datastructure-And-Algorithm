/*
 * I'm learning DataStructure and Algorithm
 * 2019
 */
package CodeSignal;

/**
 *
 * @author Linh Nguyen Thanh
 * link problem: https://app.codesignal.com/challenge/tG4SS7yiTmfogpwY5
 */
public class challenge_20_3 {
    private boolean arePrizesOK(int first, int second, int third) {
        return !(first < second || second < third);
    }

}
