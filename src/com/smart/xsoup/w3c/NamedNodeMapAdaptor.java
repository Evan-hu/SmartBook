package com.smart.xsoup.w3c;

import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author code4crafer@gmail.com
 */
public class NamedNodeMapAdaptor implements NamedNodeMap {

    private List<? extends Node> nodeList;

    public NamedNodeMapAdaptor(List<? extends Node> nodeList) {
        this.nodeList = nodeList;
        nodeMap = new HashMap<String, Node>(nodeList.size());
        for (Node node : nodeList) {
            nodeMap.put(node.getNodeName(),node);
        }
    }

    private Map<String, Node> nodeMap;

    
    public Node getNamedItem(String name) {
        return nodeMap.get(name);
    }

    
    public Node setNamedItem(Node arg) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Node removeNamedItem(String name) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Node item(int index) {
        return nodeList.get(index);
    }

    
    public int getLength() {
        return nodeList.size();
    }

    
    public Node getNamedItemNS(String namespaceURI, String localName) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Node setNamedItemNS(Node arg) throws DOMException {
        throw new UnsupportedOperationException();
    }

    
    public Node removeNamedItemNS(String namespaceURI, String localName) throws DOMException {
        throw new UnsupportedOperationException();
    }
}
