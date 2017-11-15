

	public class Evento {
		
		private String nome;
		private String data;
		private Palestras palestra;
		private Palestrantes palestrante;
		private Participantes participante;
		private Organizadores organizador;
		
		public Evento(){
			setNome(Console.readString("Digite o nome do evento: "));
			setData(Console.readString("Digite a data do evento: "));
		    setPalestrante(palestrante);
		    setPalestra(palestra);
		    setParticipante(participante);
		    setOrganizador(organizador);
		}
						
		public Organizadores getOrganizador() {
			return organizador;
		}

		public void setOrganizador(Organizadores organizador) {
			this.organizador = organizador;
		}

		public Participantes getParticipante() {
			return participante;
		}

		public void setParticipante(Participantes participante) {
			this.participante = participante;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getData() {
			return data;
		}
		
		public void setData(String data) {
			this.data = data;
		}
		
		public Palestras getPalestra() {
			return palestra;
		}
		
		public void setPalestra(Palestras palestra) {
			this.palestra = palestra;
		}
		
		public Palestrantes getPalestrante() {
			return palestrante;
		}
		
		public void setPalestrante(Palestrantes palestrante) {
			this.palestrante = palestrante;
		}

		
		
	}
