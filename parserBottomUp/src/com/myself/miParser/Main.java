package com.myself.miParser;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //ingreso de enunciado
        String inputSentence = getInputSentence();
        //iniciarlizar parser
        parserBottomUp parser = new parserBottomUp(inputSentence);
        //analizar con el parser
        parser.analizer();
    }
    private static String getInputSentence(){
        //lectura del enunciado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el enunciado para identificar sus partes: ");
        return scanner.nextLine();
    }
}
