package day18;

public class BST {
    static BNode root;

    public int add(int value){
        BNode newNode, current;

        newNode = new BNode(value);
        if(root == null){
            root = newNode;
            current = root;
        }
        else{
            current = root;
            while(current.left != null || current.right != null){
                if(newNode.data < current.data){
                    if(current.left != null)
                        current = current.left;
                    else
                        break;
                }
                else{
                    if(current.right != null)
                        current = current.right;
                    else
                        break;
                }
            }
            if(newNode.data < current.data)
                current.left = newNode;
            else
                current.right = newNode;
        }

        return value;
    }

    public void inorder(BNode root){
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }



}


