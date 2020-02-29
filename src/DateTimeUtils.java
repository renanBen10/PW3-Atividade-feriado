import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeUtils {
	
	public static Date toDAte(int dia, int mes, int ano) {
		
		LocalDate ld = LocalDate.of(ano, mes, dia);
		 return Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
	}
	
	

}
