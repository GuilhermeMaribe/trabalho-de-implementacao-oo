
public class Participantes {
	private String nome,email;
	private int numPart;
	private Palestras palestra; 
	
	public Participantes(){
		setNome(Console.readString("Digite o nome: "));
		setEmail(Console.readString("Digite o e-mail: "));
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
	
	public int getNumPart() {
		return numPart;
	}

	public void setNumPart(int numPart) {
		this.numPart = numPart;
	}
	
	public Palestras getPalestra() {
		return palestra;
	}

	public void setPalestra(Palestras palestra) {
		this.palestra = palestra;
	}
	
	@Override
	public String toString() {
		return "\nParticipante n°: "+ numPart +"\nNome: " + nome + "\nE-mail: " + email+"\n";
	}

}