package task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;

        while (true) {

            key = reader.readLine();

            if ("user".equals(key)) {
                new User().doWork();
            } else if ("loser".equals(key)) {
                new Loser().doWork();
            } else {
                break;
            }
        }
    }
}
