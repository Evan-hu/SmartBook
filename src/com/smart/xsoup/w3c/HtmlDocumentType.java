package com.smart.xsoup.w3c;

import org.w3c.dom.*;

/**
 * @author code4crafer@gmail.com
 */
public class HtmlDocumentType extends NodeAdaptor implements DocumentType{

    private org.jsoup.nodes.Document document;

    public HtmlDocumentType(org.jsoup.nodes.Document document) {
        this.document = document;
    }

    
    public String getNodeName() {
        return "html";
    }

    
    public String getNodeValue() throws DOMException {
        return null;
    }

    
    public short getNodeType() {
        return DOCUMENT_TYPE_NODE;
    }

    
    public Node getParentNode() {
        return null;
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
        return NodeAdaptors.getDocument(document);
    }

    
    public boolean hasChildNodes() {
        return false;
    }

    
    public Node cloneNode(boolean deep) {
        return null;
    }

    
    public boolean hasAttributes() {
        return false;
    }

    
    public short compareDocumentPosition(Node other) throws DOMException {
        return 0;
    }

    
    public String getTextContent() throws DOMException {
        return document.text();
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

    
    public String getName() {
        return "html";
    }

    
    public NamedNodeMap getEntities() {
        return null;
    }

    
    public NamedNodeMap getNotations() {
        return null;
    }

    
    public String getPublicId() {
        return null;
    }

    
    public String getSystemId() {
        return null;
    }

    
    public String getInternalSubset() {
        return null;
    }
}
