package problem3;

public interface MyCollection<E> {
	int size();
	boolean isEmpty();
	void push(E o);
	void pop();
	boolean contains(E o);
	void print();
	void clear();
}