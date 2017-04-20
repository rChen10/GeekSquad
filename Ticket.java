import java.lang.Comparable;

public class Ticket{

    private String _ID;
    private int _priority; // 0 is HighPriority
    private String _name;
    private int _status; // 0 is not yet worked on, 1 is in progress, 2 is resolved

    public Ticket(String Name, int Priority, int ID){
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

    public String getID(){
	return _ID;
    }

    public int getStatus(){
	return _status;
    }

    public int setStatus(int newStatus){
	oldStatus = _status;
	_status = newStatus;
	return oldStatus;
    }
    
    public static void main( String[] args ){
    }
}
