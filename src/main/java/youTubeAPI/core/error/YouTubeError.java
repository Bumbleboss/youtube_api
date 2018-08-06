
package youTubeAPI.core.error;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YouTubeError {

    @SerializedName("error")
    @Expose
    private Error error;

	public Error getError() {
		return error;
	}
}
