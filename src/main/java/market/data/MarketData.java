package market.data;

import java.io.IOException;

import market.data.services.JsonConverter;
import market.data.services.Url;

public class MarketData {

	public static void main(String[] args) {
				
		Url archivo = new Url();
		JsonConverter converter = new JsonConverter();
		
		try {
			converter.generarSalidaJson(converter.convertirJson(archivo.traerJson()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
