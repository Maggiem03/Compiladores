package com.myself.miParser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidWords {
    private Set<String> validNombres;
    private Set<String> validAdjetivos;
    private Set<String> validSujeto;

    public ValidWords() {
        initializeValidWords();
    }

    private void initializeValidWords() {
        validNombres = new HashSet<>(Arrays.asList("Juan", "Maria", "perro", "gato"));
        validAdjetivos = new HashSet<>(Arrays.asList("grande", "pequeño", "rojo", "azul"));
        validSujeto = new HashSet<>(Arrays.asList("yo", "tu", "el", "ella", "nosotros"));
    }

    public Set<String> getValidNombres() {
        return validNombres;
    }

    public Set<String> getValidAdjetivos() {
        return validAdjetivos;
    }

    public Set<String> getValidSujeto() {
        return validSujeto;
    }
}
