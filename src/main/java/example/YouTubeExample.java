package example;

import youTubeAPI.YouTubeAPI;
import youTubeAPI.core.error.YouTubeException;

public class YouTubeExample {

	public static void main (String[] args) {
		YouTubeAPI api = new YouTubeAPI("your_key");

		try {
            System.out.println(api.searchChannel("bumblecore").getItems().get(0).getInfo().description);
        }catch (YouTubeException ex) {
		    ex.printStackTrace();
        }
	}
}
