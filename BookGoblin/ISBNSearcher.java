package BookGoblin;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ISBNSearcher {

    URL url = new URL("https://isbnsearch.org/");
    URLConnection con = url.openConnection();
    InputStream is = con.getInputStream();

    public ISBNSearcher() throws IOException {
    }
}
