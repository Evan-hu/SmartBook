package com.smart.selector;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Replace selector.<br>
 *
 * @author code4crafter@gmail.com <br>
 * @since 0.1.0
 */
public class ReplaceSelector implements Selector {

    private String regexStr;

    private String replacement;

    private Pattern regex;

    public ReplaceSelector(String regexStr, String replacement) {
        this.regexStr = regexStr;
        this.replacement = replacement;
        try {
            regex = Pattern.compile(regexStr);
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("invalid regex", e);
        }
    }

    
    public String select(String text) {
        Matcher matcher = regex.matcher(text);
        return matcher.replaceAll(replacement);
    }

    
    public List<String> selectList(String text) {
        throw new UnsupportedOperationException();
    }

    
    public String toString() {
        return regexStr + "_" + replacement;
    }

}
