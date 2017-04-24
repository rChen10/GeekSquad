

**Design by:** :) GeekSquad :) *(Ricky Chen, Max Korsun, Gabi Newman, Augie Murphy)*

# **HelpDesk**


## __*Our Design*__
Our implementation of HelpDesk uses an ArrayList as the underlying data structure. 
* When the user has a problem, the HelpDesk assigns them a ticket with a unique ID number.
* The User is prompted to provide various fields of information, and their responses are recorded in their corresponding fields.
* (Using Binary Sort: ) The completed ticket is added to it's proper position in the Priority-based Queue of Tickets already at the HelpDesk and the user is notified of their place in the line.
* When the HelpDesk is ready to examine the next ticket, it takes it off of the front of the Queue (the end of the ArrayList). The status of the ticket is updated.
* The resolved ticket's status is updated and the user is alerted. Then, the next ticket is selected...


## __*Interacting with the User*__
The user is guided through the prompts and their responses are parsed using Keyboard.java

The user will be asked to provide various fields of information, including a description of the problem. They'll be notified every time the status of their ticket changes. They'll also be given their initial placement in the line and updated accordingly.

We used keyboard to interact with the user. While we considered using a chatbox like magpie, it seemes like the possibility of the simple chatbox not being able to successfully understand the context of the situation and record the information was to great. 

So, each ticket allows the user to enter a description of their problem, which the HelpDesk reads and interacts with when the time comes.

### __*Trouble Starting? Make Sure you've...*__
1. Cloned into the repo
	```javascript
	git clone git@github.com:rChen10/GeekSquad.git
	```
2. Compiled HelpDesk.java
	```javascript
	javac HelpDesk.java
	```
3. Tried to Run It!
	```javascript
	java HelpDesk
	```
    