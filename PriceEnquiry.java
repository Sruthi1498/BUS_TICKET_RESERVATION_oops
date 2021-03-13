import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class PriceEnquiry {
    public void price()
    {
        try {

            URI uri;
            uri = new URI("https://www.redbus.in/bus-hire/chennai");
            java.awt.Desktop.getDesktop().browse(uri);

        } catch (IOException | URISyntaxException e) {
        }
    }
}

class Seater extends PriceEnquiry{
    public void price()
    {
        try {

            URI uri;
            uri = new URI("https://www.redbus.in/bus-hire/chennai/40-seater-bus-booking");
            java.awt.Desktop.getDesktop().browse(uri);

        } catch (IOException | URISyntaxException e) {
        }
    }
}

class SemiSleeper extends PriceEnquiry{
    public void price()
    {
        try {

            URI uri;
            uri = new URI("https://www.redbus.in/online-booking/tnstc/ac-sleeper-bus-tickets");
            java.awt.Desktop.getDesktop().browse(uri);

        } catch (IOException | URISyntaxException e) {
        }
    }
}

class Sleeper extends PriceEnquiry{
    public void price()
    {
        try {

            URI uri;
            uri = new URI("https://www.redbus.in/online-booking/tnstc");
            java.awt.Desktop.getDesktop().browse(uri);

        } catch (IOException | URISyntaxException e) {
        }
    }
}


