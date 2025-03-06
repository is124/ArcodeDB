package com.arcode.engine.SupportBPT;

import java.util.*;

/**
 * Leaf Node of B+Tree
 * Contains keys and associated data
 */
public class LeafNode extends Node {
    private final List<String> keys;
    private final List<String> values;

    public LeafNode() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
        LeafNode next = null;
    }

    @Override
    public void insert(String key, String value) {
        keys.add(key);
        values.add(value);
    }

    @Override
    public String search(String key) {
                for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) {
                return values.get(i);
            }
        }
        return null;
    }
}
