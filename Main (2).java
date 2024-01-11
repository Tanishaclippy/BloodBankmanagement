package bloodbank;

import java.util.*;

//Define a class to represent a user node with personal information

class user_node{

	String name;
	
	int age;
	
	String house_addr;
	
	String blood_group;
	
	String gender;

	user_node next;
	
	user_node front;
	
	user_node rear;
	
	//initializing the donor details on the constructor

	user_node(){

		name="";
		
		age=0;
		
		gender="";
		
		house_addr="";

		next=null;
		
		front=null;
		
		rear=null;

	}

}

//Define a class to manage user information

class userinfo{

	Scanner sc=new Scanner(System.in);

	 // Method to get the user's name
	String name() {

		// Implementation for getting the user's name
		System.out.println("First Name:");

		String first_name=sc.next();
		
		//validation to check if the first letter of the name is capital

		while (Character.isLowerCase(first_name.charAt(0))) {
			
			System.out.println("\u001B[31m");
			
			System.out.println("The first letter must be capital");
			
			System.out.println("\u001B[0m");
			
			System.out.println("First Name:");
			
			first_name=sc.next();
		}
		
		System.out.println("  ");
		
		System.out.println("Middle name:");

		String middle_name=sc.next();
		
		while (Character.isLowerCase(middle_name.charAt(0))) {
			
			System.out.println("\u001B[31m");
			
			System.out.println("The first letter must be capital");
			
			System.out.println("\u001B[0m");
			
			System.out.println("Middle Name:");
			
			middle_name=sc.next();
		
		}
		
		System.out.println("  ");
		
		System.out.println("Last name:");

		String last_name=sc.next();
		
		while (Character.isLowerCase(last_name.charAt(0))) {
			
			System.out.println("\u001B[31m");
			
			System.out.println("The first letter must be capital");
			
			System.out.println("\u001B[0m");
			
			System.out.println("Last Name:");
			
			last_name=sc.next();
		
		}
		
		String full_name=first_name+" "+middle_name+" "+last_name;

		return full_name;

	}
	
	// Method to get the user's address

	String address() {
		
		// Implementation for getting the user's address

		String pincode=null;

		System.out.println("1)PCMC 2)PMC");

		System.out.println("enter the option:");

		int option=sc.nextInt();
		
		String full_address = " ";
		
		//switch case to generate the pin code of the donor

		try {

			switch(option) {

			case 1:

				full_address="PCMC";

				pincode="2";

				System.out.println("1)Pimpri 2)Chinchwad");

				System.out.println("enter the option:");

				int option2=sc.nextInt();

				switch(option2) {

				case 1:

					System.out.println("1)Vaibhav Nagar 2)Sai Nagar");

					int option3=sc.nextInt();

					switch(option3) {

					case 1:

						pincode=pincode+"02";

						break;

					case 2:

						pincode=pincode+"03";

						break;

					}

					break;

				case 2:

					System.out.println("1)Safe Nagar 2)Chinchwad Gaon");

					int option4=sc.nextInt();

					switch(option4) {

					case 1:

						pincode=pincode+"12";

						break;

					case 2:

						pincode=pincode+"13";

						break;

					}

					break;

				}

				break;

			case 2:

				pincode="1";

				full_address="PMC";

				System.out.println("1)South Pune 2)North Pune");

				System.out.println("enter the option:");

				int option5=sc.nextInt();

				switch(option5) {

				case 1:

					System.out.println("1)NIBM 2)Katraj");

					int option6=sc.nextInt();

					switch(option6) {

					case 1:

						pincode=pincode+"02";

						break;

					case 2:

						pincode=pincode+"03";

						break;

					}

					break;

				case 2:

					System.out.println("1)Dhanori 2)Shivaji Nagar");

					int option7=sc.nextInt();

					switch(option7) {

					case 1:

						pincode=pincode+"12";

						break;

					case 2:

						pincode=pincode+"13";

						break;

					}

					break;

				}

				break;

			}

		}


		catch(InputMismatchException e) {
			
			System.out.println("\u001B[31m");
			
			System.out.println("Invalid input. Please enter a valid option.");
			
			System.out.println("\u001B[0m");
			
			sc.next();

			return address();

		}
		return full_address+" "+pincode;

	}

}

//Define a class to represent a user and collect their information

class User{

	Scanner sc=new Scanner(System.in);

	userinfo person1=new userinfo();

	public String full_name;

	int age;

	String full_address;
	
	String gen;

	String bloodgroup;

