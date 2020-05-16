package exec4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Aluno[] al = new Aluno[8];
		ArrayList<Aluno> reprovados = new ArrayList<Aluno>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<al.length;i++) {
			al[i] = new Aluno();
			System.out.println("Digite o "+(i+1)+" nome: ");
			al[i].setNome(sc.next());
			System.out.println("Digite a nota 1: ");
			al[i].setNota1(sc.nextDouble());
			System.out.println("Digite a nota 2: ");
			al[i].setNota2(sc.nextDouble());
		}
		
		orderMedia(al);
		System.out.println("Medias em ordem crescente:");
		for(Aluno res : al) {
			System.out.println(res);
		}
		
		orderNota1(al);
		System.out.println("Nota 1 em ordem crescente:");
		for(Aluno res : al) {
			System.out.println(res);
		}
		
		System.out.println("Alunos reprovados");
		reprovados = Reprovados(al);
		for (Aluno res : reprovados) {
			System.out.println(res);
		}
		
		sc.close();
	}
	
	private static Aluno[] orderNota1(Aluno vet[]) {
        int j;
        Aluno eleito;

        for (int i=1; i<vet.length; i++) {
            j = i-1;
            eleito = vet[i];

            while (j>=0 && vet[j].getNota1() > eleito.getNota1()) {
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = eleito;
        }
        return vet;
    }
	
	private static Aluno[] orderAlfa(Aluno vet[]) {
        int j;
        Aluno eleito;

        for (int i=1; i<vet.length; i++) {
            j = i-1;
            eleito = vet[i];

            while (j>=0 && vet[j].getNome().compareTo(eleito.getNome()) > 0) {
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = eleito;
        }
        return vet;
    }
	
	private static Aluno[] orderMedia(Aluno vet[]) {
        int j;
        Aluno eleito;

        for (int i=1; i<vet.length; i++) {
            j = i-1;
            eleito = vet[i];

            while (j>=0 && vet[j].getMedia() > eleito.getMedia()) {
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = eleito;
        }
        return vet;
    }
	
	private static ArrayList<Aluno> Reprovados(Aluno vet[]) {
        ArrayList<Aluno> reprovados = new ArrayList<Aluno>();
        orderAlfa(vet);
            
        for (int i = 0; i < vet.length; i++) {
			if(vet[i].getMedia() < 7) {
				reprovados.add(vet[i]);
			}
		}
        
        return reprovados;
    }

}
