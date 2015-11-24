package com.smart.xsoup.w3c;

import org.w3c.dom.TypeInfo;

/**
 * @author code4crafer@gmail.com
 */
public class DummyTypeInfo implements TypeInfo {

    private static final DummyTypeInfo INSTANCE = new DummyTypeInfo();

    public static DummyTypeInfo getInstance(){
        return INSTANCE;
    }

    
    public String getTypeName() {
        return null;
    }

    
    public String getTypeNamespace() {
        return null;
    }

    
    public boolean isDerivedFrom(String typeNamespaceArg, String typeNameArg, int derivationMethod) {
        return false;
    }
}
