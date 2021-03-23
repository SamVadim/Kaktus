package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            char s = args[0].charAt(0);

        } catch (IndexOutOfBoundsException q){
            throw new IllegalArgumentException("Аргумент не задан!");
        }

        String text = "";
        try (Scanner file = new Scanner(new FileReader(args[0]))) {
            while (file.hasNextLine())
                text += file.nextLine() + ' ';
//                System.out.println(file.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println(text);

        Boolean Probel = true;
        int slova = 0;

        for(int i = 0; i < text.length(); i++){

            if(Probel == true && text.charAt(i) != ' '){
                slova ++;
                Probel = false;
            }

            if(text.charAt(i) == ' '){
                Probel = true;
            }


        }

        System.out.println(slova);



    }
}
