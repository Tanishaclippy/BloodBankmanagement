package bloodbank;

import java.util.Scanner;

public class FunFact {
	
	Scanner sc=new Scanner (System.in);
	
	void Activities() {
		
		System.out.println("\n1.Upcoming Blood Drives"+"\n2.Recipient Stories"+"\n3.Donor Stories");
		
		System.out.println("Enter the choice:");
		
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1:
			//Printing the upcoming activities
			System.out.println("");
			System.out.println("The blood donation drives the upcoming month are:");
			System.out.println("\n11th November-Shivaji Nagar Blood Bank Centre");
			System.out.println("\n16th November-Vaibhav Nagar Blood Bank Centre");
			System.out.println("\n21st Novemebr-Katraj Blood Bank Centre");
			System.out.println("\n27th November-ChinchwadGaon");
			
			break;
			
		case 2:
			//printing the recipient stories
			System.out.println("");
			System.out.println("Life's Threads Woven by Heroes: Inspirational Recipient Stories");
			System.out.println("");
			System.out.println("Emily, a vibrant young girl, was diagnosed"
					+ " with leukemia at the age of 8.\nShe endured countless "
					+ "rounds of chemotherapy and needed regular blood transfusions"
					+ " to keep her strength up.\nHer family often rushed her to the "
					+ "hospital when her condition worsened.\nIt was during one of "
					+ "these critical moments that she received a blood transfusion "
					+ "that saved her life.\nAs she recovered, Emily's laughter and "
					+ "spirit returned, and she eventually beat cancer.\nToday, she's"
					+ " a healthy teenager who dreams of becoming "
					+ "a nurse so she can pay forward the kindness she received.");
		
			System.out.println("");
		
			System.out.println("Mark, a dedicated firefighter, was involved in a severe car "
					+ "accident while responding to an emergency call.\nHis injuries were "
					+ "extensive, and he required multiple surgeries to survive. "
					+ "\nThroughout his recovery, Mark received numerous blood transfusions "
					+ "to replace the blood he had lost.\nThanks to the generosity of blood "
					+ "donors, he not only survived but made a remarkable recovery.\nInspired "
					+ "by the care he received and the impact of blood donation, Mark decided"
					+ " to become a regular blood donor himself, paying tribute to the donors"
					+ " who saved his life.");
			
			break;
			
		case 3:
			
			//printing donor stories
			System.out.println(" ");
			System.out.println("Unsung Heroes: Stories of Generosity from Blood Donors");
			System.out.println("Sarah, a college student, was inspired to donate blood for "
					+ "the first time after attending a campus blood drive.\nShe didn't think "
					+ "much of it at the time but felt a sense of pride in helping others."
					+ "\nA few weeks later, she received a heartfelt letter from the hospital."
					+ " Her blood donation had gone to a critically injured accident victim "
					+ "who needed a significant transfusion.\nThe patient, named John, made a "
					+ "full recovery and was deeply grateful for Sarah's contribution.\nThis "
					+ "experience turned Sarah into a lifelong blood donor, knowing that her "
					+ "simple act had saved a life.");
			System.out.println("");
			System.out.println("The Johnson family had a unique tradition of donating blood"
					+ " together. For years, parents Mark and Lisa brought their children, "
					+ "Emily and Jake, to blood drives as soon as they were old enough. "
					+ "\nThey saw it as an opportunity to teach their kids about the importance "
					+ "of helping others.\nYears later, Emily received a call that her blood "
					+ "donation had gone to a premature baby in the neonatal intensive care unit."
					+ "\nThat tiny baby, named Lily, was struggling to survive but made incredible"
					+ " progress after receiving Emily's donated blood.\nThe Johnsons felt immense"
					+ " pride in their family tradition, knowing they were making a difference "
					+ "in the lives of people they would never meet.");
			
			break;
			
		}
		
	}
	
	String opt=" ";
	
	int count=0;
	
	int m=0;
	
	void quiz() {
		
		do {
			// a fun quiz 
			
		System.out.println("************ TEST YOUR BLOOD CAMP AWARENESS QUIZ *********************");
		
		System.out.println();
		
		System.out.println("1) What was the theme of the World Donor campaign in 2023");
		
		System.out.println("Options : \n  a)Donating blood is an act of solidarity. Join the effort and save lives.\n b)Give blood, give plasma, share life, share often. ");
		
		System.out.println("Enter your answer :");
		
		opt=sc.next();
		
		if(opt.equalsIgnoreCase("b")) {
			
			count++;
			
			System.out.println("RIGHT ANSWER !!!!!!!!!!!!!!!");
			
			System.out.println("Your score is "+count);
			
		}
		else {
			
			System.out.println("OOPS!! WRONG ANSWER");
			
		}
		
		m++;
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println("2) When is the world donor day celebrated ?");
		
		System.out.println("Options a)14 th June \n b)26th January ");
		
		System.out.println("Enter your answer :");
		
		opt=sc.next();
		
		if(opt.equalsIgnoreCase("a")) {
			
			count++;
			
			System.out.println("RIGHT ANSWER !!!!!!!!!!!!!!!");
			
			System.out.println("Your score is "+count);
			
		}
		else {
			
			System.out.println("OOPS!! WRONG ANSWER");
			
		}
		
		m++;
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println("3) Guess whether True or False");
		
		System.out.println("Red blood cells can be used up to six months after they are donated.");
		
		System.out.println("Enter your answer :");
		
		opt=sc.next();
		
		if(opt.equalsIgnoreCase("false")) {
			
			count++;
			
			System.out.println("RIGHT ANSWER !!!!!!!!!!!!!!!");
			
			System.out.println("Your score is "+count);
			
		}
		else {
			
			System.out.println("OOPS!! WRONG ANSWER");
			
		}
		
		m++;
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println("4) How much blood is typically given when someone donates?");
		
		System.out.println("a)1 Pint b)2 pint");
		
		System.out.println("Enter your answer :");
		
		opt=sc.next();
		
		if(opt.equalsIgnoreCase("a")) {
			
			count++;
			
			System.out.println("RIGHT ANSWER !!!!!!!!!!!!!!!");
			
			System.out.println("Your score is "+count);
			
		}
		else {
			
			System.out.println("OOPS!! WRONG ANSWER");
			
		}
		
		m++;
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println("5) One donation can help save the lives of how many people?");
		
		System.out.println("a)2 b)3");
		
		System.out.println("Enter your answer :");
		
		opt=sc.next();
		
		if(opt.equalsIgnoreCase("b")) {
			
			count++;
			
			System.out.println("RIGHT ANSWER !!!!!!!!!!!!!!!");
			
			System.out.println("Your final score is "+count);
			
		}
		else {
			
			System.out.println("OOPS!! WRONG ANSWER");
			
		}
		
		m++;
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		}
		
		while(m!=5);
		
		if(count==5||count==4) {
			
			System.out.println();
			
			System.out.println("Congratulationssssss !!! You are one of the highest scorers and we appreciate your awareness ");
	
		}
		
		else {
			
			System.out.println();
			
			System.out.println("That was an interesting quiz and you did well!");
			
		}
	}
}

