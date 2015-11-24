package com.smart.xsoup.w3c;


import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author code4crafer@gmail.com
 */
public class NodeListAdaptor implements NodeList {

    private List<? extends org.jsoup.nodes.Node> nodes;

    public NodeListAdaptor(List<? extends org.jsoup.nodes.Node> nodes) {
        this.nodes = nodes;
    }

    public Node item(int index) {
        return NodeAdaptors.getNode(nodes.get(index));
    }

    public int getLength() {
        return nodes.size();
    }
}
