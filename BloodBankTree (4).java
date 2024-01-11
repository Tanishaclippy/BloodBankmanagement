package bloodbank;

import java.util.*;

//storing the amount of blood in the blood banks across pune

class Node{

	double amount_A;

	double amount_B;

	double amount_O;

	String code;

	static Node left;

	static Node right;

	Node(double amount_A,double amount_B,double amount_O,String code){

		this.amount_A=amount_A;

		this.amount_B=amount_B;

		this.amount_O=amount_O;

	}

}

//creating a tree for the network of blood banks

public class BloodBankTree extends UserValidity {


	Node PUNE=new Node(50,40,70,"PUNE");

	Node NIBM=new Node(6,4,10,"PMC 102");

	Node KATRAJ=new Node(6,6,10,"PMC 103");

	Node DHANORI=new Node(5,5,10,"PMC 112");

	Node SHIVAJINAGAR=new Node(8,5,5,"PMC 113");

	Node PIMPRI=new Node(13,10,15,"PCMC 201");

	Node CHINCHWAD=new Node(12,10,20,"PCMC 211");

	Node VAIBHAVNAGAR=new Node(7,5,7,"PCMC 202");

	Node SAINAGAR=new Node(6,5,8,"PCMC 203");

	Node SAFENAGR=new Node(6,6,9,"PCMC 212");

	Node CHINCHWADGAON=new Node(6,4,11,"PCMC 213");

	void create() {

		Node PMC=new Node(25,20,35,"PMC 100");

		PUNE.left=PMC;

		Node PCMC=new Node(25,20,35,"PCMC 200");

		PUNE.right=PCMC;

		Node SPUNE=new Node(12,10,20,"PMC 101");

		PMC.left=SPUNE;

		Node NPUNE=new Node(13,10,15,"PMC 111");

		SPUNE.left=NIBM;

		SPUNE.right=KATRAJ;

		NPUNE.left=DHANORI;

		NPUNE.right=SHIVAJINAGAR;

		PCMC.left=PIMPRI;

		PCMC.right=CHINCHWAD;

		PIMPRI.left=VAIBHAVNAGAR;

		PIMPRI.right=SAINAGAR;

	}

	//taking hospital details
	
	void add() {

		Scanner read=new Scanner(System.in);

		System.out.println("Welcome to our blood bank!!");

		System.out.println("Enter the name of the hospital:");

		String hospital_name=read.next();

	}

