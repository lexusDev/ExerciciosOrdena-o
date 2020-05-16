package exec1;

public class MergeSort {
	
	public void merge(Funcionarios X[], int inicio, int fim) {
		int meio;
		if(inicio < fim) {
			meio = (inicio+fim)/2;
			merge(X, inicio, meio);
			merge(X, meio+1, fim);
			intercala(X, inicio, fim, meio);
		}
	}
	
	public void intercala(Funcionarios X[], int inicio, int fim, int meio) {
		int poslivre, inicio_vetor1, inicio_vetor2, i;
		Funcionarios aux[] = new Funcionarios[10];
		inicio_vetor1 = inicio;
		inicio_vetor2 = meio + 1;
		poslivre = inicio;
		while(inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
			if(X[inicio_vetor1].getSalario() <= X[inicio_vetor2].getSalario()) {
				aux[poslivre] = X[inicio_vetor1];
				inicio_vetor1 = inicio_vetor1 + 1;
			}
			else {
				aux[poslivre] = X[inicio_vetor2];
				inicio_vetor2 = inicio_vetor2 + 1;
			}
			
			poslivre = poslivre + 1;
		}
		
		for (i = inicio_vetor1; i <= meio; i++) {
			aux[poslivre] = X[i];
			poslivre = poslivre +1;
		}
		
		for (i = inicio_vetor2; i <= fim; i++) {
			aux[poslivre] = X[i];
			poslivre = poslivre +1;
		}
		
		for(i=inicio; i <= fim; i++) {
			X[i] = aux[i];
		}
	}
}