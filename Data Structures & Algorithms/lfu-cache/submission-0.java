class Node {
    int key;
    int val;
    int freq;
    Node next;
    Node prev;

    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.freq = 1;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    DoublyLinkedList() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    void add(Node node) {
        Node nextNode = head.next;

        head.next = node;
        node.prev = head;

        node.next = nextNode;
        nextNode.prev = node;
    }

    void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    boolean isEmpty() {
        return head.next == tail;
    }
}

class LFUCache {

    int capacity;
    int minFreq;

    Map<Integer, Node> cache;
    Map<Integer, DoublyLinkedList> freqMap;


    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.freqMap = new HashMap<>();
        this.minFreq = 0;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)) return -1;
        Node node = cache.get(key);
        increaseFreq(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.val = value;
            increaseFreq(node);
            return;
        }
        if (cache.size() == capacity) {
            DoublyLinkedList list = freqMap.get(minFreq);
            Node toDelete = list.tail.prev;
            list.remove(toDelete);
            cache.remove(toDelete.key);
        }
        Node node = new Node(key, value);
        cache.put(key, node);
        DoublyLinkedList list = freqMap.getOrDefault(1, new DoublyLinkedList());
        list.add(node);
        freqMap.put(1, list);
        minFreq = 1;

    }

    private void increaseFreq(Node node) {
        int oldFreq = node.freq;
        DoublyLinkedList oldList = freqMap.get(oldFreq);
        oldList.remove(node);
        if (oldFreq == minFreq && oldList.isEmpty()) {
            minFreq++;
        }
        node.freq++;
        DoublyLinkedList newList = freqMap.getOrDefault(node.freq, new DoublyLinkedList());
        newList.add(node);
        freqMap.put(node.freq, newList);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */