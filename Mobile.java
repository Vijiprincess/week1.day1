package week1.day1;

public class Mobile {
public void sendmsg() {
	String message = "Hello people";
	System.out.println("Sending message as:" +message);
}
public void makecall() {
	long number =768903548L;
	System.out.println("Make a call to:"+number);
}
public void savecontact() {
	String contact = "Testleaf";
	System.out.println("Saving the contact as :"+contact);
}

	public static void main(String[] args) {
		Mobile g = new Mobile();
		g.sendmsg();
		g.makecall();
		g.savecontact();
		

	}

}
