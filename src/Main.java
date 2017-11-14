public class Main {

	static int unico = 1;
	static int decimal = 10;
	
	static Evento vEvento[] = new Evento[unico];
	static Palestras vPalestra[] = new Palestras[decimal];
	static Palestrantes vPalestrante[] = new Palestrantes[decimal];
	static Participantes vParticipante[] = new Participantes[decimal];
	static Organizadores vOrganizador[] = new Organizadores[unico];
	
	public static void main(String[] args) {
		while (true) {
			switch (Console.readString(Menu.menu()).charAt(0)) {
			case '1': cadastraEvento(); break;
			case '2': cadastraParticipantes(); break;
			case '3': cadastraPalestras(); break;
			case '4': cadastraOrganizador(); break;
			case '5': listaEvento(); break;
			case '6': listaParticipantes(); break;
			case '7': listaPalestra(); break;
			case '8': System.exit(0); break;
			}
		}
	}
	
	private Menu menu;
	
	private static void cadastraEvento() {
		for (int k = 0; k < vEvento.length; k++)
			if (vEvento[k] == null) {
				vEvento[k] = new Evento();
				return;
			}
		System.out.println("Numero maximo de eventos atingido!");
		
	}
	
	private static void cadastraParticipantes() {
		for (int k = 0; k < vParticipante.length; k++)
			if (vParticipante[k] == null) {
				vParticipante[k] = new Participantes();
				return;
			}
		System.out.println("Numero maximo de participantes foi atingido");
	}
	
	private static void cadastraPalestras() {
		for (int k = 0; k < vPalestra.length; k++)
			if (vPalestra[k] == null) {
				vPalestra[k] = new Palestras();
				return;
			}
		System.out.println("Numero maximo de palestras cadastradas");
	}

	private static void cadastraOrganizador() {
		for (int k = 0; k < vOrganizador.length; k++)
			if (vOrganizador[k] == null) {
				vOrganizador[k] = new Organizadores();
				return;
			}
		System.out.println("Numero maximo de organizadores atingido!");
	}

	
	private static void listaEvento() {
		System.out.println("Eventos:");
		if (vEvento[0] == null){
			System.out.println("Nenhum evento cadastrado!");
		}
		for (int i = 0; i < vEvento.length; i++) {
			if (vEvento[i] != null)
				System.out.println(i + " - " + vEvento[i].getNome() + ", " + vEvento[i].getData());
		}
	}

	private static void listaParticipantes() {
		System.out.println("Lista de participantes: ");
		if (vParticipante[0] == null){
			System.out.println("Cadastro de participantes vazio");
			cadastraParticipantes();
		}
		for (int i = 0; i < vParticipante.length; i++) {
			if (vParticipante[i] != null && vParticipante[i].getPalestra() != null){
				System.out.println(i + " - Nome: " + vParticipante[i].getNome() + ", E-mail: " + vParticipante[i].
						getEmail() + "Palestras selecionadas: " + vParticipante[i].getPalestra());}
			if (vParticipante[i] != null && vParticipante[i].getPalestra() == null){
				System.out.println(i + " - Nome: " + vParticipante[i].getNome() + ", E-mail: " + vParticipante[i].
						getEmail() + "Nenhuma palestra selecionada");
			}
		}
		
	}

	private static void listaPalestra() {
		System.out.println("Lista de palestras:");
		if (vPalestra[0] == null){
			System.out.println("Nenhuma palestra cadastrada!");
		}
		for (int i = 0; i < vPalestra.length; i++) {
			if (vPalestra[i] != null)
				System.out.println(i + " - " + vPalestra[i].getNome() + ", " + vPalestra[i].getDescricao());
		}
	}
}


	
	
	
	

























}