	public void getUserInfo(){

		System.out.println("Welcome donor !!!");

		System.out.println("Please enter the following details-");

		System.out.println("Name details:");

		full_name=person1.name();

		System.out.println("name-"+full_name);
		
		System.out.println("Enter gender: ");
		
		gen=sc.next();

		boolean validAge = false;
		
		//validation for age

		while (!validAge) {

			try {

				System.out.println("Age:");

				age = sc.nextInt();

				if (age < 18 || age > 65) {
					
					System.out.println("\u001B[31m");
					
					System.out.println("Age for blood donation is 18yrs to 65yrs.\nYou are not in the age bracket");
					
					System.out.println("\u001B[0m");
				}
				else {

					validAge = true;

				}

			} 
			catch (InputMismatchException e) {

				System.out.println("Invalid input for age. Please enter a valid integer.");

				sc.next();
			}

		}

		System.out.println("Address details:");

		full_address=person1.address();

		System.out.println("address-"+full_address);

		System.out.println("Blood group:");

		bloodgroup=sc.next();
		
		bloodgroup=bloodgroup.toUpperCase();

	}

}

//Define a class to check the validity of a user's eligibility for blood donation

class UserValidity extends User{

	Scanner sc=new Scanner(System.in);

	user_node front,rear;

	UserValidity(){

		front=rear=null;

	}

	int result=0;

	int result2=0;

	public boolean checkValidity(){
		
		// Implementation for checking eligibility

		int flag=0;

		String reason=" ";

		String reason2=" ";
		
		// questionare to check of the donor is fit for blood donation

		System.out.println("Your login has been successfully completed!!");

		System.out.println("Please answer the following questions:");

		System.out.println("Do you have any recent travel history?(1-yes/0-no)");

		try {

			int travel_history=sc.nextInt();

			if(travel_history==0) {

			}

			else {
				result2++;
				System.out.println("\u001B[31m");
				reason2=reason2+"You might have picked up some infection in your travel";
				System.out.println("\u001B[0m");
			}

			System.out.println("Do you possess any kind of infection currently?(ex:cold,flu)(1-yes/0-no)");

			int infection=sc.nextInt();

			if(infection==0) {

			}
			
			else {

				result++;
				
				System.out.println("\u001B[31m");
				
				reason=reason+"\nYou cannot donate blood if you are currently sick";
				
				System.out.println("\u001B[0m");

			}

			System.out.println("Do you possess any conditions like (ex:blood pressure) (1-yes/0-No):");

			int conditions=sc.nextInt();

			if(conditions==0) {
				
			}

			else {

				result2++;
				
				System.out.println("\u001B[31m");
				
				reason2=reason2+"You might not be fit beacuse of you medical condition";
				
				System.out.println("\u001B[0m");

			}

			System.out.println("Do have any history of surgery in the past 6 months?(1-yes/0-No)");

			int operation_history=sc.nextInt();

			if(operation_history==0) {

			}

			else {

				result++;
				
				System.out.println("\u001B[31m");
				
				reason=reason+"\nYou cannot donate blood if you have any history of operations in the past 6 months";
				
				System.out.println("\u001B[0m");

			}

			System.out.println("Are you currently under some medications?(1-yes/0-No)");

			int medication_history=sc.nextInt();

			if(medication_history==0) {

			}

			else {
				
				System.out.println("If yes ,please specify :1)Medications for skincare and similar reasons /n 2)Medications for vitamin deficiency and more");

				System.out.println("3)Medications for diabetics and blood pressure reason ");

				int opt=sc.nextInt();

				if(opt==1) {

				}

				else if(opt==2) {

				}
				else {
					result2++;
					
					System.out.println("\u001B[31m");
					
					reason2=reason2+"You are not fit because of your medications";
					
					System.out.println("\u001B[0m");
				}

			}
		}
		catch(InputMismatchException e) {

			System.out.println("\u001B[31m");
			
			System.out.println("Invalid input. Please enter a valid option (0 or 1).");
			
			System.out.println("\u001B[0m");
			
			sc.next();
			
			checkValidity();
		}

		if(result>0 || result2>2) {

			System.out.println("\u001B[31m");
			
			System.out.println("Sorry you are not eligible for blood donation :(");
			
			System.out.println("\u001B[0m");

			flag=0;

			if(result>0 && result2>2) {

				System.out.println(reason);

				System.out.println(reason2);

			}

			else if(result>0 && result2<2) {

				System.out.println(reason);

			}

			else {

				System.out.println(reason2);

			}

		}

		else {

			flag=1;

			System.out.println("Thank you for your patince");
			System.out.println("\u001B[32m");
			System.out.println("You are an eligable candidate!!");

			System.out.println("\u001B[0m");

		}

		if(flag==1) {

			return true;

		}

		else {

			return false;

		}

	}

	public void addDonor() {

		//check the validity of the donor

		if(checkValidity()) {

			user_node donor=new user_node();

			donor.name=super.full_name;

			donor.age=super.age;

			donor.house_addr=super.full_address;

			donor.blood_group=super.bloodgroup;
			
			donor.gender=super.gen;


			if(front==null && rear==null) {

				front=rear=donor;

				rear.next=donor;

				System.out.println("\u001B[32m");
				
				System.out.println(donor.name+" ,you are added in the queue");
				
				System.out.println("\u001B[0m");
			
			}

			else {

				rear.next=donor;

				rear=donor;

				rear.next=front;

				System.out.println("\u001B[32m");
				
				System.out.println(donor.name+" ,you are added in the queue");
				
				System.out.println("\u001B[0m");

			}

		}

	}

