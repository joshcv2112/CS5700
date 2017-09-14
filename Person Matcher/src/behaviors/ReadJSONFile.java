package behaviors;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

import main.Person;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFile implements ReadInputBehavior {
	@SuppressWarnings("resource")
	public Person[] readInput(String f) {
		String content = null;
		Person[] p = {};
		try {
			// content loads in entire json file into variable.
			content = new Scanner(new File(f)).useDelimiter("\\Z").next();
			JSONParser parser = new JSONParser();
			
			Object obj = parser.parse(content);
			JSONArray array = (JSONArray) obj;

			//System.out.println(array);
			
			JSONObject[] jsonObjectArray = new JSONObject[array.size()];
			
			// Assign each individual JSON object to an array of JSONObjects
			for (int i = 0; i < jsonObjectArray.length; i++) {
				jsonObjectArray[i] = (JSONObject) array.get(i);
			}
			
			p = new Person[jsonObjectArray.length];
			
			for(int i = 0; i < jsonObjectArray.length; i++) {
				p[i] = JSONToJavaObject(jsonObjectArray[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace(); 
		}
		
		return p;
	}
	
	public static Person JSONToJavaObject(JSONObject obj) {
		Person p = new Person();
		
		p.setObjectId(((Long) obj.get("ObjectId")).intValue());
		p.setStateFileNumber((String)obj.get("StateFileNumber"));
		p.setSocialSecurityNumber((String)obj.get("SocialSecurityNumber"));
		p.setFirstName((String)obj.get("FirstName"));
		p.setMiddleName((String)obj.get("MiddleName"));
		p.setLastName((String)obj.get("LastName"));
		p.setBirthDay(((Long) obj.get("BirthDay")).intValue());
		p.setBirthMonth(((Long) obj.get("BirthMonth")).intValue());
		p.setBirthYear(((Long) obj.get("BirthYear")).intValue());
		p.setGender((String)obj.get("Gender"));
		p.setNewbornScreeningNumber((String)obj.get("NewbornScreeningNumber"));
		p.setIsPartOfMultipleBirth((String)obj.get("IsPartOfMultipleBirth"));
		p.setBirthOrder(((Long) obj.get("BirthOrder")).intValue());
		p.setBirthCounty((String)obj.get("BirthCounty"));
		p.setMotherFirstName((String)obj.get("MotherFirstName"));
		p.setMotherMiddleName((String)obj.get("MotherMiddleName"));
		p.setMotherLastName((String)obj.get("MotherLastName"));
		p.setPhone1((String)obj.get("Phone1"));
		p.setPhone2((String)obj.get("Phone2"));
		
		return p;
	}
}