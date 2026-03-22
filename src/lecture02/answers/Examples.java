package lecture02.answers;
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
    public void testTicketFasterTicketsLeft(){
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals("Now Playing: Hatsune Miku Only 5 tickets left!", ticketFaster.nowPlaying("Hatsune Miku",5));
    }

    @Test
    public void testTicketFasterSoldOut(){
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals("Now Playing: Hatsune Miku !Sold Out!", ticketFaster.nowPlaying("Hatsune Miku",0));
    }

    @Test
    public void testFizzBuzzOutputFizz(){
        ClassicInterview classic = new ClassicInterview();
        assertEquals("fizz", classic.fizzbuzz(3));
    }
    @Test
    public void testFizzBuzzOutputBuzz(){
        ClassicInterview classic = new ClassicInterview();
        assertEquals("buzz", classic.fizzbuzz(5));
    }
    @Test
    public void testFizzBuzzOutputFizzBuzz(){
        ClassicInterview classic = new ClassicInterview();
        assertEquals("fizzbuzz", classic.fizzbuzz(15));
    }
    @Test
    public void testFizzBuzzOutputNotDivis(){
        ClassicInterview classic = new ClassicInterview();
        assertEquals("22", classic.fizzbuzz(22));
    }
}
