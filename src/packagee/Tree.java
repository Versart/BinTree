/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagee;

/**
 *
 * @author wesle
 */
public class Tree<T extends Comparable> {
    private Node<T> root;
    
    public Tree(){
        this.root=null;
    }
    public Node<T> getRoot(){
        return this.root;
    }
    public void addNode(T data){
        Node<T> newNode=new Node(data);
        if(this.root==null)
            this.root=newNode;
        else{
            Node<T> aux=this.root;
            while(aux!=null){
                if(newNode.getData().compareTo(aux.getData())>0){
                    if(aux.getRight()!=null)
                        aux=aux.getRight();
                    else{
                        aux.setRight(newNode);
                        aux=null;
                    }           
                }
                else
                    if(aux.getLeft()!=null)
                        aux=aux.getLeft();
                    else{
                        aux.setLeft(newNode);
                        aux=null;
                    }        
            }
        }
    }
    public void deleteNode(T data){
        if(this.root!=null){
            Node<T> aux=this.root;
            Node<T> father=null;
            while(aux!=null){
                if(data.compareTo(aux.getData())>0){
                    if(aux.getRight()!=null){
                         father=aux;
                         aux=aux.getRight();
                    }    
                    else{
                       System.out.println("Not found!");
                       aux=null;
                    }        
                }
                else if(data.compareTo(aux.getData())<0){
                    if(aux.getLeft()!=null){
                        father=aux;
                        aux=aux.getLeft();
                    }
                    else{
                        System.out.println("Not found!");
                        aux=null;
                    }                
                }
                else{
                    if(aux.getLeft()==null && aux.getRight()==null){
                        if(father!=null){
                            if(father.getRight()==aux)
                                father.setRight(null);
                            else
                                father.setLeft(null);
                        }
                        else
                            this.root=null;
                        aux=null;
                    }
                    else if(aux.getLeft()==null && aux.getRight()!=null){
                        if(father!=null){
                           Node<T> aux2=aux;
                           Node<T> father2=aux;
                           aux2=aux2.getRight();
                           while(aux2.getLeft()!=null){
                               father2=aux2;
                               aux2=aux2.getLeft();
                           }
                           if(father.getLeft()==aux)
                               father.setLeft(aux2);
                           else
                               father.setRight(aux2);
                           if(father2.getLeft()==aux2)
                               father2.setLeft(null);
                           else
                               father2.setRight(null);
                            aux2.setLeft(aux2.getLeft());
                            aux2.setRight(aux.getRight());
                        }
                        else{
                           Node<T> aux2=aux;
                           Node<T> father2=aux;
                           aux2=aux2.getRight();
                           while(aux2.getLeft()!=null){
                               father2=aux2;
                               aux2=aux2.getLeft();
                           }
                           this.root=aux2;
                           if(father2.getLeft()==aux2)
                               father2.setLeft(null);
                           else
                               father2.setRight(null);
                            aux2.setLeft(aux.getLeft());
                            aux2.setRight(aux.getRight());
                        }
                        aux=null;
                    }
                    else if(aux.getLeft()!=null && aux.getRight()==null){
                        if(father!=null){
                            Node<T> aux2=aux;
                            Node<T> father2=aux;
                            aux2=aux2.getLeft();
                            while(aux2.getRight()!=null){
                                father2=aux2;
                                aux2=aux2.getRight();
                            }
                            if(father.getLeft()==aux)
                                father.setLeft(aux2);
                            else
                                father.setRight(aux2);
                            if(father2.getLeft()==aux2)
                                father2.setLeft(null);
                            else
                                father2.setRight(null);
                            aux2.setLeft(aux.getLeft());
                            aux2.setRight(aux.getRight());
                        }
                        else{
                           Node<T> aux2=aux;
                           Node<T> father2=aux;
                           aux2=aux2.getLeft();
                           while(aux2.getRight()!=null){
                               father2=aux2;
                               aux2=aux2.getRight();
                           }
                           this.root=aux2;
                           if(father2.getLeft()==aux2)
                               father2.setLeft(null);
                           else
                               father2.setRight(null);
                            aux2.setLeft(aux.getLeft());
                            aux2.setRight(aux.getRight());
                        }
                        aux=null;
                    }
                    else{
                        if(father!=null){
                           Node<T> aux2=aux;
                           Node<T> father2=aux;
                           aux2=aux2.getRight();
                           while(aux2.getLeft()!=null){
                               father2=aux2;
                               aux2=aux2.getLeft();
                           }
                           if(father.getLeft()==aux)
                               father.setLeft(aux2);
                           else
                               father.setRight(aux2);
                           if(father2.getLeft()==aux2)
                               father2.setLeft(null);
                           else
                               father2.setRight(null);
                           aux2.setLeft(aux.getLeft());
                           aux2.setRight(aux.getRight());
                        }
                        else{
                           Node<T> aux2=aux;
                           Node<T> father2=aux;
                           aux2=aux2.getRight();
                           while(aux2.getLeft()!=null){
                               father2=aux2;
                               aux2=aux2.getLeft();
                           }
                           this.root=aux2;
                           if(father2.getLeft()==aux2)
                               father2.setLeft(null);
                           else
                               father2.setRight(null);
                           aux2.setLeft(aux.getLeft());
                           aux2.setRight(aux.getRight());
                           
                        }
                        aux=null;
                    }
                }
            }
        }      
    }
    public void inOrder(Node<T> root){
        if(root!=null){
            inOrder(root.getLeft());
            System.out.println(root.getData());
            inOrder(root.getRight());    
        }
    }
    public void preOrder(Node<T> root){
        if(root!=null){
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void posOrder(Node<T> root){
        if(root!=null){
            posOrder(root.getLeft());
            posOrder(root.getRight());
            System.out.println(root.getData());
        }
    }
    
    
}
