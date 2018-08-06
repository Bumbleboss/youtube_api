
package youTubeAPI.core.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import youTubeAPI.core.entities.thumbnails.Default;
import youTubeAPI.core.entities.thumbnails.High;
import youTubeAPI.core.entities.thumbnails.Maxres;
import youTubeAPI.core.entities.thumbnails.Medium;
import youTubeAPI.core.entities.thumbnails.Standard;

public class Thumbnails {

    @SerializedName("default")
    @Expose
    private Default _default;
    @SerializedName("medium")
    @Expose
    private Medium medium;
    @SerializedName("high")
    @Expose
    private High high;
    @SerializedName("standard")
    @Expose
    private Standard standard;
    @SerializedName("maxres")
    @Expose
    private Maxres maxres;
    
	public Default getDefault() {
		return _default;
	}
	public Medium getMedium() {
		return medium;
	}
	public High getHigh() {
		return high;
	}
	public Standard getStandard() {
		return standard;
	}
	public Maxres getMaxres() {
		return maxres;
	}
}
