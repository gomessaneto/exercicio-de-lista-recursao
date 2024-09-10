package listaDuplamenteEncadeada;

public class Principal {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();

        // método adiciona
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);
        System.out.println("Após adicionar elementos: " + lista);

        // método add inicio
        lista.adicionaInicio(5);
        System.out.println("Após adicionar no início: " + lista);

        // método add em posição específica
        lista.adiciona(2, 15);
        System.out.println("Após adicionar na posição 2: " + lista);

        // método remove no inicio
        lista.removeInicio();
        System.out.println("Após remover do início: " + lista);

        // método remove no final
        lista.removeFinal();
        System.out.println("Após remover do final: " + lista);

        // método remove em posição específica
        lista.remove(1);
        System.out.println("Após remover da posição 1: " + lista);

        //  método de busca por posicao
        int elemento = lista.buscaPorPosicao(1);
        System.out.println("Elemento na posição 1: " + elemento);

        //  método busca
        int posicao = lista.busca(20);
        System.out.println("Posição do elemento 20: " + posicao);

        // método inverte
        lista.inverte();
        System.out.println("Após inverter a lista: " + lista);

        //  método limpa
        lista.limpa();
        System.out.println("Após limpar a lista: " + lista);
    }
}