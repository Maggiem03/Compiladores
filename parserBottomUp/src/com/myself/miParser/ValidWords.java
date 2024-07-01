package com.myself.miParser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidWords {
    private Set<String> validNombres;
    private Set<String> validAdjetivos;
    private Set<String> validPronombres;
    private Set<String> validVerbos;
    private Set<String> validPreposiciones;

    public ValidWords() {
        initializeValidWords();
    }

    private void initializeValidWords() {
        validNombres = new HashSet<>(Arrays.asList("Juan", "Maria", "perro", "gato"));
        validAdjetivos = new HashSet<>(Arrays.asList("grande", "pequeño", "rojo", "azul"));
        validPronombres = new HashSet<>(Arrays.asList("yo", "tú", "él", "ella", "nosotros"));
        validVerbos = new HashSet<>(Arrays.asList("corre", "come", "duerme"));
        validPreposiciones = new HashSet<>(Arrays.asList("en", "con"));
    }

    public Set<String> getValidNombres() {
        return validNombres;
    }

    public Set<String> getValidAdjetivos() {
        return validAdjetivos;
    }

    public Set<String> getValidPronombres() {
        return validPronombres;
    }

    public Set<String> getValidVerbos() {
        return validVerbos;
    }

    public Set<String> getValidPreposiciones() {
        return validPreposiciones;
    }
}
