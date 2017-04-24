import cs1.Keyboard;

public class HelpDesk{

    ArrayPriorityQueue<Ticket> _line;

    public HelpDesk(){
	_line = new ArrayPriorityQueue<Ticket>();
    }

    public String diagnose(){
	return "";
    }

    public String resolve(){
	return "";
    }

    public String question(){
	return _line.peekMin().getStatus() + "";
    }

    public static void main( String[] args ){
	HelpDesk desk = new HelpDesk();

	while (true){
	    String s = "What do you wish to do?\n";
	    s += "1. Register new ticket.\n";
	    s += "2. Check the status of a ticket.\n";
	    
	    System.out.println(s);

	    int response = Keyboard.readInt();

	    if ( response == 1){
		System.out.println("What is your name?");
	        String name = Keyboard.readWord();
		
		System.out.println("What is your priority?");
		int priority = Keyboard.readInt();
		
		System.out.println("What is your ID?"); // ID should be generated so change later
		String ID = Keyboard.readWord();

		desk._line.add( new Ticket(name, priority, ID) );
		
	    }

	    else if ( response == 2){
		System.out.println(desk.question());
	    }

	    else{
		System.out.println("Invalid response");
	    }

	    
	}
    }
}
