package com.smart.xsoup.w3c;


import org.jsoup.nodes.*;
import org.w3c.dom.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * @author code4crafer@gmail.com
 */
public class AttributeAdaptor extends NodeAdaptor implements Attr {

    private Attribute attribute;

    private org.jsoup.nodes.Element element;

    public AttributeAdaptor(Attribute attribute, org.jsoup.nodes.Element element) {
        this.attribute = attribute;
        this.element = element;
    }

    
    public String getName() {
        return attribute.getKey();
    }

    
    public boolean getSpecified() {
        return false;
    }

    
    public String getValue() {
        return attribute.getValue();
    }

    
    public void setValue(String value) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Element getOwnerElement() {
        return NodeAdaptors.getElement(element);
    }

    
    public TypeInfo getSchemaTypeInfo() {
        return new DummyTypeInfo();
    }

    
    public boolean isId() {
        return false;
    }

    
    public String getNodeName() {
        return attribute.getKey();
    }

    
    public String getNodeValue() throws DOMException {
        return attribute.getValue();
    }

    
    public short getNodeType() {
        return ATTRIBUTE_NODE;
    }

    
    public Node getParentNode() {
        return new ElementAdaptor(element);
    }

    
    public NodeList getChildNodes() {
        return null;
    }

    
    public Node getFirstChild() {
        return null;
    }

    
    public Node getLastChild() {
        return null;
    }

    
    public Node getPreviousSibling() {
        return null;
    }

    
    public Node getNextSibling() {
        return null;
    }

    
    public NamedNodeMap getAttributes() {
        return null;
    }

    
    public Document getOwnerDocument() {
        return new DocumentAdaptor(element.ownerDocument());
    }

    
    public boolean hasChildNodes() {
        return false;
    }

    
    public Node cloneNode(boolean deep) {
        throw new UnsupportedOperationException();
    }

    
    public boolean hasAttributes() {
        return false;
    }

    
    public short compareDocumentPosition(Node other) throws DOMException {
        return 0;
    }

    
    public String getTextContent() throws DOMException {
        return attribute.getValue();
    }

    
    public boolean isSameNode(Node other) {
        return false;
    }

    
    public boolean isEqualNode(Node arg) {
        return false;
    }

    
    public Object getUserData(String key) {
        return null;
    }

	
	public void setNodeValue(String nodeValue) throws DOMException {
		// TODO Auto-generated method stub
		
	}

	
	public Node insertBefore(Node newChild, Node refChild) throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Node replaceChild(Node newChild, Node oldChild) throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Node removeChild(Node oldChild) throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Node appendChild(Node newChild) throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void normalize() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean isSupported(String feature, String version) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public String getNamespaceURI() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getPrefix() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setPrefix(String prefix) throws DOMException {
		// TODO Auto-generated method stub
		
	}

	
	public String getLocalName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getBaseURI() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setTextContent(String textContent) throws DOMException {
		// TODO Auto-generated method stub
		
	}

	
	public String lookupPrefix(String namespaceURI) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean isDefaultNamespace(String namespaceURI) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public String lookupNamespaceURI(String prefix) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Object getFeature(String feature, String version) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Object setUserData(String key, Object data, UserDataHandler handler) {
		// TODO Auto-generated method stub
		return null;
	}
}
