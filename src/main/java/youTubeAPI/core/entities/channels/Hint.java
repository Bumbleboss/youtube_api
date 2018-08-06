package youTubeAPI.core.entities.channels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hint {

	@SerializedName("property")
	@Expose
	public String property;
	@SerializedName("value")
	@Expose
	public String value;
}
