import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HTMLDownloader {
	
	StringBuilder contentBuilder = new StringBuilder(); {
	try {
	    BufferedReader in = new BufferedReader(new FileReader("http://www.imdb.com/chart/top.html"));
	    String str;
	    while ((str = in.readLine()) != null) {
	        contentBuilder.append(str);
	    }
	    in.close();
	} catch (IOException e) {
	}
	String content = contentBuilder.toString();
}}