package exec2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner escreva = new Scanner(System.in);
	    int vet[] = new int[10];
	    int maior = vet[0], menor = vet[0];
	    int contMaior=0, contMenor=0;
	    
	    for(int i=0; i < vet.length; i++) {
	    	System.out.print("Digite o "+ (i+1) +"º numero: ");
	    	vet[i] = escreva.nextInt();
	    	System.out.println();
	    }
	    
	    bubbleSort(vet);
	    
	    System.out.println("Vetor Ordenado: ");
	    for(int i=0; i < vet.length; i++) {
	    	System.out.println(vet[i]);
	    	
	    	if(vet[i] > maior)
	    		maior = vet[i];
	    	
	    	if(vet[i] < menor)
	    		menor = vet[i];
	    }
	    
	    for(int i=0; i < vet.length; i++) {    	
	    	if(vet[i] == maior)
	    		contMaior++;
	    	
	    	if(vet[i] == menor)
	    		contMenor++;
	    }
	    
	    System.out.println("Maior número: " + maior);
	    System.out.println("Número de ocorrências: " + contMaior);
	    System.out.println("Menor número: " + menor);
	    System.out.println("Número de ocorrências: " + contMenor);
	    
	    escreva.close();
	}
	
	public static void bubbleSort (int vetor[]) {
	    int i, j,n, aux;
	    
	    n = vetor.length;

	    for (i=1; i < n; i++) {
	        for (j=0; j < n-1; j++) {
	            if (vetor[j] > vetor[j+1]) {
	                aux = vetor[j];
	                vetor[j] = vetor[j+1];
	                vetor[j+1] = aux;
	            }
	        }
	    }
	}
}
