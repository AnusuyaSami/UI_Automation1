package CommonUtilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CommonLoadProperties {

	public void loadProperties() throws IOException {
		
		FileReader reader=null;
		try {
			reader=new FileReader("config.properties");
					}catch (FileNotFoundException execp) {
						execp.printStackTrace();
					}
		Properties properties=new Properties();
		try {
		properties.load(reader);
		
		}catch (IOException execp) {
						execp.printStackTrace();
					}
		Properties
	}
	
	
	
	
	
	
	
	
}
