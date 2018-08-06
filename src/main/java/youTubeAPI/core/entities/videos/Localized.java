
package youTubeAPI.core.entities.videos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Localized {

    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("description")
    @Expose
    public String description;
}
