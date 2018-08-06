package youTubeAPI.core.entities.channels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Channel {

	@SerializedName("title")
	@Expose
	public String title;
	@SerializedName("keywords")
	@Expose
	public String keywords;
	@SerializedName("defaultTab")
	@Expose
	public String defaultTab;
	@SerializedName("showRelatedChannels")
	@Expose
	public Boolean showRelatedChannels;
	@SerializedName("showBrowseView")
	@Expose
	public Boolean showBrowseView;
	@SerializedName("featuredChannelsTitle")
	@Expose
	public String featuredChannelsTitle;
	@SerializedName("featuredChannelsUrls")
	@Expose
	public List<String> featuredChannelsUrls;
	@SerializedName("profileColor")
	@Expose
	public String profileColor;
}