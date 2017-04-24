import cs1.Keyboard;
import java.lang.Math;
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
		
		
		int ID = (int)(Math.random() * 1000);
		System.out.println("Your ID is " + ID + ". Keep Track of it!");

		desk._line.add( new Ticket(name, priority, ID) );
		
	    }
	    

	    else if ( response == 2){
		int statIndex =-1;
		System.out.println("What is your ID?"); // ID should be generated so change later
		int IDcheck = Keyboard.readInt();
		for(int i = 0; i <desk._line.size(); i++){
		    int TempID = desk._line.get(i).getID();
		    if(TempID == IDcheck){
			statIndex = i;
			break;
		    }
		}
		if(statIndex == -1 ){
		    System.out.println("Invalid ID");
		}
		else{
		    System.out.println(desk._line.get(statIndex).getStatus());
		}
		
	    }

	    else{

		System.out.println("Invalid response");
	    }

	    
	}
    }
}
