package com.smart.xsoup.w3c;

import org.jsoup.nodes.Attribute;
import org.w3c.dom.*;

/**
 * @author code4crafer@gmail.com
 */
public class ElementAdaptor extends NodeAdaptor implements Element {

    private org.jsoup.nodes.Element element;

    public ElementAdaptor(org.jsoup.nodes.Element element) {
        this.element = element;
    }

    
    public String getTagName() {
        return element.tagName();
    }

    
    public String getAttribute(String name) {
        return element.attr(name);
    }

    
    public Attr getAttributeNode(String name) {
        if (element.attr(name) == null) {
            return null;
        }
        return NodeAdaptors.getAttr(new Attribute(name, element.attr(name)), element);
    }

    
    public NodeList getElementsByTagName(String name) {
        return NodeAdaptors.getNodeList(element.getElementsByTag(name));
    }

    
    public boolean hasAttribute(String name) {
        return element.hasAttr(name);
    }

    
    public TypeInfo getSchemaTypeInfo() {
        return DummyTypeInfo.getInstance();
    }

    
    public String getNodeName() {
        return element.nodeName();
    }

    
    public String getNodeValue() throws DOMException {
        return element.outerHtml();
    }

    
    public short getNodeType() {
        return ELEMENT_NODE;
    }

    
    public Node getParentNode() {
        return NodeAdaptors.getElement(element.parent());
    }

    
    public NodeList getChildNodes() {
        return NodeAdaptors.getNodeList(element.childNodes());
    }

    
    public Node getFirstChild() {
        if (element.children().isEmpty()) {
            return null;
        }
        return NodeAdaptors.getNode(element.child(0));
    }

    
    public Node getLastChild() {
        if (element.children().isEmpty()) {
            return null;
        }
        return NodeAdaptors.getNode(element.child(element.childNodeSize()));
    }

    
    public Node getPreviousSibling() {
        return NodeAdaptors.getNode(element.previousSibling());
    }

    
    public Node getNextSibling() {
        return NodeAdaptors.getNode(element.nextSibling());
    }

    
    public NamedNodeMap getAttributes() {
        return NodeAdaptors.getNamedNodeMap(NodeAdaptors.getAttributes(element.attributes(), element));
    }

    
    public String getTextContent() throws DOMException {
        return element.text();
    }

    
    public Document getOwnerDocument() {
        return NodeAdaptors.getDocument(element.ownerDocument());
    }

    
    public boolean hasChildNodes() {
        return !element.children().isEmpty();
    }

    
    public Node cloneNode(boolean deep) {
        return null;
    }

    
    public boolean hasAttributes() {
        return true;
    }

    
    public short compareDocumentPosition(Node other) throws DOMException {
        return 0;
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

    /*----------------------------- update - not support-------------*/
    
    public void setAttribute(String name, String value) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public void removeAttribute(String name) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Attr setAttributeNode(Attr newAttr) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Attr removeAttributeNode(Attr oldAttr) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public void setAttributeNS(String namespaceURI, String qualifiedName, String value) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public void removeAttributeNS(String namespaceURI, String localName) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Attr setAttributeNodeNS(Attr newAttr) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public void setIdAttribute(String name, boolean isId) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public void setIdAttributeNS(String namespaceURI, String localName, boolean isId) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public void setIdAttributeNode(Attr idAttr, boolean isId) throws DOMException {
        throw new UnsupportedOperationException();
    }

    /*--------------------- NS not supported ----------------*/

    
    public String getAttributeNS(String namespaceURI, String localName) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Attr getAttributeNodeNS(String namespaceURI, String localName) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public NodeList getElementsByTagNameNS(String namespaceURI, String localName) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public boolean hasAttributeNS(String namespaceURI, String localName) throws DOMException {
        throw new UnsupportedOperationException();
    }

}
