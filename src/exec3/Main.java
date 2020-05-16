package exec3;

import java.util.Scanner;

public class Main {

	private static Scanner escreva;

	public static void main(String[] args) {
		Produto p[] = new Produto[12];
		escreva = new Scanner(System.in);
		int busca;
		
		for(int i=0; i < p.length; i++) {
			p[i] = new Produto();
			System.out.println("Digite o codigo do "+ (i+1) +"º produto: ");
			p[i].setCod(escreva.nextInt());
			System.out.println("Digite descrição do "+ (i+1) +"º produto: ");
			p[i].setDescricao(escreva.next());
			System.out.println("Digite o preço do "+ (i+1) +"º produto: ");
			p[i].setPreco(escreva.nextDouble());
		}
		System.out.println("Numero que deseja buscar: ");
		busca = escreva.nextInt();
		
		ordenaCres(p);
		buscaVet(p, busca);
		buscaBinaria(p, busca);
	}
	
	public static void ordenaCres(Produto vetor[]){
		Produto eleito;
        Produto vet[] = vetor;
        
        for (int i = 0; i < vet.length; i++) {
            eleito = vet[i];
            int j = i -1;
            
            while(j>=0 && vet[j].getCod() > eleito.getCod()){
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = eleito;
        }
    }
	
	public static void buscaVet(Produto[] vet, int busca){
        
        boolean testeBusca = false;
        int i =0;
        int indiceBuscado=0;
        while(i < vet.length && testeBusca == false) {
            
            if(vet[i].getCod() == busca){
                indiceBuscado = i;
                testeBusca = true;
            }
                       
            i++;
        }
        
        if(testeBusca)
            System.out.println("O valor do indice do vetor é: " + indiceBuscado);
        else
            System.out.println("Valor não encontrado");
        
        System.out.println("Quantas comparações feitas: "+ i);
    }
	
	public static void buscaBinaria(Produto[] vet, int busca){
		int inicio = 0;
	    int fim = vet.length;
	    int meio= (inicio+fim)/2;
	    int achouNumero=0;
	    int contBin=0;
	    boolean achou=false;
	    
	    while(inicio <= fim && achou == false){
	        
	        if(vet[meio].getCod() == busca){
	            achou = true;
	            achouNumero = meio;   
	        }
	        else if(busca > vet[meio].getCod())
	            inicio = meio + 1;
	        else
	            fim = meio -1;
	            
	        meio= (inicio+fim)/2;
	        contBin++;
	    }
	    System.out.println("Quantas comparações feitas: "+ contBin);
	    System.out.println("Numero achado: " + achouNumero);
	}
}
