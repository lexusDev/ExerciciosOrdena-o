package exec1;

public class BubbleSort {
	Funcionarios [] ordenaCres(Funcionarios [] f) {
	    Funcionarios aux;
	    //double r1, r2;
	    
	    for(int i = 0; i< f.length; i++){
	        for(int j = 0; j<f.length-1; j++){
	        	
	            if(f[j].getSalario() > f[j+1].getSalario()){
	                aux = f[j];
	                f[j] = f[j+1];
	                f[j+1] = aux;
	            }
	        }
	    }
	    System.out.println("Ordenação crescente de salarios:");
	    for(int i = 0; i<f.length; i++){
	        System.out.println(" "+f[i]);
	    }
	    
	    return f;
	}
	
	Funcionarios [] ordenaDecresc(Funcionarios [] f) {
		 Funcionarios aux;
	     
		    for(int i = 0; i< f.length; i++){
		        for(int j = 0; j<f.length-1; j++){
		        	double r1 =f[j].getSalario(), r2 = f[j+1].getSalario();
		        	
		            if(r1 < r2){
		                aux = f[j];
		                f[j] = f[j+1];
		                f[j+1] = aux;
		            }
		        }
		    }
		    System.out.println("Ordenação decrescente de salarios:");
		    for(int i = 0; i<f.length; i++){
		        System.out.println(" "+f[i]);
		    }
		    
		    return f;
	}
	
	public Funcionarios[] orderAlfa(Funcionarios [] f) {
        int j;
        Funcionarios eleito;

        for (int i=1; i<f.length; i++) {
            j = i-1;
            eleito = f[i];

            while (j>=0 && f[j].getNome().compareTo(eleito.getNome())>0) {
                f[j+1] = f[j];
                j--;
            }
            f[j+1] = eleito;
        }
        
        System.out.println("Ordenação alfabética:");
	    for(int i = 0; i<f.length; i++){
	        System.out.println(" "+f[i]);
	    }
	    
        return f;
    }
}
