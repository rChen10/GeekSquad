import java.lang.Comparable;

public class Ticket implements Comparable{

    private String _ID;
    private int _priority; // 0 is HighPriority
    private String _name;
    private int _status; // 0 is not yet worked on, 1 is in progress, 2 is resolved

    public Ticket(String Name, int Priority, String ID){
	_priority = Priority;
	_name = Name;
	_status = 0;
	_ID = ID;
    }
    
    public String getID(){
	return _ID;
    }

    public String getName(){
	return _name;
    }
    
    public int getPriority(){
	return _priority;
    }

    public int getStatus(){
	return _status;
    }

    public int setStatus(int newStatus){
	int oldStatus = _status;
	_status = newStatus;
	return oldStatus;
    }

    public int compareTo(Object c){
	if ( ! (c instanceof Ticket) )
	    throw new ArrayIndexOutOfBoundsException(); //picked a random error; can change later
	if (_priority > ((Ticket)c).getPriority())
	    return 1;
	if (_priority < ((Ticket)c).getPriority())
	    return -1;
	else return 0;
    }
    
    public static void main( String[] args ){
    }
}
