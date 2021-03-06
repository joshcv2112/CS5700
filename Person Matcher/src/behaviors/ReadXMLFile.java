package behaviors;

import main.Person;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLFile implements ReadInputBehavior {
	public Person[] readInput(String f) {
		Person[] personArray = {};
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(f);
			List<Person> pList = new ArrayList<Person>();
			NodeList personList = document.getElementsByTagName("Person");
			for (int i = 0; i < personList.getLength(); i++) 
			{ 
				Node personNode = personList.item(i);
				if(personNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element person = (Element) personNode;
					NodeList objectIdList = person.getChildNodes();
					Person person1 = new Person();
					for (int j = 0; j < objectIdList.getLength(); j++) 
					{
						Node n = objectIdList.item(j);
						
						if (n.getNodeType() == Node.ELEMENT_NODE) 
						{
							Element name = (Element) n;
							String tagName = name.getTagName();
							
							switch (tagName) {
								case "ObjectId": 
									person1.setObjectId(name.getTextContent());
									break;
								case "StateFileNumber": 
									person1.setStateFileNumber(name.getTextContent());
									break;
								case "SocialSecurityNumber": 
									person1.setSocialSecurityNumber(name.getTextContent());
									break;
								case "FirstName": 
									person1.setFirstName(name.getTextContent());
									break;
								case "MiddleName": 
									person1.setMiddleName(name.getTextContent());
									break;
								case "LastName": 
									person1.setLastName(name.getTextContent());
									break;
								case "BirthYear": 
									person1.setBirthYear(name.getTextContent());
									break;
								case "BirthMonth": 
									person1.setBirthMonth(name.getTextContent());
									break;
								case "BirthDay": 
									person1.setBirthDay(name.getTextContent());
									break;
								case "Gender": 
									person1.setGender(name.getTextContent());
									break;
								case "NewbornScreeningNumber":
									person1.setNewbornScreeningNumber(name.getTextContent());
									break;
								case "isPartOfMultipleBirth":
									person1.setIsPartOfMultipleBirth(name.getTextContent());
									break;
								case "birthOrder":
									person1.setBirthOrder(name.getTextContent());
									break;
								case "BirthCounty":
									person1.setBirthCounty(name.getTextContent());
									break;
								case "MotherFirstName":
									person1.setMotherFirstName(name.getTextContent());
									break;
								case "MotherMiddleName":
									person1.setMotherMiddleName(name.getTextContent());
									break;
								case "MotherLastName":
									person1.setMotherLastName(name.getTextContent());
									break;
								case "Phone1":
									person1.setPhone1(name.getTextContent());
									break;
								case "Phone2":
									person1.setPhone2(name.getTextContent());
									break;
							}
						}
					}
					pList.add(person1);
				}
			}
			personArray = new Person[pList.size()];
			for (int i = 0; i < pList.size(); i++) {
				personArray[i] = pList.get(i);
			}
		} catch (ParserConfigurationException e) {
			System.out.println(e);
		} catch (SAXException e) {
			System.out.println(e);String var = "";
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return personArray;
	}
}
