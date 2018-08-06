
package youTubeAPI.core.entities.videos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideosItem {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("etag")
    @Expose
    public String etag;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("snippet")
    @Expose
    private Snippet snippet;
    @SerializedName("contentDetails")
    @Expose
    private ContentDetails contentDetails;
    @SerializedName("statistics")
    @Expose
    private Statistics statistics;
    
	public Snippet getInfo() {
		return snippet;
	}
	public ContentDetails getContentDetails() {
		return contentDetails;
	}
	public Statistics getStatistics() {
		return statistics;
	}
}
