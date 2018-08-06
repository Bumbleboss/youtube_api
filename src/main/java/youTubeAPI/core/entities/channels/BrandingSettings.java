package youTubeAPI.core.entities.channels;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BrandingSettings {

	@SerializedName("channel")
	@Expose
	public Channel channel;
	@SerializedName("image")
	@Expose
	public Image image;
	@SerializedName("hints")
	@Expose
	public List<Hint> hints;
}
