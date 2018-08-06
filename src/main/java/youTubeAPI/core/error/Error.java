
package youTubeAPI.core.error;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Error {

    @SerializedName("errors")
    @Expose
    private List<Error_> errors;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    
	public List<Error_> getErrors() {
		return errors;
	}
	public Integer getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
}
