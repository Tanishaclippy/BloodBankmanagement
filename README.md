# BloodBankmanagement
 Problem statement :An application to communicate between the donors and the blood bank and hospitals.

FEATURES :
       
 1)The application contains two portals, one for the user and the other for the hospital side .

2) Covers major areas in the city which includes two regions .

> PCMC
>PMC

3)Quick action when in need of blood during times of urgency .

4)Find blood groups easily

5)Find nearby hospitals

6)A questionnaire to check whether the person  is fit to be a donor.

7)A fun awareness quiz about the need and developments in Blood donation camps.

8)A chat bot for help for any confusion and doubts regarding upcoming events.

9) A frequently asked questions section that clears out the doubts 



DATA STRUCTURES  :

1)Queue 

Use of queue data structures for the queuing of the donors after successful registration and donation of blood.
The queue data structures is based on first in , first out method.As the blood has a life of 120 days queue becomes an important data structures here.

Why queues ?
1.Orderly processing
2.Versatility in operations
3.Space and time complexity 
 Queues often have constant time complexity

2)Binary trees

Binary trees are basically non linear data structures which can have minimum 0 nodes and at most 2 nodes .They are of four types and here we have a perfect binary tree for the locations of the hospital.


In the binary tree , our root node is the city of Pune.

The left side of Pune is the PMC area whereas the right side is the PCMC area.

The PMC is further divided into two sections:South and North Pune .

South Pune has two main blood bank centres  in the locations NIBM and Katraj which are on the left and right side of the node respectively.

North Pune has the two main blood bank centres  at the locations Dhanori and Shivaji Nagar .
 
Why use Binary trees ?
1.Stores ordered data 
  The ordered data is stored in a balance and helps in traversals during     operations that include searching ,deletion,etc
2.Efficient searching and data retrieval
3.Efficient memory management and allocation.

3) Hashmaps 
HashMap in Java is a data structure that stores key-value pairs. It uses a hashing technique to store elements and provides constant-time performance for basic operations like get and put if the hash function disperses the elements properly among the buckets.We have used hashmaps in the frequently asked questions sections where the hashmap takes key as the question input strings and the value contains the answers to the questions.
The following are the reasons for using hashmaps:
Has fast data retrieval
Key-value storage 
Hence,association of unique keys in the questions
Efficient searching
Has the search time complexity of O(n)
     4.Can be optimised according to the uniqueness

ALGORITHM
Initialization:

Import necessary packages and initialize scanner object for input.
Define classes: UserValidity, BloodBankTree, ChatSystem, FunFact.
Initialize necessary data structures and variables (queues, trees, etc.).
Display a welcome message and show the main menu options to the user.
User Registration and Donation:
User selects the option for registration.
User enters personal details (name, age, address, gender, blood group).
Validate user eligibility for blood donation:
Check age (must be between 18 and 65).
Inquire about recent travel history, ongoing infections, medical conditions, recent surgeries, and medications.
If any eligibility criteria are not met, display appropriate error messages.
If eligible:
Add the user to the donor queue.
Display a confirmation message and the user's position in the queue.
Blood Bank Requests (For Hospitals):
Hospital selects the option to raise a blood request.
Hospital enters the required blood type for the patient.
Search the blood bank data structure (e.g., binary search tree) for matching donors of the specified blood type.
Display relevant donor information (name, contact, location) to the hospital.
Hospital confirms the donation request, and the donor is notified.
Activities Corner:
User selects the option to view activities.
Display upcoming blood donation drives, recipient stories, and donor stories.
User can choose to participate in a quiz:
Display quiz questions with multiple-choice options.
Validate user answers and calculate the score.
Display the user's score and appropriate messages based on the score.
Frequently Asked Questions (FAQ) System:
User selects the option to view FAQs.
Display a list of frequently asked questions.
Allow users to select a question and display the corresponding answer.
Provide an option to go back to the main menu.
Chat System:
User selects the option to access the chat system.
Display chat system options:
Send a message
Receive messages
View chat history
Exit chat system
If the user selects "Send a message":
User enters their name and chooses a question from predefined questions.
Store the user's message in the chat history.
Chatbot generates and displays a response based on the selected question.
If the user selects "Receive messages":
Display any new messages received from the chatbot.
If the user selects "View chat history":
Display the entire chat history (sent and received messages).
Provide an option to exit the chat system and return to the main menu.
 Exit:
Provide an option to exit the Blood Bank Management System.
Display a farewell message and terminate the program.

OUTPUTS 
1)LOGIN/REGISTRATION OF DONORS 

<img src="![registration](https://github.com/Tanishaclippy/BloodBankmanagement/assets/127332784/73139b89-ded9-4999-a4ce-26b63c926879)
" alt="My cool logo"/>







2)INFORMATION UNDERTAKING 

3)QUIZ SECTION 

4) BLOOD BANK CONNECTION AND MONOLOGUE 


5)FREQUENTLY ASKED QUESTIONS SECTION


6)ACTIVITY CORNER 




7)CHAT SECTION 




