// ProxyTicket Class
public class ProxyTicket implements Ticket {
    private RealTicket realTicket;
    private String userRole;

    public ProxyTicket(String userRole) {
        this.userRole = userRole;
    }

    private boolean isValidUser() {
        // Validate user access. Here we are simply checking if the user role is "AUTHORIZED_USER".
        return "AUTHORIZED_USER".equals(userRole);
    }

    @Override
    public void getInfo() {
        if (!isValidUser()) {
            System.out.println("Access Denied: You do not have permission to view this ticket information.");
            return;
        }
        if (realTicket == null) {
            System.out.println("Creating the real ticket object...");
            realTicket = new RealTicket();
        } else {
            System.out.println("Using the existing real ticket object...");
        }
        realTicket.getInfo();
    }
}
