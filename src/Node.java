
public class Node<T> {
	
	public T Title, Author, ISBN, Price, Genre;
	public Node<T> next;
	
	public Node() {
		this(null, null, null, null, null, null);
	}
	public Node(T title, T author, T isbn, T price, T genre) {
		this(title, author, isbn, price, genre, null);
	}
	public Node(T title, T author, T isbn, T price, T genre, Node<T> link) {
		Title=title;
		Author=author;
		ISBN=isbn;
		Price=price;
		Genre=genre;
		next=link;
		
	}

}
