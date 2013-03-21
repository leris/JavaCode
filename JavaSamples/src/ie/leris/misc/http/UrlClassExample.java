package ie.leris.misc.http;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlClassExample {

	public static void main(String[] args) {

		String fileURL = ("http://www.teamworkpm.net/index.cfm");
		try {
			URL url = new URL(fileURL);
		} catch (MalformedURLException e) {
			// TODO: handle exception
		}

	}

}
