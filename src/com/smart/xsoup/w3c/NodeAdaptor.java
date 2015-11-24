package com.smart.xsoup.w3c;

import org.w3c.dom.*;

/**
 * @author code4crafer@gmail.com
 */
public abstract class NodeAdaptor implements Node {

    public void setNodeValue(String nodeValue) throws DOMException {
        throw new UnsupportedOperationException();
    }

    public Node insertBefore(Node newChild, Node refChild) throws DOMException {
        throw new UnsupportedOperationException();
    }

    public Node replaceChild(Node newChild, Node oldChild) throws DOMException {
        throw new UnsupportedOperationException();
    }

    public Node removeChild(Node oldChild) throws DOMException {
        throw new UnsupportedOperationException();
    }

    public Node appendChild(Node newChild) throws DOMException {
        throw new UnsupportedOperationException();
    }

    public void normalize() {

    }

    public boolean isSupported(String feature, String version) {
        return false;
    }

    public String getNamespaceURI() {
        return null;
    }

    public String getPrefix() {
        return null;
    }

    public void setPrefix(String prefix) throws DOMException {
        throw new UnsupportedOperationException();
    }

    public String getLocalName() {
        return null;
    }

    public String getBaseURI() {
        return null;
    }

    public void setTextContent(String textContent) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public String lookupPrefix(String namespaceURI) {
        return null;
    }

    
    public boolean isDefaultNamespace(String namespaceURI) {
        return false;
    }

    
    public String lookupNamespaceURI(String prefix) {
        return null;
    }

    
    public Object getFeature(String feature, String version) {
        return null;
    }

    
    public Object setUserData(String key, Object data, UserDataHandler handler) {
        throw new UnsupportedOperationException();
    }

}
