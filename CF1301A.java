package Codeforces;

import java.util.Scanner;

public class CF1301A{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        for(int T=1; T<=tc; T++){
            String a = input.next(), b = input.next(), c = input.next();
            int len = a.length(),flag=0;
            for(int i=0; i<len; i++){
                if(b.charAt(i)==c.charAt(i) || a.charAt(i)==c.charAt(i)){
                    continue;
                }
                flag=1; 
                break;
            }
            if(flag==1){
                prln("NO");
            }
            else{
                prln("YES");
            }
        }
    }
    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
    static void pnt(Object anyObject){
        System.out.print(anyObject);
    }
}
