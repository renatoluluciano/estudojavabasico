package manipulandoDatas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		Calendario calendario = new Calendario();
		
		String dateString = "25/07/1987";
		
		SimpleDateFormat dataformatada = new SimpleDateFormat("dd/MM/yyyy");
		
		calendario.setData_afastamento(dataformatada.parse(dataString));
		
		
		
	}

}