	void search() {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the address of your hospital:");

		String address=sc.nextLine();

		address +=sc.nextLine();

		System.out.println(" Do you need the blood on urgent basis ?");

		System.out.println("Print 'Yes' if needed otherwise 'No' ");

		String ans=sc.next();

		if(ans.equalsIgnoreCase("YES")) {

			System.out.println("Enter the address of the area where the blood is needed ?");

			String address1=sc.nextLine();

			address1+=sc.nextLine();

			System.out.println("Enter the blood needed");

			String blood=sc.next();

			System.out.println("Enter the amount of blood required :");

			double amt=sc.nextDouble();

			Node ptr=PUNE;

			Node par=PUNE;
			
			//finding the blood bank in the area of the hospital

			if(address1.equals("PCMC")) {

				ptr=ptr.right;

				if(address.equals("PCMC 202")) {

					if (ptr != null && par != null) {

						par=ptr.left;

						ptr=ptr.left.left;

					}

				}

				else if(address.equals("PCMC 203")) {

					par=ptr.left;

					ptr=ptr.left.right;

				}

				else if(address.equals("PCMC 212")) {

					par=ptr.right;

					ptr=ptr.right.left;

				}

				else if(address.equals("PCMC 213")) {

					par=ptr.right;

					ptr=ptr.right.right;

				}
				
				//check if blood is available if yes then it is delivered to the address else not 

				if(blood.equals("A")) {

					if(amt<ptr.amount_A) {

						System.out.println("Blood available ");

						ptr.amount_A-=amt;

						System.out.println("Blood will be delivered");

						System.out.println("Remaining quantity at blood bank is "+ptr.amount_A);

					}

					else {

						System.out.println(ptr.amount_A+" blood is available\nWill check with other centres in PCMC");

						ptr.amount_A=0;

						double rem=amt-ptr.amount_A;

						if(ptr==par.left) {

							Node temp=par.right;

							if(temp.amount_A>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_A-=rem;


							}

							else {

								System.out.println("Sorry not available");

							}

						}

						else if(ptr==par.right) {

							Node temp=par.left;

							if(temp.amount_A>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_A-=rem;

							}

							else {

								System.out.println("Sorry not available");

							}

						}

					}

				}

				else if(blood.equals("B")) {

					if(amt<ptr.amount_B) {

						System.out.println("Blood available ");

						ptr.amount_B-=amt;

						System.out.println("Blood will be delivered");

						System.out.println("Remaining quantity at blood bank is "+ptr.amount_B);

					}

					else {

						System.out.println(ptr.amount_B+" blood is available\nWill check with other centres in PCMC");

						ptr.amount_B=0;

						double rem=amt-ptr.amount_B;

						if(ptr==par.left) {

							Node temp=par.right;

							if(temp.amount_B>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_B-=rem;

							}

							else {

								System.out.println("Sorry not available");

							}

						}

						else if(ptr==par.right) {

							Node temp=par.left;

							if(temp.amount_B>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_B-=rem;

							}

							else {

								System.out.println("Sorry not available");

							}

						}

					}

				}

				else if(blood.equals("O")) {

					if(amt<=ptr.amount_O) {

						System.out.println("Blood available ");

						ptr.amount_O-=amt;

						System.out.println("Blood will be delivered");

						System.out.println("Remaining quantity at blood bank is "+ptr.amount_O);

					}

					else {

						System.out.println(ptr.amount_O+" blood is available\nWill check with other centres in PCMC");

						ptr.amount_O=0;

						double rem=amt-ptr.amount_O;

						if(ptr==par.left) {

							Node temp=par.right;

							if(temp.amount_O>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_O-=rem;

							}

							else {

								System.out.println("Sorry not available");

							}

						}

						else if(ptr==par.right) {

							Node temp=par.left;

							if(temp.amount_O>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_O-=rem;

							}

							else {

								System.out.println("Sorry not available");

							}

						}

					}

				}

			}

			if(address1.equals("PMC")) {

				ptr=ptr.left;

				if(address.equals("PMC 102")) {

					par=ptr.left;

					ptr=ptr.left.left;

				}

				else if(address.equals("PMC 103")) {

					par=ptr.left;

					ptr=ptr.left.right;

				}

				else if(address.equals("PMC 112")) {

					par=ptr.right;

					ptr=ptr.right.left;

				}

				else if(address.equals("PMC 113")) {

					par=ptr.right;

					ptr=ptr.right.right;

				}

				if(blood.equals("A")) {

					if(amt<ptr.amount_A) {

						System.out.println("Blood available ");

						ptr.amount_A-=amt;

						System.out.println("Blood will be delivered");

						System.out.println("Remaining quantity at blood bank is "+ptr.amount_A);

					}

					else {

						System.out.println(ptr.amount_A+" blood is available\nWill check with other centres in PCMC");

						ptr.amount_A=0;

						double rem=amt-ptr.amount_A;

						if(ptr==par.left) {

							Node temp=par.right;

							if(temp.amount_A>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_A-=rem;


							}

							else {

								System.out.println("Sorry not available");

							}

						}

						else if(ptr==par.right) {

							Node temp=par.left;

							if(temp.amount_A>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_A-=rem;


							}

							else {

								System.out.println("Sorry not available");

							}


						}

					}

				}

				else if(blood.equals("B")) {

					if(amt<ptr.amount_B) {

						System.out.println("Blood available ");

						ptr.amount_B-=amt;

						System.out.println("Blood will be delivered");

						System.out.println("Remaining quantity at blood bank is "+ptr.amount_B);

					}

					else {

						System.out.println(ptr.amount_B+" blood is available\nWill check with other centres in PCMC");

						ptr.amount_B=0;

						double rem=amt-ptr.amount_B;

						if(ptr==par.left) {

							Node temp=par.right;

							if(temp.amount_B>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_B-=rem;

							}

							else {

								System.out.println("Sorry not available");

							}

						}

						else if(ptr==par.right) {

							Node temp=par.left;

							if(temp.amount_B>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_B-=rem;

							}

							else {

								System.out.println("Sorry not available");

							}

						}

					}

				}

				else if(blood.equals("O")) {

					if(amt<ptr.amount_O) {

						System.out.println("Blood available ");

						ptr.amount_O-=amt;

						System.out.println("Blood will be delivered");

						System.out.println("Remaining quantity at blood bank is "+ptr.amount_O);

					}

					else {

						System.out.println(ptr.amount_O+" blood is available\nWill check with other centres in PCMC");

						ptr.amount_O=0;

						double rem=amt-ptr.amount_O;

						if(ptr==par.left) {

							Node temp=par.right;

							if(temp.amount_O>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_O-=rem;


							}

							else {

								System.out.println("Sorry not available");

							}

						}

						else if(ptr==par.right) {

							Node temp=par.left;

							if(temp.amount_O>rem) {

								System.out.println("Found.Will be delivered");

								temp.amount_O-=rem;

							}

							else {

								System.out.println("Sorry not available");

							}

						}

					}

				}

			}

		}

	}

}







