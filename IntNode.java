/**
 * Defines a node which stores an integer value and the reference to the next node.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class IntNode{
  
  private int data;  //Integer data for this Node
  private IntNode link;  //Reference to next Node
  
 /**
  * Creates a node with data and node passed as parameters.
  *
  * @param data The specified Integer data of this node.
  * @param link The specified reference to the next node.
  */       
  public IntNode(int data, IntNode link){
    this.data = data;
    this.link = link;
  }
  
 /**
  * Returns the node of the link.
  *
  * @return The reference to the next node.
  */       
  public IntNode getLink(){
    return link;
  }
  
 /**
  * Sets the link of this node to the node passed as the parameter.
  * 
  * @param link The specified link for this node to reference.
  */       
  public void setLink(IntNode link){
    this.link = link;
  }
  
 /**
  * Returns the Integer data of this node.
  *
  * @return The Integer data of this node.
  */       
  public int getData(){
    return data;
  }
  
 /**
  * Returns the integer data of the node as a String.
  * 
  * @return The Integer data of this node as a String.
  */      
  @Override
  public String toString(){
    return "" + data;
  }
}
