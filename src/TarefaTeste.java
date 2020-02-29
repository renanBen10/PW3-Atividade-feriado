import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class TarefaTeste {

	public static void main(String[] args) {
		Tarefa obj = new Tarefa();
		
		obj.titulo = "Aula PW3";
		obj.descricao = "PW3-classes";
		LocalDate ld = LocalDate.of(2020, 11, 20);
		Date dataTarefa = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		obj.dataPrevista = dataTarefa ;
		
		System.out.println(obj.dataPrevista);
		
		System.out.println(obj.toString());
	}
	
	public long getDais() {
		LocalDate localDataPrevista = dataPrevista.toInstant()
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
