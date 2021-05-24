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
    }

        public static void main(String[] args) {
            T tree= new T();
            tree.Insert(12);
            tree.Insert(1);
            tree.Insert(4);
            tree.Insert(0);
            tree.display();
            System.out.println(tree.search(0));

            
        }
    }
