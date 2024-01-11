package bloodbank;

import java.util.*;

class Message {

	String sender;

	int question_num;

	Message(String sender, int question_num) {

		this.sender = sender;

		this.question_num=question_num;

	}

}

class chat_Node {

	Message message;

	chat_Node next;

	chat_Node(Message message) {

		this.message = message;

	}

}

//creating a queue to leverage first come first serve service

class chatQueue{

	chat_Node first;

	chat_Node end;

	void enqueue(Message message) {

		chat_Node newNode = new chat_Node(message);

		if (end == null) {

			first = end = newNode;

		} 
		else {

			end.next = newNode;
			end = newNode;
		}
	}

	Message dequeue() {

		if (first == null) {

			return null;

		}

		chat_Node temp = first;

		first = first.next;

		if (first == null) {

			end = null;

		}
		return temp.message;

	}

	boolean isEmpty() {

		return first == null;

	}

}

//Creating a linked list to store chat history

class chatList{

	chat_Node head;

	chat_Node tail;

	chatList(){

		this.head=null;

		this.tail=null;

	}

	void add(Message message) {

		chat_Node newNode = new chat_Node(message);

		if (head == null) {

			head = tail = newNode;
		} 
		else {

			tail.next = newNode;

			tail = newNode;

		}

	}

	Message remove() {

		if (head == null) {

			return null;

		}

		chat_Node temp = head;

		head = head.next;

		if (head == null) {

			tail = null;

		}
		return temp.message;

	}

	boolean isEmpty() {

		return head == null;

	}

}

class ChatSystem {

	Scanner read=new Scanner(System.in);

	chatQueue messagesQueue = new chatQueue();

	chatList  messagesList = new chatList();

	void questionsSet() {

		System.out.println("Hello...Welcome to our helpline chat");
		
		//possible questions set

		System.out.println("\n1) Can I donate blood if I've recently traveled to a different country?"
		+ "\n2) Can I donate blood if I am pregnant or breastfeeding?"
		+ "\n3) Can I donate blood if I have a chronic medical condition(such as diabetes or hypertension)?"
		+ "\n4) I've recently recovered from an illness. How long should I wait before donating blood?"
		+ "\n5) Can I donate blood if I have a history of cancer?"
		+ "\n6) I'm a regular blood donor. Are there any long-term health benefits to donating blood?"
		+ "\n7) Can I donate blood if I've received a COVID-19 vaccine?"
		+ "\n8) Can I donate blood if I've had certain medical procedures or surgeries?"
		+ "\n9)Can I donate blood if I have a tattoo or piercing?"
		+ "\n10) I've had a bad experience donating blood before. How can I ensure it goes smoothly this time?"); 	 

	}

	void sendMessage(String sender, int question_num) {

		Message message = new Message(sender,question_num);

		messagesQueue.enqueue(message);

		messagesList.add(message);

		System.out.println("Message added to chat history: " + sender + ": " + question_num);

		switch(message.question_num) {

		case 1:

			System.out.println("How many days has it been since you returned?");

			int days=read.nextInt();

			if(days>56) {

				System.out.println("Yes, you can donate blood");

			}
			else {

				System.out.println("Sorry, you can donate blood after completing minimum 56 days(8 weeks)");

			}
			break;

		case 2:

			System.out.println("No, if you're pregnant or breastfeeding, you should not donate blood. "
					+ "Wait until you've finished breastfeeding or your pregnancy is over before donating.");

			break;

		case 3:

			System.out.println("It depends on the condition. Some medical conditions may disqualify you from donating blood, while others may not. "
					+ "It's best to consult with a healthcare professional or the blood bank staff.");

			System.out.println("\nselect: 1) Hypertension 2)Diabetes");

			int dis=read.nextInt();

			switch(dis) {

			case 1:

				System.out.println("Acceptable as long as your blood pressure is below 180 systolic (first number) and below 100 diastolic (second number)"
						+ " at the time of donation.");

				break;

			case 2:

				System.out.println("Yes,if you are type 1 or type 2 diabetic you can donate blood");

				break;

			}

			break;

		case 4:

			System.out.println("The waiting period varies based on the illness.");

			break;

		case 5:

			System.out.println("Cancer survivors may be eligible to donate blood, depending on the type of cancer and treatment received. "
					+ "The eligibility criteria often depend on the specific circumstances and the time since treatment completion.");

			System.out.println("\nHow much time has passed since your treatment(months)?");

			int mon=read.nextInt();

			if(mon>12) {

				System.out.println("Since it's been "+mon+" months since your treatment, you can donate blood");

			}
			else {

				System.out.println("Sorry, the minimum waiting peroid is 12 months");

			}

			break;

		case 6:

			System.out.println("Congratulations on years of life-saving donations! Your generosity and commitment to giving the gift"
					+ " of life are truly inspiring.....\nRegular blood donation can reduce the risk of certain health conditions and contribute to overall cardiovascular health. However, it's essential "
					+ "to maintain a balanced lifestyle and consult with a healthcare provider for comprehensive health advice.");

			break;

		case 7:

			System.out.println("Classically, blood donations are contraindicated for four weeks after vaccination with a live attenuated virus vaccine. ");

			break;

		case 8:

			System.out.println("The eligibility to donate blood after medical procedures or surgeries depends on the type of procedure, the recovery period, and overall health. It's crucial to "
					+ "inform the blood bank staff about your medical history during your health checkup, and they will determine your eligibility based on their guidelines.");

			break;

		case 9:

			System.out.println("How many months has it been since the procedure?");

			int tat=read.nextInt();

			if(tat>6) {

				System.out.println("Yes since it has been "+tat+" months, you can donate blood");

			}
			else {

				System.out.println("You cannot donate for 6 months from the date of the procedure");

			}

			System.out.println("If the body piercing was performed by a registered health professional and any inflammation has settled completely, you can donate blood after 12 hours");

			break;

		case 10:

			System.out.println("Communicate your concerns with the staff beforehand. They can address your past experience, ensuring you're comfortable throughout the process. Staying well-hydrated and having a "
					+ "light meal before donation can also help.");

			break;

		}

	}

	 //method for blood bank center to receive messages
	
	void receiveMessages() {

		System.out.println("Messages from Queue:");

		while (!messagesQueue.isEmpty()) {

			Message message = messagesQueue.dequeue();

			System.out.println("Received message from " + message.sender+ ": " + message.question_num);

		}

	}

	void displayChatHistory() {

		System.out.println("Chat History:");

		chat_Node ptr = messagesList.head;

		while (ptr != null) {

			System.out.println(ptr.message.sender + ": " + ptr.message.question_num);

			ptr = ptr.next;

		}

	}

	void freq() {
		
		//frequently asked questions are stored in hashmap (key=question , value=answer)

		HashMap<String, String> stringMap = new HashMap<>();

		stringMap.put("Who can donate blood?", "Most healthy adults aged 18 to 65 and weighing at least 110 pounds can donate blood. There might be specific health and travel restrictions; a brief screening will determine eligibility.");
		stringMap.put("How often can I donate blood?", "Generally, whole blood donations can be made every 56 days, but this might vary based on donation type and individual health. ");
		stringMap.put("Is it safe to donate blood?", "Yes, donating blood is safe. All equipment used is sterile and disposable, ensuring no risk of transmitting infections.\n  Trained staff conducts the process under strict protocols.");
		stringMap.put("How long does the donation process take? "," The whole process, including registration, screening, donation, and refreshments, generally takes around 30 minutes to an hour.");
		stringMap.put(" Can I get infected by donating blood?"," No, it's impossible to get infected by donating blood. All equipment used is sterile and discarded after use.\r\n"
				+ "");
		stringMap.put("What is the eligibility criteria ? " ,"For blood donation,one should be between the age bracket 18-65 years old \n Pregnant women and people with recent medical condition cannot do .");
		stringMap.put("What are the side effects of blood donations ? ","Dizziness ,lightheadedness and other normal effects can be seen ");

		System.out.println("************************************ Frequently asked questions ************************************");

		for (String key : stringMap.keySet()) {

			String value = stringMap.get(key);

			System.out.println();

			System.out.println("Question : " + key + " \n Answer ->: " + value);

		}
	}

}

