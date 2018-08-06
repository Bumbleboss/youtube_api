
package youTubeAPI.core;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import youTubeAPI.core.entities.channels.PageInfo;
import youTubeAPI.core.entities.search.Item;

public class YTSearch {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("etag")
    @Expose
    public String etag;
    @SerializedName("nextPageToken")
    @Expose
    public String nextPageToken;
    @SerializedName("regionCode")
    @Expose
    public String regionCode;
    @SerializedName("items")
    @Expose
    private List<Item> items;
    @SerializedName("pageInfo")
    @Expose
    public PageInfo pageInfo;
    
    public PageInfo getPageInfo(){
		return pageInfo;
	}
	public List<Item> getItems() {
		return items;
	}
}
