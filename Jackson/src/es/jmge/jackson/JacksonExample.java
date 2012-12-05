package es.jmge.jackson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;

public class JacksonExample {

	private static org.apache.log4j.Logger logger = Logger.getLogger(JacksonExample.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			logger.debug("main");
		
			ObjectMapper mapper = new ObjectMapper();

			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			Computer computer = new Computer("Laptop", "HP", new OperativeSystem("Windows", "7"), 1.4);

			JsonSchema computerSchema = mapper.generateJsonSchema(Computer.class);
			
			logger.debug( "JSON Schema: " + computerSchema.toString());
			
			mapper.writeValue( buffer, computer );
			
			String jsonText = buffer.toString();
			
			logger.debug("Text:" + jsonText);
			
			Computer computer2 = mapper.readValue(jsonText, Computer.class);
			
			logger.debug("computer2" + computer2.toString());	
			
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
