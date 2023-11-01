package com.virtualmind;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean check = checkWords("kubernetes", "neteskuber");
        System.out.println(check);
    }

    public static boolean checkWords(String first, String second){
        int lenght1 = first.length();
        int lenght2 = second.length();

        if(lenght1 != lenght2) {
            return false;
        }

        int positions = 0;
        for(int i=0; i<lenght1; i++){
             positions = i%lenght1;
             if(positions<0){
                 positions = lenght1 + positions;
             }
             String rotatedWord = first.substring(lenght1-positions)+first.substring(0, lenght1 - positions);

            System.out.println("First word: "+ first + " - Rotated word: "+rotatedWord);
             if(first.equals(rotatedWord)){
                 System.out.println("Found it! F:" + first + " - S: " + second);
                 return true;
             }
        }

        return false;
    }
}
