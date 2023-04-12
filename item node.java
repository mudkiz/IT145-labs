public class ItemNode {
    private String item;
    private ItemNode nextNodeRef; // Reference to the next node                                        
 
    public ItemNode() {
       item = "";
       nextNodeRef = null;
    }
 
    // Constructor                                                                                     
    public ItemNode(String itemInit) {
       this.item = itemInit;
       this.nextNodeRef = null;
    }
 
    // Constructor                                                                                     
    public ItemNode(String itemInit, ItemNode nextLoc) {
       this.item = itemInit;
       this.nextNodeRef = nextLoc;
    }
 
    // Insert node after this node.                                                                   
    public void insertAfter(ItemNode nodeLoc) {
       ItemNode tmpNext;
 
       tmpNext = this.nextNodeRef;
       this.nextNodeRef = nodeLoc;
       nodeLoc.nextNodeRef = tmpNext;
    }
 
    //constructor
    public void insertAtEnd(ItemNode headNode, ItemNode nodeLoc) {
       ItemNode tmpNext;
       tmpNext = headNode;
       if(tmpNext == null){
          headNode = nodeLoc;
       }
    else {//getter
       while (tmpNext.getNext() != null){
          tmpNext = tmpNext.getNext();
       }//setter
          tmpNext.nextNodeRef = nodeLoc;
    }
    }
 
    // Get location pointed by nextNodeRef                                                             
    public ItemNode getNext() {
       return this.nextNodeRef;
    }
    
    public void printNodeData() {
       System.out.println(this.item);
    }
 }