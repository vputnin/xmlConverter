package com.example.xml.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class TranspositionEncryptAdapter extends XmlAdapter<String, String> {

    @Override
    public String unmarshal(String s) throws Exception {
        char[] word = s.toCharArray();
        return new String(reverseArray(word));
    }

    @Override
    public String marshal(String s) throws Exception {
        char[] word = s.toCharArray();
        return new String(reverseArray(word));
    }

    private static char[] reverseArray(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            char c = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = c;
        }
        return chars;
    }
}


