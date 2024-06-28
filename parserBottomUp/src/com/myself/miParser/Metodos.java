package com.myself.miParser;

import java.util.Stack;

public class Metodos{

    class Symbol{
        private String type;
        private String value;

        public Symbol(String type, String value){
            this.type = type;
            this.value = value;
        }
        public String getType(){
            return type;
        }

        public String getValue(){
            return value;
        }
    }

    class Pila{
        private Stack<Symbol> pila;

        public Pila(){
            this.pila = new Stack<>();
        }

        public void push(Symbol symbol){
            pila.push(symbol); //
        }

        public Symbol pop(){
            return pila.pop(); //
        }

        public Symbol peek(){
            return pila.peek(); //
        }

        public boolean isEmpty(){
            return pila.isEmpty();
        }
    }
}
