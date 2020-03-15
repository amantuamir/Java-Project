package code;

import java.util.Scanner;

/**
 *
 * @author Amantu Amir
 */
public class CF733A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        s = InsertFunc(s);
        int len = s.length();
        int res = -1, cnt = 1;
        for(int i=0; i<len; i++){
            if(isVowel(s.charAt(i)) == true){
                cnt = 1;
            }
            else{
                cnt++;
            }
            res = Math.max(res, cnt);
        }
        prln(res);
    }
    
    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
    static void pr(Object anyObject){
        System.out.print(anyObject);
    }
    static void nl(){
        System.out.print("\n");
    }
    
    static String InsertFunc(String s){
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb.insert(len, 'A');
        return sb.toString();
    }
    
    static boolean isVowel(char ch){
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y'){
            return true;
        }
        else{
            return false;
        }
    }
}
