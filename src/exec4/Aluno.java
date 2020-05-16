package exec4;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	private double media;
	
	public double getMedia() {
		media = (2*nota1 + 3*nota2)/5;
		return media;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome + "\nNota 1: " + nota1+ "\nNota 2: " + nota2+ "\nMédia : " + media;
	}
}
