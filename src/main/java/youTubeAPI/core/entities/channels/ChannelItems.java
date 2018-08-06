
package youTubeAPI.core.entities.channels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChannelItems {

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
    @SerializedName("statistics")
    @Expose
    private Statistics statistics;
    @SerializedName("brandingSettings")
    @Expose
    private BrandingSettings brandingSettings;
    
    public BrandingSettings getBrandings() {
    	return brandingSettings;
    }
	public Snippet getInfo() {
		return snippet;
	}
	public Statistics getStatistics() {
		return statistics;
	}
}
