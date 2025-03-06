# Building NoSQL Database Roadmap

## Key components of the project

### Phase 1: Core Foundation (Storage & Data Structures)
1. **Storage Engine:-** \
    a) **Append-Only Log -**   (Writes) Data is only appended, never modified, with new versions added sequentially. \
    b)  **B-Tree -** (Reads) Used for index-based reading.  \
    c) **Memory-Mapped Files -** (Optimizes reads and writes) Maps files directly into memory for faster access.


2. **Data Structures:-** \
    a) B+ Tree (Since we are using B-Tree) 


### Phase 2: Query Processing & Transaction
3. **Query Parsing & Execution:-** \
    a) Query parser to convert user queries into an execution plan. \
    b) JSON-like Query Engine. \
    c) Execution engine that interprets and executes queries

4. **Transaction Management:-** \
    a) Write-Ahead Logging (WAL) for durability \
    b) ACID transactions with locking \
    c) concurrency control mechanisms

### Phase 3: Concurrency, Recovery & Networking

5. **Networking Layer:-**\
    a) Server-Client architecture to send/receive requests \
    b) Serialization & Deserialization for network communication

6. **Concurrency Control:-**\
    a) Multi-threading to handle multiple requests \
    b) Locking Mechanism \
    c) Deadlock Detection


### Phase 4: Scalability, CAP and Advanced Concepts

7. **Replication & Sharding:-**\
    a) Replication for high availability (master-slave) \
    b) Sharding for scalability \
    c) Consistency & Availability trade-offs


### Phase 5: Security, Monitoring & Optimization