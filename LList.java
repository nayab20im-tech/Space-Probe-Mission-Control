public class LList implements ListInterface {
    private Node first;
    private int numberOfEntries;

    public LList() {
        initialize();
    }

    @Override
    public void add(Integer entry) {
        Node newNode = new Node(entry);
        if (isEmpty()) {
            first = newNode;
        } else {
            Node lastNode = getNodeAt(numberOfEntries);
            lastNode.setNextNode(newNode);
        }
        numberOfEntries++;
    }

    @Override
    public Integer getEntry(int pos) {
        if (pos >= 1 && pos <= numberOfEntries) {
            return (Integer) getNodeAt(pos).getData();
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds must be from 1 to " + numberOfEntries + 1);
        }
    }

    @Override
    public int getLength() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public void clear() {
        initialize();
    }

    private void initialize() {
        first = null;
        numberOfEntries = 0;
    }

    private Node getNodeAt(int givenPos) {
        Node curr = first;
        for (int i = 1; i < givenPos; i++) {
            curr = curr.getNextNode();
        }
        return curr;
    }

    @Override
    public void removeAllOddValues() {
    if(isEmpty()){
        throw new IndexOutOfBoundsException("List is Empty");
    }
    while(first!=null && first.getData() % 2==1){
        first = first.getNextNode();
        numberOfEntries--;
    }
    Node curr = first;
    for(int i=1; i<numberOfEntries; i++){
       if(curr != null && curr.getNextNode()!=null && curr.getNextNode().getData() %2 == 1){
        curr.setNextNode(curr.getNextNode().getNextNode());
        numberOfEntries--;
       }
       else{
        curr = curr.getNextNode();
       }
    }
}


   
}

