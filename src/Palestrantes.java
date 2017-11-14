
public class Palestrantes {

	private String nome;
	private String email;
	private String curriculo;
	private String telefone;
	private Palestras palestra; 
	
	public Palestrantes (){
		setNome(Console.readString("Digite o nome do palestrante: "));
		setEmail(Console.readString("Digite o email do palestrante: "));
		setCurriculo(Console.readString("Descreva o curriculo do palestrante: "));
		setTelefone(Console.readString("Digite o telefone do palestrante: "));
		setPalestras(palestra);		
	}	
	
	public Palestras getPalestra() {
		return palestra;
	}
	
	public void setPalestras(Palestras palestra) {
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

	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
