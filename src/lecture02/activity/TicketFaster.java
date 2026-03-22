package lecture02.activity;
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
     * @param numTickets takes in the tickets that are available
     * @return a string the form "only %d tickets left" if numTickets is positive
     *          The string "!SOLD OUT" if numTickets is 0
     */
    public String numberText(int numTickets){
         if(numTickets>0){
             return String.format("only %d tickets left", numTickets);
        }
         else{
             return "!SOLD OUT!";
        }
    }

    public String nowPlaying(String concertName, int numTickets){
        return String.format("Now Playing: %s %s", concertName, numberText(numTickets));
    }

}
