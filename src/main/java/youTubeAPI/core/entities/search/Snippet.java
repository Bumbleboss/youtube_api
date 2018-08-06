
package youTubeAPI.core.entities.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import youTubeAPI.core.entities.Thumbnails;

public class Snippet {

    @SerializedName("publishedAt")
    @Expose
    public String publishedAt;
    @SerializedName("channelId")
    @Expose
    public String channelId;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("thumbnails")
    @Expose
    private Thumbnails thumbnails;
    @SerializedName("channelTitle")
    @Expose
    public String channelTitle;
    @SerializedName("liveBroadcastContent")
    @Expose
    public String liveBroadcastContent;
    
	public Thumbnails getThumbnails() {
		return thumbnails;
	}
}
