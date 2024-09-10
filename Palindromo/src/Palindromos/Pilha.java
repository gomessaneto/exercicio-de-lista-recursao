package Palindromos;
class Pilha {
    private char[] elementos;
    private int topo;


    public Pilha(int capacidade) {
        elementos = new char[capacidade];
        topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }
    
    public boolean estaCheia() {
        return topo == elementos.length - 1;
    }

    public void empilhar(char elemento) {
        if (!estaCheia()) {
            topo++;
            elementos[topo] = elemento;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    public char desempilhar() {
        if (!estaVazia()) {
            char elemento = elementos[topo];
            topo--;
            return elemento;
        } else {
            System.out.println("Pilha vazia");
            return '\0';  // Retorna um caractere nulo caso a pilha esteja vazia
        }
    }
}