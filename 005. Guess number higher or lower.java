public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lo = 1, hi = n;
        while(lo <= hi){
            int num = lo + (hi - lo) / 2;
            int guess = guess(num);
            if(guess == -1) hi = num - 1;
            else if(guess == 1) lo = num + 1;
            else return num;
        }
        return -1;
    }
}
