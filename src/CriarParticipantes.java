
public class CriarParticipantes

	implements LeitorCSV.Creator<Participantes>
{
	@Override
	public Participantes fromString(String line) {
		String[] data = line.split(",");
		return new Participantes(data[0],data[1]);
	}
}
