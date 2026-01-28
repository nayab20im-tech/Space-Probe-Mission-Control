public class LinkedList{

	private Node head;
	private int noOfEnteries;

	private void initialize(){
		this.head = null;
		this.noOfEnteries = 0;
	}

	public LinkedList(){
		initialize();
	}

	public boolean isEmpty(){
		return noOfEnteries == 0;
	}

	//Add Probe

	public void addProbe(SpaceProbe probe){
		Node newProbe = new Node(probe);
		if(isEmpty()){
			head = newProbe;
		}else{
			Node lastNode = getNodeAt(noOfEnteries);
			lastNode.setNextNode(newProbe);
		}
		noOfEnteries++;
	}

	//Remove Probe

	public SpaceProbe removeProbe(String name) {
    if (isEmpty()) {
        throw new IllegalStateException("The list is empty.");
    }

    if (head.getData().getName().equals(name)) {
        SpaceProbe result = head.getData();
        head = head.getNextNode();
        noOfEnteries--;
        return result;
    }

    Node current = head;
    while (current.getNextNode() != null) {
        if (current.getNextNode().getData().getName().equals(name)) {
            SpaceProbe result = current.getNextNode().getData();
            current.setNextNode(current.getNextNode().getNextNode());
            noOfEnteries--;
            return result;
        }
        current = current.getNextNode();
    }

    throw new IllegalArgumentException("No probe found with the name: " + name);
}


	//Find A Probe
	     public boolean contains(String name) {
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData().getName().equals(name)) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }

        return false;
    }

    //Display Method
    public void display() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                SpaceProbe probe = currentNode.getData();
                System.out.println("Name: " + probe.getName() + ", Mission: " + probe.getMission() + ", Distance from Earth: " + probe.getDistanceFromEarth() + " million km, Active: " + probe.getIsActive());
                currentNode = currentNode.getNextNode();
            }
        }
    }

	private Node getNodeAt(int pos){
		if(pos<1 || pos>noOfEnteries){
			throw new IndexOutOfBoundsException("Invalid position: "+pos);
		}

		Node curr = head;
		for(int i=1; i<pos; i++){
			curr = curr.getNextNode();
		}

		return curr;
	}
}