	//method to display the donor list
	
	public void display_wl() {

		int n=1;

		System.out.println("Waiting List: ");

		user_node ptr=front;

		while(ptr.next!=front) {

			System.out.print("Donor "+n);

			System.out.print("\nName: "+ptr.name);

			System.out.print("\nAge: "+ptr.age);

			System.out.print("\nAddress: "+ptr.house_addr);

			System.out.print("\nBlood group: "+ptr.blood_group);
			
			System.out.println("\nGender: "+ptr.gender);

			ptr=ptr.next;

			n++;

		}

		//print donor details
		
		System.out.println("\u001B[32m");

		System.out.print("\nDonor "+n);

		System.out.print("\nName: "+ptr.name);

		System.out.print("\nAge: "+ptr.age);

		System.out.print("\nAddress: "+ptr.house_addr);

		System.out.print("\nBlood group: "+ptr.blood_group);
		
		System.out.println("\nGender: "+ptr.gender);

		ptr=ptr.next;

		System.out.println("\u001B[0m");

	}

	boolean isEmpty() {

		if(front==null && rear==null) {

			return true;

		}

		else {

			return false;

		}

	}
	
	//method to send donor first in line to blood donation center

	public String dequeue() {

		user_node temp = front;

		String pin_code="";

		if (isEmpty()) {

			System.out.println("\u001B[31m");
			
			System.out.println("The donor queue is empty!!");
			
			System.out.println("\u001B[0m");
			
			return null;

		}

		if (front == rear) {

			front = rear = null;

		} else {

			front = front.next;


		}

		return temp.blood_group;


	}
}
class Main{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		UserValidity obj = new UserValidity();

		int option=0;

		while(option!=3) {
			
            System.out.println("\u001B[36m\n");

			System.out.println("******************************************");
			
			System.out.println("");

			System.out.println("     Blood Bank Management System");
			
			System.out.println("");

			System.out.println("******************************************\n");

			System.out.println("1. Donor Registration");

			System.out.println("2. Raise Request for Blood (For Hospitals Only)");

			System.out.println("3. Activities corner");

			System.out.println("4. Frequently Asked Questions");

			System.out.println("5. Helpline Chat");

			System.out.println("6. Exit\n");

			System.out.println("******************************************");
			
			System.out.println("\u001B[0m");

			System.out.print("Enter your choice: ");
			
			option = sc.nextInt();


			switch (option) {

			case 1:

				obj.getUserInfo();

				obj.addDonor();

				obj.display_wl();

				obj.dequeue();

				break;

			case 2:

				BloodBankTree bbt = new BloodBankTree();
				
				bbt.create();
				
				bbt.add();

				bbt.search();

				break;

			case 3:
				FunFact fact=new FunFact();
				
				int ch=0;
				
				while(ch!=3) {
					
					System.out.println("1)Activities dashboard\n2)Quiz");
					
					ch=sc.nextInt();
					
					switch(ch) {
					
					case 1: 
						
						fact.Activities();
						
						break;
					
					case 2:
						
						fact.quiz();
						
						break;
						
					}
					
				}
				
				break;

			case 4:
				
				ChatSystem faq=new ChatSystem();
				
				faq.freq();
				
				break;

			case 5:
				
				ChatSystem chat=new ChatSystem();
				
				while (true) {
					
					System.out.println("Blood Bank Chat System:");
					System.out.println("1. Send Message");
					System.out.println("2. Receive Messages");
					System.out.println("3. Display Chat History");
					System.out.println("4. Exit");
					System.out.print("Enter your choice: ");

					int choice = sc.nextInt();
					
					sc.nextLine(); 
					
					switch (choice) {
					
					case 1:
						
						System.out.print("Enter your name: ");
						
						String sender = sc.nextLine();
						
						chat.questionsSet();
						
						System.out.print("Choose the option: ");
						
						int  question_num = sc.nextInt();
						
						chat.sendMessage(sender,question_num);

						System.out.println("Message sent!");
						
						break;
						
					case 2:
						
						System.out.println("Checking for new messages...");
						
						chat.receiveMessages();
						
						break;
						
					case 3:
						
						chat.displayChatHistory();
						
						break;
						
					case 4:
						
						System.out.println("Exiting Blood Bank Chat System. Goodbye!");
						
						System.exit(0);
						
						break;
						
					default:
						
						System.out.println("Invalid choice. Please try again.");
						
						break;
					}

				}

			case 6:
				
				System.out.println("Thank you for visiting.....");
				
				System.exit(0);
				
				break;

			}

		} 

	}
}
