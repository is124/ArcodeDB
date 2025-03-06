package com.arcode.engine;

import com.arcode.engine.SupportBPT.*;
import java.io.IOException;

/**
 * B+ Tree to index the data
 * Simplified B+ Tree implementation.
 */
public class BPlusTree {
    private final Node root;

    public BPlusTree(String indexFilePath) {
        this.root = new LeafNode();
    }
    
    public void insert(String key) {
        this.root.insert(key, key);
    }
    
    public String search(String key) {
        return root.search(key);
    }

    public void close() throws IOException {}
}
