package lecture02.activity;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Examples {

    @Test
    public void testTicketFasterWithoutSeniorDiscount(){
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals(33.0,ticketFaster.priceForTickets(3,false), 0.01);
    }
    @Test
    public void testTicketFasterWithSeniorDiscount(){
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals(16.5,ticketFaster.priceForTickets(3,true), 0.01);
    }

    @Test
    public void testNumberTicket(){
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals("only 5 tickets left", ticketFaster.numberText(5));
    }

    @Test
    public void testNumberTicket2(){
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals("!SOLD OUT!", ticketFaster.numberText(0));
    }

    @Test
    public void testNowPlaying(){
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals("Now Playing: Hatsune Miku only 5 tickets left",ticketFaster.nowPlaying("Hatsune Miku",5));

    }
}

