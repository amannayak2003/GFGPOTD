import org.w3c.dom.Node;

public class day58 {
    boolean isIdentical(Node root1, Node root2)
	{   
	   // base case
	   if(root1==null&&root2==null){
	       return true;
	   }
	    if(root1!=null && root2!=null){
	       return(root1.data == root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right ));
	        
	    }
	    
	    return false;
	    
	    
	}

    
}