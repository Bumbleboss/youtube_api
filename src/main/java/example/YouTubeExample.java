package example;

import youTubeAPI.YouTubeAPI;

public class YouTubeExample {

	public static void main (String[] args) {
		YouTubeAPI api = new YouTubeAPI("your_key");
		System.out.println(api.searchChannel("bumblecore").getItems().get(0).getInfo().description);
	}
}
