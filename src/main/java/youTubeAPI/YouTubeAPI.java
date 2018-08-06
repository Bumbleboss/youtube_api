package youTubeAPI;

import java.io.IOException;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import youTubeAPI.core.YTSearch;
import youTubeAPI.core.YouTubeChannels;
import youTubeAPI.core.YouTubeVideos;
import youTubeAPI.core.error.YouTubeError;

public class YouTubeAPI {
	
	private String apikey;
	private Logger logger = LoggerFactory.getLogger("youtube_api");

	public YouTubeAPI(String key) {
		this.apikey = key;
	}
	
	private static OkHttpClient client = new OkHttpClient();

	public YTSearch searchVideo(String keyword) {
		String json = null;
		try{
			json = getJSONGET("https://www.googleapis.com/youtube/v3/search?part=snippet&q="+keyword+
					"&type=video&key=" + apikey);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();		
		YTSearch profile = gson.fromJson(json, YTSearch.class);
		if(profile.kind==null) {
			YouTubeError err = gson.fromJson(json, YouTubeError.class);
			logger.error(err.getError().getErrors().get(0).getMessage() +"; " + err.getError().getErrors().get(0).getReason());
		}else if(profile.getPageInfo().totalResults.equals(0)) {
			logger.error("Bad request; no results were found");
		}
		return profile;
	}
	
	public YTSearch searchChannel(String keyword) {
		String json = null;
		try{
			json = getJSONGET("https://www.googleapis.com/youtube/v3/search?part=snippet&q="+keyword+
					"&type=channel&key=" + apikey);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();		
		YTSearch profile = gson.fromJson(json, YTSearch.class);
		if(profile.kind==null) {
			YouTubeError err = gson.fromJson(json, YouTubeError.class);
			logger.error(err.getError().getErrors().get(0).getMessage() +"; " + err.getError().getErrors().get(0).getReason());
		}else if(profile.getPageInfo().totalResults.equals(0)) {
			logger.error("Bad request; no results were found");
		}
		return profile;
	}
	
	public YouTubeVideos getVideo(String videoId) {
		String json = null;
		try{
			json = getJSONGET("https://www.googleapis.com/youtube/v3/videos?part=snippet,contentDetails,statistics&id="+videoId+"&key=" + apikey);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();		
		YouTubeVideos profile = gson.fromJson(json, YouTubeVideos.class);
		if(profile.kind==null) {
			YouTubeError err = gson.fromJson(json, YouTubeError.class);
			logger.error(err.getError().getErrors().get(0).getMessage() +"; " + err.getError().getErrors().get(0).getReason());
		}else if(profile.getPageInfo().totalResults.equals(0)) {
			logger.error("Bad request; no results were found");
		}
		return profile;
	}
	
	public YouTubeChannels getChannel(String channelId) {
		String json = null;
		try{
			json = getJSONGET("https://www.googleapis.com/youtube/v3/channels?part=snippet,statistics,brandingSettings&id="+channelId+"&key=" + apikey);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();		
		YouTubeChannels profile = gson.fromJson(json, YouTubeChannels.class);
		if(profile.kind==null) {
			YouTubeError err = gson.fromJson(json, YouTubeError.class);
			logger.error(err.getError().getErrors().get(0).getMessage() +"; " + err.getError().getErrors().get(0).getReason());
		}else if(profile.getPageInfo().totalResults.equals(0)) {
			logger.error("Bad request; no results were found");
		}
		return profile;
	}

	private static String getJSONGET(String url) throws IOException {
		Request request = new Request.Builder().url(url).build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}
}
