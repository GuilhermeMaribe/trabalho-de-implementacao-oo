
public class Palestras {

	private String nome;
	private String sala;
	private String horario;
	private String descricao;
	
	public Palestras (){
		setNome(Console.readString("Digite o nome da palestra: "));
		setSala(Console.readString("Digite a sala da palestra: "));
		setHorario(Console.readString("Digite o horário da palestra: "));
		setDescricao(Console.readString("Digite um resumo da palestra: "));
	}
		
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Nome da palestra: " + nome +
				"\nSala numero: " + sala + 
				"\nHorario: " + horario +
				"\nTema: " + descricao;
	}
	
		
	
}
