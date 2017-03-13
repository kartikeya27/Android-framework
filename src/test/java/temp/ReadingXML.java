package temp;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import com.sun.org.apache.xerces.internal.dom.DeferredTextImpl;

import java.io.File;

public class ReadingXML {

	public static void main(String[] args) throws Exception {
		File fXmlFile = new File(System.getProperty("user.dir")+"//menu.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
				
		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();
		
		NodeList nodes = doc.getChildNodes();
		Node rootNode = nodes.item(0);
		//System.out.println(rootNode.getAttribute("id"));
		System.out.println(rootNode.getNodeName());
		System.out.println(rootNode.getTextContent());
		Element e = (Element)rootNode;
		System.out.println(e.getAttribute("id"));
		System.out.println(e.getNodeName());
		System.out.println(e.getTextContent());
		
		System.out.println("-----------------------------------------------------");
		nodes = rootNode.getChildNodes();
		System.out.println(nodes.getLength());
		
		for(int i=0;i<nodes.getLength();i++){
			if(!(nodes.item(i) instanceof DeferredTextImpl)){
				System.out.println("------");
			 e = (Element)nodes.item(i);
			 System.out.println(nodes.item(i).getNodeName() +" --- "+e.getAttribute("id"));
			 NodeList nodes1= nodes.item(i).getChildNodes();
			 System.out.println(nodes1.getLength());
			 for(int j=0;j<nodes1.getLength();j++){
				 if(!(nodes1.item(j) instanceof DeferredTextImpl)){
					 Element e1 = (Element)nodes1.item(j);
					 System.out.println(nodes1.item(j).getNodeName() +" --- "+e1.getAttribute("id"));
					 if(!e1.getAttribute("id").equals("")){
						 nodes1.item(j).getChildNodes();
						 //for
					 }
				 }
			 }
			}
		}

		

	}

}