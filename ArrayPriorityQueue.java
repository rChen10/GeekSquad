// August (Augie) Murphy
// APCS2 pd03
// HW #32: Getting Past the Velvet Rope
// 2017-04-19


import java.util.ArrayList;

public class ArrayPriorityQueue<T extends Comparable> implements PriorityQueue<T>{

    /**---------------------------------------------------
     * Class: ArrayPriorityQueue
     ** Implements PriorityQueue
     ** Uses ArrayList as its underlying data structure
     ---------------------------------------------------**/
    
    private ArrayList<T> _data; // underlying structure
    
    public ArrayPriorityQueue(){
	_data =  new ArrayList<T>();
    }

    //finds the index that x should be placed in arrayList a and places it there
    public void binarySearch( ArrayList<T> a, int min, int max, T x ){
	int index = (min + max)/2;
	if( min+1 == max ){
	    if( (a.get(min)).compareTo(x) > -1 ){a.add(min,x);}
	    else{ a.add(max,x); }
	}
	else if( x.compareTo(a.get(index)) < 0 ){ binarySearch(a,index,max,x); }
	else if( x.compareTo(a.get(index)) == 0 ){ a.add(index,x); }
	else{ binarySearch(a,min,index,x); }
    }
    
    /* Description copied from interface: PriorityQueue
     * x - is the object added to this priority queue
     * Adds an item to this priority queue.
     */
    public void add( T x ){
	if( isEmpty() ){ _data.add(x); }
        else{ binarySearch(_data,0,_data.size(),x); }
    }
    
    /* Description copied from interface: PriorityQueue
     * Returns true if this stack is empty, otherwise returns false.
     */
    public boolean isEmpty(){
	return _data.size() == 0;
    }
    
    /* Description copied from interface: PriorityQueue
     *  Returns the smallest item stored in this priority queue without removing it.
     */
    public T peekMin(){
	return _data.get(_data.size() - 1);
    }
    
    /* Description copied from interface: PriorityQueue
     * Removes and returns the smallest item stored in this priority queue.
     */
    public T removeMin(){
	return _data.remove(_data.size()-1);
    }

    public String toString(){
	return _data.toString();
    }
    
    public static void main( String[] args ){
	ArrayPriorityQueue<Integer> Barry = new ArrayPriorityQueue<Integer>();
	
	System.out.println( "PriorityQueue Barry: " + Barry );
	System.out.println( "Is Barry empty? (t/f): " + Barry.isEmpty() );
	int r = 10;
	while( r > 0 ){
	    Barry.add( (int)(Math.random()*10) );
	    r--;
	}

	System.out.println( "PriorityQueue Barry: " + Barry );
	System.out.println( "Is Barry empty? (t/f): " + Barry.isEmpty() );
	System.out.println( "Testing peekMin()... " + Barry.peekMin() );
	System.out.println( "Testing removeMin()..." );
	System.out.println( "Now removing" + Barry.removeMin() + "..." );

	System.out.println( "Barry now: " + Barry );

	
    }
}
