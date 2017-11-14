
public class Participantes {
	
	private String nome;
	private String email;
	private Palestras palestra;
	
	public Participantes(){
		setNome(Console.readString("Digite o nome do participante: "));
		setEmail(Console.readString("Digite o e-mail do participante: "));
	}
	
	public Palestras getPalestra() {
		return palestra;
	}

	public void setPalestra(Palestras palestra) {
		this.palestra = palestra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return nome + "," + email;
	}
}