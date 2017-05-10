package randoms;

//class called people with two instance variables
class People {
	String name;
	int age = 0;
	int user = 0;
	
	//constructor to increment object in array
	public People(int no) {
		user = no;
	}
	//constructor with no parameteres for single user
	public People() {
		
	}
}

class Bank {
	int accNo;
	int balance;
	String userID;
	
	void deposit(int in, int bal) {
		balance = bal;
		bal = bal + in;
		System.out.println("You have: " + bal);
	}
	
	void balance() {
		System.out.println(balance); ;
	}
}

public class Person {

	public static void main(String[] args) {

		singleUser();
		userAccounts();

	}
	
	//Single user account for person
	static void singleUser() {
		//create a new instance of the class
		People person1 = new People();
		person1.name = "mobeen";
		person1.age = 22;
		System.out.println(person1.name + " " + person1.age);
	}
	
	//incrementally print people who are statically generated

	static void userAccounts() {
		People[] pArry = new People[10];
		Bank[] bank = new Bank[10];
		System.out.println("UserName\tage\taccNo\tbalance");

		for (int i = 0; i < pArry.length; i++) {
			pArry[i] = new People(i+1);
			// could use pArry[i] = new People() to increment object
			String name2 = "User" + i;
			int age2 = (i + 1) * 2;
			
			pArry[i].name = name2;
			pArry[i].age = age2;
			
			for (int j = 0; j < bank.length; j++) {
				int balance2 = (int )(Math.random() *50000 + 29);
				bank[j] = new Bank();
				bank[j].accNo = i;
				bank[j].balance = balance2;
				bank[j].userID = name2;
			}
			System.out.println(pArry[i].name + "\t\t" + pArry[i].age + "\t" + 
					bank[i].accNo + "\t" + bank[i].balance);
		}
	}

}
