import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class ReadXmlDomParser {

    private static final String FILENAME = "/home/user/IdeaProjects/untitled/src/staff.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); // ***
            DocumentBuilder db = dbf.newDocumentBuilder(); // ***
            Document doc = db.parse(new File(FILENAME)); // ***


            NodeList list = doc.getElementsByTagName("staff"); // ***

            for (int temp = 0; temp < list.getLength(); temp++) { // ***

                Node node = list.item(temp);
                Element element = (Element) node;
                System.out.println("firstname: " + element.getElementsByTagName("firstname").item(0).getTextContent()+ "\n");


                }
            }


    }

