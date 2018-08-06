
package youTubeAPI.core.entities.channels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statistics {

    @SerializedName("viewCount")
    @Expose
    public String viewCount;
    @SerializedName("commentCount")
    @Expose
    public String commentCount;
    @SerializedName("subscriberCount")
    @Expose
    public String subscriberCount;
    @SerializedName("hiddenSubscriberCount")
    @Expose
    public Boolean hiddenSubscriberCount;
    @SerializedName("videoCount")
    @Expose
    public String videoCount;
}
