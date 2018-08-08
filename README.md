<img align="right" src="https://developers.google.com/site-assets/logo-youtube.svg" height="100" width="100">

## YouTube API
A Java API wrapper for [Youtube Data v3](https://developers.google.com/youtube/v3/)

## How to use
For setting the token
```Java
YouTubeAPI api = new YouTubeAPI("your_key");
```
Searching for a video by keyword
```Java
System.out.println(api.searchChannel("bumblecore").getItems().get(0).getInfo().description);
```

## Download
**Latest version**: [GitHub releases](https://github.com/Bumbleboss/youtube_api/releases) [![](https://jitpack.io/v/Bumbleboss/youtube_api.svg)](https://jitpack.io/#Bumbleboss/youtube_api)


## Dependencies
* [gson-2.8.5](https://github.com/google/gson)
* [okhttp-3.10.0](https://github.com/square/okhttp)
* [okio-1.14.1](https://github.com/square/okio/)