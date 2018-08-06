
package youTubeAPI.core.entities.channels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import youTubeAPI.core.entities.Thumbnails;

public class Snippet {

    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("customUrl")
    @Expose
    public String customUrl;
    @SerializedName("publishedAt")
    @Expose
    public String publishedAt;
    @SerializedName("thumbnails")
    @Expose
    private Thumbnails thumbnails;
    @SerializedName("localized")
    @Expose
    private Localized localized;

	public Thumbnails getThumbnails() {
		return thumbnails;
	}
	public Localized getLocalized() {
		return localized;
	}
}
