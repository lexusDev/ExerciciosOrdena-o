package exec5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[15];
		
		for(int i=0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println("Digite um numero: ");
		int escolha = sc.nextInt();
		
		buscaVet(vet, escolha);
		ordenaCres(vet);
		buscaBin(vet, escolha);
		
		sc.close();
	}
	
	public static void buscaVet(int[] vet, int busca){
        
        boolean testeBusca = false;
        int i =0;
        int indiceBuscado=0;
        while(i < vet.length && testeBusca == false) {
            
            if(vet[i] == busca){
                indiceBuscado = i;
                testeBusca = true;
            }
                       
            i++;
        }
        
        if(indiceBuscado%2==0)
        	System.out.println("Está numa posição par");
        
        else
        	System.out.println("Está numa posição impar");
        
        if(testeBusca)
            System.out.println("O valor do indice do vetor é: " + indiceBuscado);
        else
            System.out.println("Valor não encontrado");
        
    }
	
	private static int[] ordenaCres(int vetor[]){
        int eleito;
        int vet[] = vetor;
        
        for (int i = 0; i < vet.length; i++) {
            eleito = vet[i];
            int j = i -1;
            
            while(j>=0 && vet[j] > eleito){
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = eleito;
        }
        
        return vet;
    }
	
	private static void buscaBin(int[] vetor, int np) {
		int inicio = 0;
        int fim = vetor.length;
        int meio= (inicio+fim)/2;
        int achouNumero=0;
        boolean achou=false;
        
        while(inicio <= fim && achou == false){
            
            if(vetor[meio] == np){
                achou = true;
                achouNumero = meio;   
            }
            else if(np > vetor[meio])
                inicio = meio + 1;
            else
                fim = meio -1;
                
            meio= (inicio+fim)/2;
        }
        
        if(achouNumero%2==0)
        	System.out.println("Está numa posição par");
        
        else
        	System.out.println("Está numa posição impar");
        
        if (achou) 
            System.out.println("O indice achado é: "+ achouNumero);
        else
            System.out.println("O numero não foi encontrado!!!");

	}

}
