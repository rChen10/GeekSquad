import cs1.Keyboard;
import java.lang.Math;

public class HelpDesk{

    ArrayPriorityQueue<Ticket> _line;
 
    
    public HelpDesk(){
	_line = new ArrayPriorityQueue<Ticket>();
    }

    public boolean hasNext(){
	return _line.size() > 1;
    }

    public Ticket next(){
	return _line.removeMin();
    }

    public void userPrompt(){

	boolean response = false;

	while( !response ){
	    
	    String s = "What do you wish to do?\n";
	    s += "1. Register new ticket.\n";
	    s += "2. Check the status of a ticket.\n";  
	    System.out.println(s);
	    
	    int choice;
	    try{ choice = Keyboard.readInt(); }
	    catch( Exception e ){ choice = -1; }

	    if ( choice == 1 ){
		response = true;
		writeTicket();
	    }
	
	    else if( choice == 2 ){
		response = true;
		checkStatus();
	    }
	
	    else{ System.out.println("Invalid Response, please try again."); }
	}
    }

    public void writeTicket(){
	
	boolean response = false;
	String name = "";
	int priority = 3;
	String description = "";
	
	System.out.println("What is your name?");

	try{ name = Keyboard.readWord() + " "; }
	catch( Exception e ){ name = ""; }
		
	while( !response ){
	    String s = "\nChoose the option that best describes you...\n";
	    s += "0. I am a CEO, Executive Director, etc...\n";
	    s += "1. I am an honors member/have a rewards card\n";
	    s += "2. I am an employee here\n";
	    s += "3. I am a customer!!!\n";
	    System.out.println(s);

	    try{ priority = Keyboard.readInt(); }
	    catch( Exception e ){ priority = 3; }
		
	    if( priority > -1 && priority < 4 ){
		response = true; 
	    }	
	}
	
	response = false;
	while( !response ){
	    System.out.println("Please describe your problem:");
	    try{ description = Keyboard.readString(); response = true; }
	    catch( Exception e ){ System.out.println( "Oops! Something went wrong. Please try again."); }
	}
	
	int ID = (int)(Math.random() * 100000);
	System.out.println("Your ID is " + ID + ". Keep Track of it!");

	_line.add( new Ticket(name, priority, ID, description) );	
    }
	
    public void checkStatus(){ 
	int statIndex =-1;
	System.out.println("What is your ID?"); // ID should be generated so change later
	int IDcheck = Keyboard.readInt();
	for(int i = 0; i < _line.size(); i++){
	    int TempID = _line.get(i).getID();
	    if(TempID == IDcheck){
		statIndex = i;
		break;
	    }
	}
	if(statIndex == -1 ){
	    System.out.println("Invalid ID");
	}
	else{
	    System.out.println("0 indicates waiting, 1 indicates processing, 2 indicates solved: \t" + _line.get(statIndex).getStatus());
	}
    }

    public String question(){
	return _line.peekMin().getStatus() + "";
    }

    public static void main( String[] args ){
	Boolean solved = false;
	HelpDesk desk = new HelpDesk();

	while( !solved ){
	    desk.userPrompt(); //SAME CODE!!! It's just in methods with try and catch blocks and a description option

	    boolean valid = false;
	    while( !valid ){
		System.out.println("Is that all?(y/n)");
		String ans = "";
		try{ ans = Keyboard.readWord(); }
		catch( Exception e ){ ans = "y"; }

		if( "Y".equals(ans) || "y".equals(ans) ){
		    solved = true;
		    valid = true;
		}
		else if( "n".equals(ans) || "N".equals(ans) ){
		    valid = true;
		}
	    }

	}

	//Do we need something like this?
	/**
	   while( desk.hasNext() ){
	   Ticket this = next();
	   this.setStatus(1);
	   //solving stuff
	   this.setStatus(2);
	   }
	**/
    }
}
