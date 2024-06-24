//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ticket unauthorizedTicket = new ProxyTicket("UNAUTHORIZED_USER");

        System.out.println("First attempt by unauthorized user:");
        unauthorizedTicket.getInfo();

        Ticket authorizedTicket = new ProxyTicket("AUTHORIZED_USER");

        System.out.println("\nFirst  attempt by authorized user:");
        authorizedTicket.getInfo();

        System.out.println("\nSecond attempt by authorized user:");
        authorizedTicket.getInfo();
    }
    }


// Client Code


