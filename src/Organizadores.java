
public class Organizadores {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Organizadores(){
		setNome(Console.readString("Digite o nome do Organizador: "));
	}

	@Override
	public String toString() {
		return "Organizador responsavel: " + nome;
	}
	
}
