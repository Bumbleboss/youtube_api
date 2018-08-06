
package youTubeAPI.core;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import youTubeAPI.core.entities.channels.PageInfo;
import youTubeAPI.core.entities.videos.VideosItem;

public class YouTubeVideos {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("etag")
    @Expose
    public String etag;
    @SerializedName("items")
    @Expose
    private List<VideosItem> items;
    @SerializedName("pageInfo")
    @Expose
    private PageInfo pageInfo;
    
    public PageInfo getPageInfo(){
		return pageInfo;
	}
	public List<VideosItem> getItems() {
		return items;
	}
}
