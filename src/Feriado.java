import java.util.Date;

public class Feriado {
	
	public Long id;
	public String tipoFeriado;
	public String descricao;
	public Date  data;
	
	public String toString() {
		return String.format("- tipo: %s \n- descricao: %s \n- data: %S ", tipoFeriado,descricao,data);
	}
	
	
	
	
	

}
