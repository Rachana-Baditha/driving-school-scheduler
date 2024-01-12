package src;

import java.time.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataParser {
	
	private static void parseInCarSession(JSONObject session) 
    {
         
        //Get employee first name
        String instructor = (String) session.get("instructor");    
         
        //Get employee last name
        String starttime = (String) session.get("starttime");  
        String[] splittime = starttime.split(":");
         
        InCarSession sessionObj = new InCarSession(LocalDate.now(),LocalTime.of(Integer.parseInt(splittime[0]), Integer.parseInt(splittime[1])), instructor);
        
        System.out.print(sessionObj.toString());
        
    }
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		
		JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader("C:\\Files\\Programming\\Java\\Extra Stuff\\Timslots.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray list = (JSONArray) obj;
//            System.out.println(list);
            
            list.forEach( session -> parseInCarSession( (JSONObject) session ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
	
	
		
}
	
	


