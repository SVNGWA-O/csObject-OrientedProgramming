package lecture02.answers;
public class TicketFaster {

    /**
     * produces the price for a movie that costs $11 per ticket.
     * @param numTickets the number of tickets
     * @param seniorDiscount movies are half-off for when accompanied by seniors
     * @return the total cost of the tickets
     */
    public double priceForTickets(int numTickets, boolean seniorDiscount) {
        if(seniorDiscount){
            return (numTickets * 11) / 2.0;
        }
        else{
            return (numTickets * 11);
        }
    }

    /**
     * Produces a Marquee message
     * @param name the name of the act/concert
     * @param ticketsRemaining the number of tickets remaining
     * @return
     */
    public String nowPlaying(String name, int ticketsRemaining){
        return String.format("Now Playing: %s %s", name, tag(ticketsRemaining));
    }

    public String tag(int ticketsRemaining){
        if(ticketsRemaining > 0){
            return String.format("Only %d tickets left!", ticketsRemaining);
        } else {
            return "!Sold Out!";
        }
    }

}
