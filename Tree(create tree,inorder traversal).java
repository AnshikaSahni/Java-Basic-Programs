public class Tree {
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    public static class T
    {      
        Node root;
        public void Insert(int data)
        { 
            Node temp=new Node(data);
            if(root==null)
            {
                root=temp;
            }
            else
            {   
                Node t=root;
                while(true)
                {  
                   if(data<t.data)
                    {
                        if(t.left==null)
                         {
                          t.left=temp;
                          break;
                        }
                        else{
                            t=t.left;
                        }
                    }
                    else
                    {
                        if(t.right==null)
                         {
                             t.right=temp;
                             break;
                         }
                         else
                         {t=t.right;
                        }
                    }
                }
            }

        }
        public void inorder(Node node)
        {
          if(node==null)
          return ;
          inorder(node.left);
          System.out.println(node.data+" ");
          inorder(node.right);


        }
        public void display()
        {
            inorder(root);
        }
    }
        public static void main(String[] args) {
            T tree= new T();
            tree.Insert(12);
            tree.Insert(1);
            tree.Insert(4);
            tree.Insert(0);
            tree.display();
            

            
        }
    }

