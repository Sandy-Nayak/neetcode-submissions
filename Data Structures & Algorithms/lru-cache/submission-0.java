class LRUCache {
    class Node{
        int key;
        int val;
        Node next; 
        Node prev;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }  
    }

    private final Map<Integer, Node> map;
    private final int capacity;

    private final Node head;
    private final Node tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;

    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);
        remove(node);
        insertAtFront(node);

        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            remove(node);
            insertAtFront(node);

            return;
        }

        Node node = new Node(key, value);
        map.put(key, node);
        insertAtFront(node);

        if(map.size() > capacity){
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }

    }

    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node .prev;
    }

    private void insertAtFront(Node node){
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
}
