package com.myself.miParser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class validWords{
    private Set<String> validNombres;
    private Set<String> validAdjetivos;
    private Set<String> validSujeto;

    public validWords(){
        initializeValidWords();
    }

    private void initializeValidWords(){
        validNombres = new HashSet<>(Arrays.asList("Juan", "Maria", "perro", "gato"));
        validAdjetivos = new HashSet<>(Arrays.asList("grande", "pequeño", "rojo", "azul"));
        validSujeto = new HashSet<>(Arrays.asList("yo", "tu", "el", "ella", "nosotros"));
    }

    public Set<String> getValidNombres(){
        return validNombres;
    }

    public Set<String> getValidAdjetivos(){
        return validAdjetivos;
    }

    public Set<String> getValidSujeto() {
        return validSujeto;
    }
}
