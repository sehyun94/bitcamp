package aaabbbb;

import java.util.StringTokenizer;

public class T1 {

    public static void main(String[] args) throws Exception {
        StringTokenizer st1 = new StringTokenizer("12 + 36 -8 / 2 = 44", "-=/+ ");
        
        while(st1.hasMoreTokens())
            System.out.print(st1.nextToken() + ' ');
        System.out.println();
        
        
        }

}
