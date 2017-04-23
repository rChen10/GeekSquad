public interface PriorityQueue<T>{
    public void add( T x );
    public T removeMin();
    public T peekMin();
    public boolean isEmpty();
}
