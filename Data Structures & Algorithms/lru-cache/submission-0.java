class Node {
    int key;
    int val;
    Node next;
    Node prev;

    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class LRUCache {
    int capacity;
    Map<Integer, Node> cache;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)) return -1;

        Node node = cache.get(key);
        remove(node);
        add(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node oldNode = cache.get(key);
            remove(oldNode);
        }

        Node node = new Node(key,value);
        add(node);
        cache.put(key, node);

        if(cache.size() > capacity){
            Node toDelete = tail.prev;
            remove(toDelete);
            cache.remove(toDelete.key); 
        }
    }

    public void add(Node node){
        Node nextNode = head.next;

        head.next = node;
        node.prev = head;

        node.next = nextNode;
        nextNode.prev = node;    
    }

    public void remove(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}
