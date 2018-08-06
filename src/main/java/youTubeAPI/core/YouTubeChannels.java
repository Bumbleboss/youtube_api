
package youTubeAPI.core;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import youTubeAPI.core.entities.channels.ChannelItems;
import youTubeAPI.core.entities.channels.PageInfo;

public class YouTubeChannels {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("etag")
    @Expose
    public String etag;
    @SerializedName("items")
    @Expose
    private List<ChannelItems> items;
    @SerializedName("pageInfo")
    @Expose
    private PageInfo pageInfo;
    
    public PageInfo getPageInfo(){
		return pageInfo;
	}
	public List<ChannelItems> getItems() {
		return items;
	}
}
