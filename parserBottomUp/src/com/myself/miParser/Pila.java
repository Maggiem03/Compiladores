package com.myself.miParser;

import java.util.Stack;

public class Pila {
    private Stack<Symbol> pila;

    public Pila() {
        this.pila = new Stack<>();
    }

    public void push(Symbol symbol) {
        pila.push(symbol);
    }

    public Symbol pop() {
        return pila.pop();
    }

    public Symbol peek() {
        return pila.peek();
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public int size() {
        return pila.size();
    }

    // Método para vaciar la pila
    public void clear() {
        while (!pila.isEmpty()) {
            pila.pop();
        }
    }

    // Verificar si la pila está vacía al final
    public boolean isCleared() {
        return pila.isEmpty();
    }
}
