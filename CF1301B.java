package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CF1301B {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for(int T=1; T<=tc; T++){
            int n = in.nextInt();
            int[] arr = new int[n+1];
            for(int i=1; i<=n; i++){
                arr[i] = in.nextInt();
            }
            int[] temp = new int[n+1];
            int idx = 1;
            for(int i=1; i<=n; i++){
                if(arr[i]!=-1){
                    if(i==1){
                        if(arr[i+1]==-1){
                            temp[idx++] = arr[i];
                        }
                    }
                    else if(i==n){
                        if(arr[i-1]==-1){
                            temp[idx++] = arr[i];
                        }
                    }
                    else{
                        if(arr[i+1]==-1 || arr[i-1]==-1){
                            temp[idx++] = arr[i];
                        }
                    }
                }
            }
            int snd;
            if(idx<2){
                if(idx==0){
                    snd = 0;
                }
                else snd = temp[1];
            }
            else{
                Arrays.sort(temp,1,idx);
                snd = (temp[1]+temp[idx-1])/2;
            }
            for(int i=1; i<=n; i++){
                if(arr[i]==-1){
                    arr[i] = snd;
                }
            }
            int fst = -1;
            for(int i=1; i<n; i++){
                int dif = Math.abs(arr[i]-arr[i+1]);
                fst = Math.max(fst,dif);
            }
            System.out.println(fst+" "+snd);
        }
    }
    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
    static void pnt(Object anyObject){
        System.out.print(anyObject);
    }
}
