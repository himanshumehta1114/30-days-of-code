import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int k=0;
        int count = 0;
        int array[] = new int[16];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++,count++){
                array[count] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            }
        }
        int max = array[0];
        for(k=0;k<16;k++){
            if(array[k] > max){
                max = array[k];
            }
        }
        System.out.print(max);
        
    }
}
