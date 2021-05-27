public class Tree {
    //CREATING NODE OF TREE
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
    // INSERTING IN TREE
    public static class T
    {      
        Node root;
        int answer=0;
        int sum=0;
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
        // INORDER TRAVERSAL
        public void inorder(Node node)
        {
          if(node==null)
          return ;
          inorder(node.left);
          System.out.print(node.data+" ");
          inorder(node.right);


        }
        //PREORDER TRAVERSAL
        public void pre_order(Node node)
        {
            if(node==null)
            {
                return;
            }
            System.out.print(node.data+" ");
            pre_order(node.left);
            pre_order(node.right);
        }
        //POSTORDER TRAVERSAL
        public void post_order(Node node)
        {
            if(node==null)
            {
                return;
            }
            post_order(node.left);
            post_order(node.right);
            System.out.print(node.data+" ");
        }
        // TO DISPLAY THE TREE(INORDER,PREORDER,POSTORDER)
        public void display()
        {  
            System.out.print("INORDER:"+" ");
            inorder(root);
            System.out.println(" ");
            System.out.print("PREORDER:"+" ");
            pre_order(root);
            System.out.println(" ");
            System.out.print("POSTORDER:"+" ");
            post_order(root);
            System.out.println(" ");


        
        }
        // DELETING A GIVEN NODE
        public Node DeletingNode(Node node,int key)
        {
            if(node==null)
            {
                return node;
            }
            else if(key<node.data)
             {
                 node.left= DeletingNode(node.left,key);
             }
            else if(key>node.data)
             {
                 node.right=DeletingNode(node.right,key);
             }
            else
              { 
                  if(node.left==null&&node.right==null)
                  {
                      node=null;
                  }
                  else if(node.left==null)
                  {
                      node.data=node.right.data;
                      node.right=null;
                  }
                  else if(node.right==null)
                  {
                      node.data=node.left.data;
                      node.left=null;
                  }
                  else
                    {
                        Node temp=FindMin(node.right);
                        node.data=temp.data;
                        node.right=DeletingNode(node.right,temp.data);
                    }
              }
              return node;
            }
        // METHOD USES IN DELETING NODE METHOD TO FIND MIN NO. IN RIGHHT OF TREE
            public Node FindMin(Node node)
            {
              while(node!=null)
              {
                  node=node.left;
              }
              return node;
            }
         //Displaying TREE AFTER DELETION   
            public void AfterDeletion(int key)
            {   
                Node n=DeletingNode(root,key);
                System.out.print("TREE AFTER DELETION: ");
                inorder(n);
            }
        // RECURSIVE APPROACH FOR SEARCHING A NO.
        public Boolean S(int d,Node n)
        {
            if(n==null)
            {
                return false;
            }
            else if(d==n.data)
            {   
                return true;
            }
            if(d<n.data)
            {
             return S(d,n.left); 
               
            }
            else
            {
                return  S(d,n.right);
            }
        }
        // ITERATIVE APPROACH TO SEARCH A NO.
        public Boolean search(int data)
        {  Node d=root;
            if(data==d.data)
            {
                return true;
            }
            else
            {
                while(true)
                {
                    if(data<d.data)
                    {
                        if(d.left==null)
                        {
                            return false;
                        }
                        else if(d.left.data==data)
                        {
                            return true;
                        }
                        else  
                         {
                             d=d.left;
                         }
                    
                    }
                    else{
                        if(d.right==null)
                        {
                            return false;
                        }
                        else if(d.right.data==data){
                            return true;

                        }
                        else 
                        {
                            d=d.right;
                        }      
                    }

                }
            }
        }
        // CALLING BOTH SEARCHING METHODS.
        public void Search(int data)
        {   
            System.out.print("RECURSIVE SEARCH:");
            System.out.println(S( data,root));
            System.out.print("ITERATIVE SEARCH:");
            System.out.println(search(data));
            
        }
        // TO FIND THE VALUE OF TREE CLOSEST TO GIVEN NO.
        public int ClosestNum(Node node,int num,int n)
        {
             if(node==null)
             {
                 return answer;
             }
             if(Math.abs(num-node.data)<n)
             {
                 n=Math.abs(num-node.data);
                 answer=node.data;
             }
             if(num>node.data)
             {
                 return ClosestNum(node.right,num,n);
             }
             else if(num<node.data)
             { 
                 return ClosestNum(node.left,num,n);
             }
             else 
            {
                return answer;
            }

        }
        //DISPLAYING CLOSEST NO.
        public void closest(int  num)
        {    System.out.print("CLOSEST: ");
             System.out.println( ClosestNum(root,num,Integer.MAX_VALUE));
        }
        // SUM OF TREE
        public int SUM(Node node)
        {
           if(node==null)
              {return sum;}
           
           SUM(node.left);
           sum+=node.data;
           SUM(node.right);
           return sum;
        }
        //DISPLAYING SUM
        public void PRINTSUM()
        {   
            System.out.print("SUM OF TREE: ");
            System.out.println(SUM(root));
        }
    }

        public static void main(String[] args) {
            T tree= new T();
            tree.Insert(12);
            tree.Insert(1);
            tree.Insert(4);
            tree.Insert(0);
            tree.display();
            tree.Search(4);
            tree.closest(5);
            tree.PRINTSUM();
            tree.AfterDeletion(4);
            
            
            
            
        }
    }
OUTPUT:
INORDER: 0 1 4 12  
PREORDER: 12 1 0 4  
POSTORDER: 0 4 1 12  
RECURSIVE SEARCH:true
ITERATIVE SEARCH:true
CLOSEST: 4
SUM OF TREE: 17
TREE AFTER DELETION: 0 1 12 

