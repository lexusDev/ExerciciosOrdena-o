package exec1;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Funcionarios[] f = new Funcionarios[5];
		MergeSort a = new MergeSort();
		BubbleSort b = new BubbleSort();
		
		Scanner escreva = new Scanner(System.in);
		
		for(int i=0; i < f.length; i++) {
			f[i] = new Funcionarios();
			System.out.print("\nEscreva o "+ (i+1)+"º nome: ");
			f[i].setNome(escreva.next());
			
			System.out.print("\nEscreva o "+ (i+1)+"º salario: ");
			f[i].setSalario(escreva.nextDouble());
		}
		
		escreva.close();
		
		a.merge(f, 0, 4);
		System.out.println("Ordenação Crescente: ");
		for (Funcionarios res: f) {
			System.out.println(" " + res);
		}
		b.ordenaDecresc(f);
		b.orderAlfa(f);
	}

}
