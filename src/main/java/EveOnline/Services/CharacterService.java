package EveOnline.Services;

import Helper.Util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;


/**
 * Created by teach on 4/13/2017.
 */

public class CharacterService {
    private static final String URL_PATH = "https://api.eveonline.com/eve/CharacterID.xml.aspx?names=";
    private static final String CHARACTER_ID_NODE = "characterID";
    private static final String CHARACTER_ID_ROW_NODE = "row";

    private static CharacterService instance = null;

    //===============================================================================================
    public static CharacterService getInstance(){
        if(instance == null){
            instance = new CharacterService();
        }
        return instance;
    }

    //===============================================================================================
    public int getEntityID(String name) {

        String xmlData = Util.getInstance().getDataFromUrl(this.URL_PATH + name);
        int characterID = getCharacterIdFromXML(xmlData);

        return characterID;
    }

    //===============================================================================================
    private int getCharacterIdFromXML(String xmlString){
        String characterID;
        Document document = null;
        DocumentBuilder documentBuilder;

        try {
            documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(new StringReader(xmlString));
            document = documentBuilder.parse(inputSource);

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        NodeList rowNode = document.getElementsByTagName(CHARACTER_ID_ROW_NODE);
        Node characterIdNode = rowNode.item(0);
        Element characterIdElement = (Element) characterIdNode;
        characterID = characterIdElement.getAttribute(CHARACTER_ID_NODE);

        return Integer.parseInt(characterID);
    }

    //===============================================================================================

}
