public class Main {

	static int unico = 1;
	static int decimal = 10;
		
	static Evento vEvento[] = new Evento[unico];
	static Palestras vPalestra[] = new Palestras[decimal];
	static Palestrantes vPalestrante[] = new Palestrantes[decimal];
	static Participantes[] vParticipante = new Participantes[decimal];
	static Organizadores vOrganizador[] = new Organizadores[unico];
	
	public static void main(String[] args) {
		while (true) {
			switch (Console.readString(Menu.menu()).charAt(0)) {
			case '1': cadastraEvento(); break;
			case '2': cadastraParticipantes(); break;
			case '3': cadastraPalestrante(); break;
			case '4': cadastraPalestras(); break;
			case '5': cadastraOrganizador(); break;
			case '6': listaEvento(); break;
			case '7': listaParticipantes(); break;
			case '8': listaPalestra(); break;
			case '9': ListaPalestrante(); break;
			case '0': System.exit(0); break;
			}
		}
	}
	
	
	


	private static void cadastraEvento() {
		for (int k = 0; k < vEvento.length; k++)
			if (vEvento[k] == null) {
				vEvento[k] = new Evento();
				return;
			}
		System.out.println("Numero maximo de eventos atingido!");
		
	}
	
	public static void cadastraParticipantes() {
		
		for (int k = 0; k < vParticipante.length; k++)
			if (vParticipante[k] == null) {
				vParticipante[k] = new Participantes();
				return;
			}
		System.out.println("Numero maximo de participantes foi atingido");
	}
	
	private static void cadastraPalestrante() {
		for (int k = 0; k < vPalestrante.length; k++)
			if (vPalestrante[k] == null) {
				vPalestrante[k] = new Palestrantes();
				return;
			}
		System.out.println("Numero maximo de palestras cadastradas");
		
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
				System.out.println(vEvento[i].toString());
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
				System.out.println(vParticipante[i].toString());
				}
			if (vParticipante[i] != null && vParticipante[i].getPalestra() == null){
				System.out.println(vParticipante[i].toString() + "Nenhuma palestra selecionada");
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
				System.out.println(vPalestra[i].toString());
		}
	}
	
	private static void ListaPalestrante() {
		System.out.println("Lista de palestrantes:");
		if (vPalestrante[0] == null){
			System.out.println("Nenhum palestrante cadastrado!");
		}
		for (int i = 0; i < vPalestrante.length; i++) {
			if (vPalestrante[i] != null)
				System.out.println(vPalestrante[i].toString());
		}
	}
}

