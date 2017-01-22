package temp;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.sun.org.apache.xerces.internal.dom.DeferredTextImpl;


public class ReadXML {
static int level=0;
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		File fXmlFile = new File(System.getProperty("user.dir")+"/menu.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
				
		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		System.out.println(doc.getElementsByTagName("menu").getLength());
		Node currentNode = doc.getChildNodes().item(0);
		
		getChildValues(currentNode);
	
		
		}
		
		
		
		



		/*	
		XPath xpath =XPathFactory.newInstance().newXPath();
        XPathExpression expr1 = xpath.compile("//category[@id='Electronics']/product");
        NodeList nodes = (NodeList)expr1.evaluate(doc, XPathConstants.NODESET);
        System.out.println(nodes.getLength());
		
		for(int i=0;i<nList.getLength();i++){
			Node n1 = nList.item(i);
			Element e1 = (Element) n1;
		 System.out.println(e1.getNodeName());
			if(e1.hasAttribute("id")){			
				  Node n2 = e1.getFirstChild(); 
				  while( n2!=null ){
					  System.out.println("------------------");
					  if(! (n2 instanceof DeferredTextImpl)){
					  Element e2 = (Element) n2;
					  System.out.println(e2.getNodeName());
						if(e2.hasAttribute("id")){
							Node n3 = e2.getFirstChild();    
							 while( n3!=null ){  
								 if(! (n3 instanceof DeferredTextImpl)){
								 Element e3 = (Element) n3;
								 listElementValue(e3);
								 }
								  n3 = n3.getNextSibling();
							 }
						}else{
							listElementValue(e2);
						}
						}
						
					  n2 = n2.getNextSibling();
				  }
			}else{
				listElementValue(e1);
			}
		
			Node n1 = nList.item(i);
			System.out.println(n1.getNodeName());
				Element e1 = (Element) n1;
                NodeList nodeList = e1.getElementsByTagName("subcategory");
                System.out.println("Number of subcategory tags - "+nodeList.getLength());
                
                for(int j=0;j<nodeList.getLength();j++){
                	Node n2 = nodeList.item(j);
        			Element e2 = (Element) n2;
        			if(e2.hasAttribute("id")){
        				System.out.println("Listing for "+e2.getAttribute("id") + "-> ");
        				NodeList nodeList2 = e2.getElementsByTagName("product");
                        System.out.println("Number of product tags - "+nodeList2.getLength());
                        
                        for(int k=0;k<nodeList2.getLength();k++){
                        
                        	Node n3 = nodeList2.item(k);
                        	Element e3= (Element) n3;
                        	System.out.println(e3.getTextContent());
                        }

        			}else{
        				System.out.println("Subcategory -> "+e2.getTextContent());
        			}
                }

			
		*/
		

	

	private static void getChildValues(Node currentNode) {
	
		  
		//System.out.println(currentNode.getNodeName());
		if(!(currentNode instanceof DeferredTextImpl)){
			Element e = (Element)currentNode;

			if(!e.getAttribute("id").equals("")){
			//System.out.println("Going in level-"+e.getAttribute("id"));	
			System.out.println(e.getAttribute("id") );
			
			Node child = currentNode.getFirstChild();
			while(child!=null){
					 getChildValues(child);
				child=child.getNextSibling();
			}
			
			
		}else{// value is present
				System.out.println(e.getNodeName()+" ---- "+e.getTextContent());
				currentNode = currentNode.getNextSibling();
				getChildValues(currentNode);			
		}
			
		}
		
	}



	private static void getNextNode(Node rootNode) {
		//System.out.println(rootNode.getn.getNodeName());
		
	}



	public static void listElementValue(Element e) {
		System.out.println(e.getTextContent());
		
	}
	
	public static void isHavingSubMenu(){
		
	}

}
