// RealTicket Class
public class RealTicket implements Ticket {
    private String ticketData;

    public RealTicket() {
        fetchDetails();
    }

    private void fetchDetails() {
        // Simulating a resource-intensive operation
        System.out.println("Fetching ticket details from multiple sources...");
        try {
            Thread.sleep(2000); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ticketData = "Flight Ticket Details:\n" +
                "Passenger: Muhammad Saeed\n" +
                "Flight Number: 03025816015\n" +
                "Date: 2024-07-10\n" +
                "Seat: 100A\n" +
                "Special Requests: none";
    }

    @Override
    public void getInfo() {
        System.out.println(ticketData);
    }
}
