
public class Palestras {

	protected String nomePalestra;
	protected String salaPalestra;
	protected String horarioPalestra;
	
	
	public String getNomePalestra() {
		return nomePalestra;
	}
	public void setNomePalestra(String nomePalestra) {
		this.nomePalestra = nomePalestra;
	}
	public String getSalaPalestra() {
		return salaPalestra;
	}
	public void setSalaPalestra(String salaPalestra) {
		this.salaPalestra = salaPalestra;
	}
	public String getHorarioPalestra() {
		return horarioPalestra;
	}
	
	public void setHorarioPalestra(String horarioPalestra) {
		this.horarioPalestra = horarioPalestra;
	}
	
	public Palestras(String nomePalestra, String salaPalestra, String horarioPalestra) {
		super();
		this.nomePalestra = nomePalestra;
		this.salaPalestra = salaPalestra;
		this.horarioPalestra = horarioPalestra;
	}
	
}
