package youTubeAPI.core.error;

public class YouTubeException extends Exception{

    private static final long serialVersionUID = 1L;
    public YouTubeException(String error, String error_description) {
        super(error + "; " + error_description);
    }
}
