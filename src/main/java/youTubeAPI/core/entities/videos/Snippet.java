
package youTubeAPI.core.entities.videos;

import java.util.List;
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
    @SerializedName("tags")
    @Expose
    public List<String> tags;
    @SerializedName("categoryId")
    @Expose
    public String categoryId;
    @SerializedName("liveBroadcastContent")
    @Expose
    public String liveBroadcastContent;
    @SerializedName("defaultLanguage")
    @Expose
    public String defaultLanguage;
    @SerializedName("localized")
    @Expose
    private Localized localized;
    @SerializedName("defaultAudioLanguage")
    @Expose
    public String defaultAudioLanguage;

	public Thumbnails getThumbnails() {
		return thumbnails;
	}
	public Localized getLocalized() {
		return localized;
	}
}
