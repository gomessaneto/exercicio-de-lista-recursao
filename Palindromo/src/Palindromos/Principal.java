package Palindromos;

public class Principal {

	public static void main(String[] args) {
		        String teste1 = "A base do teto desaba";
		        String teste2 = "palindromo";
		
		        System.out.println(verificarPalindromo(teste1));
		        System.out.println(verificarPalindromo(teste2));
		}

	public static boolean verificarPalindromo (String palavra) {

        String formatada = palavra.replaceAll("\\s+", "").toLowerCase();
        
       
        Pilha pilha = new Pilha(formatada.length());
        
        
        for (int i=0; i<palavra.length(); i++){
    		pilha.empilhar(palavra.charAt(i));
    	}
    	
    	String palavraInversa = "";
    	while (!pilha.estaVazia()){
    		palavraInversa += pilha.desempilhar();
    	}
    	
    	if (palavraInversa.equalsIgnoreCase(palavra)){
    		return true;
    	}
    	
    	return false;
    }
	
	}
