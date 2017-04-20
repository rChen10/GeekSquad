// August (Augie) Murphy
// APCS2 pd03
// HW #32: Getting Past the Velvet Rope
// 2017-04-19


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.lang.Comparable;

public class ArrayPriorityQueue<T> implements PriorityQueue{

    /**---------------------------------------------------
     * Class: ArrayPriorityQueue
     ** Implements PriorityQueue
     ** Uses ArrayList as its underlying data structure
     ---------------------------------------------------**/

    private ArrayList<T> _data; // underlying structure

    public ArrayPriorityQueue(){
    }

    /* Description copied from interface: PriorityQueue
     * x - is the object added to this priority queue
     * Adds an item to this priority queue.
     */
    public void add( T x ){

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

    }
    
    /* Description copied from interface: PriorityQueue
     * Removes and returns the smallest item stored in this priority queue.
     */
    public T removeMin(){

    }
    
    public static void main( String[] args ){
	PriorityQueue Barry = new PriorityQueue<Integer>();
	
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
