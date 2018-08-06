
package youTubeAPI.core.entities.videos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statistics {

    @SerializedName("viewCount")
    @Expose
    public String viewCount;
    @SerializedName("likeCount")
    @Expose
    public String likeCount;
    @SerializedName("dislikeCount")
    @Expose
    public String dislikeCount;
    @SerializedName("favoriteCount")
    @Expose
    public String favoriteCount;
    @SerializedName("commentCount")
    @Expose
    public String commentCount;
}
