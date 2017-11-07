

	public class Evento extends Palestras {
		public Evento(String nomePalestra, String salaPalestra, String horarioPalestra) {
			super(nomePalestra, salaPalestra, horarioPalestra);

		}

		protected String dataEvento;

		public String getDataEvento() {
			return dataEvento;
		}

		public void setDataEvento(String dataEvento) {
			this.dataEvento = dataEvento;
		}

		@Override
		public String toString() {
			return  dataEvento ;
		}
		
	}
