package com.arcode.engine.SupportBPT;

import java.util.*;

/**
 * Internal Node of B+Tree
 * Contains only keys and pointers to child nodes
 */
public class InternalNode extends Node {
    private final List<String> keys;
    private final List<Node> children;

    public InternalNode() {
        this.keys = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    @Override
    public void insert(String key, String value) {
        for (int i = 0; i < keys.size(); i++) {
            if (key.compareTo(keys.get(i)) < 0) {
                children.get(i).insert(key, value);
                return;
            }
        }
        children.get(children.size() - 1).insert(key, value);
    }

    @Override
    public String search(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if (key.compareTo(keys.get(i)) < 0) {
                return children.get(i).search(key);
            }
        }
        return children.get(children.size() - 1).search(key);
    }
}
