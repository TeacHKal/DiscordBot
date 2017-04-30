package Helper;

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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by teach on 4/14/2017.
 * email: teach.inbox@gmail.com
 */

public class Util {

    private static final int FIRST = 0;

    //===============================================================================================
    private static Util instance;

    public static Util getInstance(){
        if(instance == null){
            instance = new Util();
        }
        return instance;
    }

    //===============================================================================================
    public String getDataFromUrl(String urlPath) {

        URL url;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            url = new URL(urlPath);
            Scanner scanner = new Scanner(url.openStream());
            while(scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

    //===============================================================================================
    public HashMap<String, String> getNodesFromXmlString(String[] nodeNames, String xmlString){

        HashMap<String, String> hmNodes = new HashMap<>();
        Document document;
        DocumentBuilder documentBuilder;

        try {
            documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(new StringReader(xmlString));
            document = documentBuilder.parse(inputSource);


            for (String node: nodeNames) {
                NodeList rowNode = document.getElementsByTagName(node);

                Element element = (Element) rowNode.item(FIRST);
                Node sourceName = element.getChildNodes().item(FIRST);
                String retrievedNode = sourceName.getNodeValue();

                hmNodes.put(node, retrievedNode);
            }

            return hmNodes;

        } catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}
