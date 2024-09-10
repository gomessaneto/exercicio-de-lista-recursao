package decParaBi;

import java.util.Stack;

public class DecBi {

	public static void main(String[] args) {
		
		int binario = 10;
        int decimal = converterBinarioParaDecimal(binario);
        
        System.out.println("O número binário " + binario + " em decimal é: " + decimal);
    }
	

	public static int converterBinarioParaDecimal(int binario) {
        return converterBinarioParaDecimal(binario, 0);
    }
	
	
	public static int converterBinarioParaDecimal(int binario, int posicao) {
		
	        if (binario == 0) {
	            return 0;  
	        } else {

	            int ultimoDigito = binario % 10;
	            return ultimoDigito * (int) Math.pow(2, posicao) + converterBinarioParaDecimal(binario / 10, posicao + 1);
	        }
	    }
	
	
	
	}
