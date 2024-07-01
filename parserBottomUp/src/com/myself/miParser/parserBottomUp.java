package com.myself.miParser;

import java.util.Stack;

public class parserBottomUp {
    private Pila pila;
    private String[] words;
    private ValidWords validWords;

    public parserBottomUp(String entrada) {
        this.pila = new Pila();
        this.words = entrada.split("\\s+"); // Divide el enunciado en palabras
        this.validWords = new ValidWords();
    }

    public void analizer() {
        // Inicializar pila con símbolos
        pila.push(new Symbol("enunciado", null));

        // Procesar cada palabra de la entrada
        for (String word : words) {
            // Buscar producción en la tabla de análisis sintáctico
            Symbol cimaPila = pila.peek();
            String produccion = buscarProduccion(cimaPila.getType(), word);

            if (produccion != null) {
                // Eliminar no terminal de la pila
                pila.pop();

                // Agregar símbolos de la producción a la pila en orden inverso
                for (int j = produccion.length() - 1; j >= 0; j--) {
                    pila.push(new Symbol(Character.toString(produccion.charAt(j)), null));
                }
            } else if (cimaPila.getType().equals("nombre") || cimaPila.getType().equals("adjetivo") || cimaPila.getType().equals("verbo") || cimaPila.getType().equals("objetoDirecto") || cimaPila.getType().equals("objetoIndirecto") || cimaPila.getType().equals("preposición")) {
                // Reducir: eliminar no terminal y reemplazar por terminal
                pila.pop();
                Symbol simbolo = new Symbol(cimaPila.getType(), word);
                System.out.println("Parte del enunciado: " + simbolo.getValue() + " - Tipo: " + simbolo.getType());
                pila.push(simbolo);
            } else {
                // Error sintáctico
                System.err.println("Error sintáctico: " + word + " no esperado en " + cimaPila.getType());
                break;
            }
        }

        // Verificar si la pila solo contiene el símbolo inicial al final
        if (pila.size() == 1 && pila.peek().getType().equals("enunciado")) {
            System.out.println("Análisis exitoso: Partes del enunciado identificadas");
        } else {
            System.err.println("Error sintáctico: pila no vacía al final");
        }

        // Vaciar la pila al final del análisis
        pila.clear();
        if (pila.isCleared()) {
            System.out.println("La pila se ha vaciado correctamente.");
        } else {
            System.err.println("Error: la pila no se vació correctamente.");
        }
    }

    private String buscarProduccion(String noTerminal, String simboloEntrada) {
        switch (noTerminal) {
            case "enunciado":
                return "sujeto predicado";
            case "sujeto":
                if (validWords.getValidPronombres().contains(simboloEntrada)) {
                    return "pronombre nombre";
                } else if (validWords.getValidNombres().contains(simboloEntrada)) {
                    return "nombre";
                } else {
                    return null;
                }
            case "pronombre":
                if (validWords.getValidNombres().contains(simboloEntrada)) {
                    return "nombre";
                } else {
                    return null;
                }
            case "nombre":
                if (validWords.getValidNombres().contains(simboloEntrada)) {
                    return simboloEntrada;
                } else {
                    return null;
                }
            case "adjetivo":
                if (validWords.getValidAdjetivos().contains(simboloEntrada)) {
                    return simboloEntrada;
                } else {
                    return null;
                }
            case "verbo":
                if (validWords.getValidVerbos().contains(simboloEntrada)) {
                    return simboloEntrada;
                } else {
                    return null;
                }
            case "preposición":
                if (validWords.getValidPreposiciones().contains(simboloEntrada)) {
                    return "preposición nombre";
                } else {
                    return null;
                }
            default:
                return null;
        }
    }
}
