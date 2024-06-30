package com.myself.miParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ingreso de enunciado
        String inputSentence = getInputSentence();
        // Inicializar parser
        parserBottomUp parser = new parserBottomUp(inputSentence);
        // Analizar con el parser
        parser.analizer();
    }

    private static String getInputSentence() {
        // Lectura del enunciado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el enunciado para identificar sus partes: ");
        return scanner.nextLine();
    }
}
