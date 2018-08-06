
package youTubeAPI.core.entities.videos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentDetails {

    @SerializedName("duration")
    @Expose
    public String duration;
    @SerializedName("dimension")
    @Expose
    public String dimension;
    @SerializedName("definition")
    @Expose
    public String definition;
    @SerializedName("caption")
    @Expose
    public String caption;
    @SerializedName("licensedContent")
    @Expose
    public Boolean licensedContent;
    @SerializedName("projection")
    @Expose
    public String projection;
}
