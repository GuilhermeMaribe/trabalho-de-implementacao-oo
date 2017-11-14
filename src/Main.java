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
		// TODO Auto-generated method stub
		
	}
	
	private static void cadastraParticipantes() {
		// TODO Auto-generated method stub
		
	}

	private static void cadastraPalestras() {
		// TODO Auto-generated method stub
		
	}

	private static void cadastraOrganizador() {
		// TODO Auto-generated method stub
		
	}

	private static void cadastraSala() {
		// TODO Auto-generated method stub
		
	}

	private static void listaEvento() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}


	
	
	
	

























}
