package com.arcode.engine;

import java.io.IOException;


/**
 * Storage engine to store and retrieve data
 * It uses an append-only log to write data
 * B-Tree to index the data
 */

public class StorageEngine {

    private final AppendOnlyLog appendOnlyLog;
    private final BPlusTree bPlusTree;


    public StorageEngine(String logFilePath, String indexFilePath) {
        this.appendOnlyLog = new AppendOnlyLog(logFilePath);
        this.bPlusTree = new BPlusTree(indexFilePath);
    }


    public void storeData(String data) throws IOException {
        this.appendOnlyLog.append(data);
        this.bPlusTree.insert(data);
    }


    public String retrieveData(String key) {
        return this.bPlusTree.search(key);
    }


    public void close() throws IOException {
        this.appendOnlyLog.close();
        this.bPlusTree.close();
    }
}
