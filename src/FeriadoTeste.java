import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FeriadoTeste {

	public static void main(String[] args) {
		
		Feriado obj = new Feriado();
		
		obj.tipoFeriado = "nacional";
		obj.descricao = "Natal";
		
		//LocalDate ld = LocalDate.of(2020, 12, 25);
		//Date dataFeriado = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		obj.data = DateTimeUtils.toDAte(25, 12, 2020);
		
		System.out.println(obj.data);
		
		System.out.println(obj.toString());
		
	}
	
	
	
	
	
	
	
	
	
	
}
