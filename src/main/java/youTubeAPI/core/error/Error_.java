
package youTubeAPI.core.error;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Error_ {

    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("message")
    @Expose
    private String message;
    
	public String getDomain() {
		return domain;
	}
	public String getReason() {
		return reason;
	}
	public String getMessage() {
		return message;
	}
}
