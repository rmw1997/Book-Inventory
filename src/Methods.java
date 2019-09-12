
public class Methods<T> {
	
	public Node<T> top;
	
	public Methods(){
		
	}
	public boolean isEmpty(){
		return top==null;
	}
	public void push(T title, T author, T isbn, T price, T genre){
		top = new Node<T>(title, author, isbn, price, genre, top);
	}
	public void pop(){
		if (isEmpty())
			System.out.println("The list is already empty.");
		else
			top=top.next;
	}
	
	public void printAll(){
		Node<T> temp;
		System.out.println("\nCurrently available books: (Title - Author - ISBN Number - Price) \n");
		for(temp=top; temp!=null; temp=temp.next){
			System.out.println(temp.Title+" - "+temp.Author+" - "+temp.ISBN+" - SR"+temp.Price);
		}
	}
	
	
	public void find(T book){
		Node<T> temp;
		for(temp=top; temp!=null && !temp.Title.equals(book) ; temp=temp.next);
		if (temp!=null)
			System.out.println(book+" exists in the inventory.");
		else
			System.out.println("("+book+")");
	}
	
	
	
	public void print(String el){ 
			Node<T> temp;
			for(temp=top; temp!=null ;temp=temp.next){
					if (temp.Genre.equals(el)) 
						System.out.println(temp.Title+" - "+temp.Author+" - "+temp.ISBN+" - SR"+temp.Price);}		
		}
	
	}








				
	
		
				
					
				
			
			
			
			

			
				
		
	
	
		
	
	
	
	


