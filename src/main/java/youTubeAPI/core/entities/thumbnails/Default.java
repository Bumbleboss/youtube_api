
package youTubeAPI.core.entities.thumbnails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Default {

	@SerializedName("url")
    @Expose
    public String url;
    @SerializedName("width")
    @Expose
    public Integer width;
    @SerializedName("height")
    @Expose
    public Integer height;
}