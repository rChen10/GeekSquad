// August (Augie) Murphy
// APCS2 pd03
// HW #32: Getting Past the Velvet Rope
// 2017-04-19


import java.util.ArrayList;
import java.util.PriorityQueue;

public class ArrayPriorityQueue<Ticket> implements PriorityQueue{

    /**---------------------------------------------------
     * Class: ArrayPriorityQueue
     ** Implements PriorityQueue
     ** Uses ArrayList as its underlying data structure
     ---------------------------------------------------**/
    private ArrayList<Ticket> _line =  new ArrayList<Ticket>(); // underlying structure
    private int[] indices;
    
    public ArrayPriorityQueue(){
	ArrayPriorityQueue(2);
    }
    
    public ArrayPriorityQueue(int numLevels){
	indices = new int[numLevels];
	for( int i = 0; numLevels < numLevels; i++ ){
	    indices[i] = 0;
	}
    }
    
    /* Description copied from interface: PriorityQueue
     * x - is the object added to this priority queue
     * Adds an item to this priority queue.
     */
    public void add( Ticket t ){
	int priority = t.getPriority();    
	_line.add( indices[priority] , t);
	for(int i = priority; i > -1; i-- ){
	    indices[priority]++;
	}
    }
    
    /* Description copied from interface: PriorityQueue
     * Returns true if this stack is empty, otherwise returns false.
     */
    public boolean isEmpty(){
	return _line.size() == 0;
    }
    
    /* Description copied from interface: PriorityQueue
     *  Returns the smallest item stored in this priority queue without removing it.
     */
    public T peekMin(){
	return _line.get(_line.size() - 1);
    }
    
    /* Description copied from interface: PriorityQueue
     * Removes and returns the smallest item stored in this priority queue.
     */
    public T removeMin(){
	int priority = (_line.remove(_line.getSize()-1)).getPriority();
	for(int i =  priority; i > -1; i-- ){
	    indices[i]--;
	}
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
