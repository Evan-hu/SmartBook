package com.smart.xsoup.w3c;

import org.w3c.dom.*;

import java.nio.charset.Charset;

/**
 * @author code4crafer@gmail.com
 */
public class DocumentAdaptor extends ElementAdaptor implements Document {

    private org.jsoup.nodes.Document document;

    public DocumentAdaptor(org.jsoup.nodes.Document document) {
        super(document);
        this.document = document;
    }

    
    public DocumentType getDoctype() {
        return new HtmlDocumentType(document);
    }

    
    public DOMImplementation getImplementation() {
        return null;
    }

    
    public short getNodeType() {
        return DOCUMENT_NODE;
    }

    
    public Element getDocumentElement() {
        return this;
    }

    
    public Element getElementById(String elementId) {
        return NodeAdaptors.getElement(document.getElementById(elementId));
    }

    
    public String getInputEncoding() {
        return Charset.defaultCharset().name();
    }

    
    public String getXmlEncoding() {
        return Charset.defaultCharset().name();
    }

    
    public boolean getXmlStandalone() {
        return false;
    }

    
    public String getXmlVersion() {
        //TODO
        return null;
    }

    
    public void setXmlStandalone(boolean xmlStandalone) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public void setXmlVersion(String xmlVersion) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public boolean getStrictErrorChecking() {
        return false;
    }

    
    public void setStrictErrorChecking(boolean strictErrorChecking) {
        throw new UnsupportedOperationException();
    }

    
    public String getDocumentURI() {
        return document.baseUri();
    }

    
    public void setDocumentURI(String documentURI) {
        throw new UnsupportedOperationException();
    }

    
    public Node adoptNode(Node source) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public DOMConfiguration getDomConfig() {
        return null;
    }

    
    public void normalizeDocument() {

    }

    
    public Node renameNode(Node n, String namespaceURI, String qualifiedName) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Element createElement(String tagName) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public DocumentFragment createDocumentFragment() {
        throw new UnsupportedOperationException();
    }

    
    public Text createTextNode(String data) {
        throw new UnsupportedOperationException();
    }

    
    public Comment createComment(String data) {
        throw new UnsupportedOperationException();
    }

    
    public CDATASection createCDATASection(String data) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public ProcessingInstruction createProcessingInstruction(String target, String data) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Attr createAttribute(String name) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public EntityReference createEntityReference(String name) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Node importNode(Node importedNode, boolean deep) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Element createElementNS(String namespaceURI, String qualifiedName) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Attr createAttributeNS(String namespaceURI, String qualifiedName) throws DOMException {
        throw new UnsupportedOperationException();
    }
}
