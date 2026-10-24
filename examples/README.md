# TikTok java request examples

Every file below is a complete single-request CLI program with environment-based authentication, all documented query options, timeout configuration, error handling and full response output. Sample defaults come from Postman; replace account names, IDs and URLs for your use case. `--help` requires no API key and makes no network request.

Compile the SDK with Maven, then compile an example with `javac -cp target/classes -d examples/endpoints examples/endpoints/ExampleName.java`. Run with `java -cp target/classes:examples/endpoints ExampleName --help` (use `;` as the classpath separator on Windows).

Set `JSONSCRAPER_TIKTOK_LICENSE_KEY` and install the SDK as described in the main README. Each execution makes one live request and may consume quota. None of these programs loops through a feed automatically.

## Get non watermarked video url

[Open the complete example](endpoints/GetNoWatermarkUrl.java) · `GET /getNoWatermarkUrl`

```sh
java -cp target/classes:examples/endpoints GetNoWatermarkUrl --help
```

## Get non watermarked video url by video ID

[Open the complete example](endpoints/GetNoWatermarkUrlById.java) · `GET /getNoWatermarkUrlByID`

```sh
java -cp target/classes:examples/endpoints GetNoWatermarkUrlById --help
```

## Get video info by ID

[Open the complete example](endpoints/GetVideoById.java) · `GET /getVideoByID`

```sh
java -cp target/classes:examples/endpoints GetVideoById --help
```

## Get video info by URL

[Open the complete example](endpoints/GetVideoByUrl.java) · `GET /getVideoByUrl`

```sh
java -cp target/classes:examples/endpoints GetVideoByUrl --help
```

## Convert short TikTok video URL to full TikTok video URL

[Open the complete example](endpoints/GetUnshortenedUrl.java) · `GET /getUnshortenedUrl`

```sh
java -cp target/classes:examples/endpoints GetUnshortenedUrl --help
```

## Get comments list by video URL

[Open the complete example](endpoints/GetCommentsByUrl.java) · `GET /getCommentsByUrl`

```sh
java -cp target/classes:examples/endpoints GetCommentsByUrl --help
```

## Get comments list by video ID

[Open the complete example](endpoints/GetCommentsById.java) · `GET /getCommentsByID`

```sh
java -cp target/classes:examples/endpoints GetCommentsById --help
```

## Get comments replies

[Open the complete example](endpoints/GetCommentsReplies.java) · `GET /getCommentsReplies`

```sh
java -cp target/classes:examples/endpoints GetCommentsReplies --help
```

## Search for user by keyword

[Open the complete example](endpoints/SearchUser.java) · `GET /searchUser`

```sh
java -cp target/classes:examples/endpoints SearchUser --help
```

## Search for video by keyword

[Open the complete example](endpoints/SearchVideo.java) · `GET /searchVideo`

```sh
java -cp target/classes:examples/endpoints SearchVideo --help
```

## Search for music by keyword

[Open the complete example](endpoints/SearchMusic.java) · `GET /searchMusic`

```sh
java -cp target/classes:examples/endpoints SearchMusic --help
```

## Search for live by keyword

[Open the complete example](endpoints/SearchLive.java) · `GET /searchLive`

```sh
java -cp target/classes:examples/endpoints SearchLive --help
```

## Search for hashtag by keyword

[Open the complete example](endpoints/SearchHashtag.java) · `GET /searchHashtag`

```sh
java -cp target/classes:examples/endpoints SearchHashtag --help
```

## Search for location by keyword

[Open the complete example](endpoints/SearchLocation.java) · `GET /searchLocation`

```sh
java -cp target/classes:examples/endpoints SearchLocation --help
```

## Top search by text query

[Open the complete example](endpoints/SearchTop.java) · `GET /searchTop`

```sh
java -cp target/classes:examples/endpoints SearchTop --help
```

## Search insights by text query

[Open the complete example](endpoints/SearchInsights.java) · `GET /searchInsights`

```sh
java -cp target/classes:examples/endpoints SearchInsights --help
```

## Search comment suggested users

[Open the complete example](endpoints/SearchCommentSuggestedUsers.java) · `GET /searchCommentSuggestedUsers`

```sh
java -cp target/classes:examples/endpoints SearchCommentSuggestedUsers --help
```

## Get user info by profile URL or nickname

[Open the complete example](endpoints/GetUserInfo.java) · `GET /getUserInfo`

```sh
java -cp target/classes:examples/endpoints GetUserInfo --help
```

## Get user info by profile ID

[Open the complete example](endpoints/GetUserInfoById.java) · `GET /getUserInfoByID`

```sh
java -cp target/classes:examples/endpoints GetUserInfoById --help
```

## Get user info by username

[Open the complete example](endpoints/GetBasicUserInfo.java) · `GET /getBasicUserInfo`

```sh
java -cp target/classes:examples/endpoints GetBasicUserInfo --help
```

## Get user feed by profile URL or nickname

[Open the complete example](endpoints/GetUserFeed.java) · `GET /getUserFeed`

```sh
java -cp target/classes:examples/endpoints GetUserFeed --help
```

## Get user feed by profile ID

[Open the complete example](endpoints/GetUserFeedById.java) · `GET /getUserFeedByID`

```sh
java -cp target/classes:examples/endpoints GetUserFeedById --help
```

## Get user ID by profile URL or nickname

[Open the complete example](endpoints/GetUserId.java) · `GET /getUserID`

```sh
java -cp target/classes:examples/endpoints GetUserId --help
```

## Get username by TikTok user ID

[Open the complete example](endpoints/GetUsernameById.java) · `GET /getUsernameByID`

```sh
java -cp target/classes:examples/endpoints GetUsernameById --help
```

## Get Twitter username by profile URL, nickname or TikTok user ID

[Open the complete example](endpoints/GetTwitterUsername.java) · `GET /getTwitterUsername`

```sh
java -cp target/classes:examples/endpoints GetTwitterUsername --help
```

## Get Instagram username by profile URL, nickname or TikTok user ID

[Open the complete example](endpoints/GetInstagramUsername.java) · `GET /getInstagramUsername`

```sh
java -cp target/classes:examples/endpoints GetInstagramUsername --help
```

## Get YouTube channel info by profile URL, nickname or TikTok user ID

[Open the complete example](endpoints/GetYoutubeChannel.java) · `GET /getYoutubeChannel`

```sh
java -cp target/classes:examples/endpoints GetYoutubeChannel --help
```

## Get user followers by profile URL or nickname

[Open the complete example](endpoints/GetFollowers.java) · `GET /getFollowers`

```sh
java -cp target/classes:examples/endpoints GetFollowers --help
```

## Get user followers by profile ID

[Open the complete example](endpoints/GetFollowersById.java) · `GET /getFollowersByID`

```sh
java -cp target/classes:examples/endpoints GetFollowersById --help
```

## Get user following by profile URL or nickname

[Open the complete example](endpoints/GetFollowing.java) · `GET /getFollowing`

```sh
java -cp target/classes:examples/endpoints GetFollowing --help
```

## Get user following by profile ID

[Open the complete example](endpoints/GetFollowingById.java) · `GET /getFollowingByID`

```sh
java -cp target/classes:examples/endpoints GetFollowingById --help
```

## Get live event info by ID

[Open the complete example](endpoints/GetLiveEventInfoById.java) · `GET /getLiveEventInfoByID`

```sh
java -cp target/classes:examples/endpoints GetLiveEventInfoById --help
```

## Get hashtag info by URL or tag name

[Open the complete example](endpoints/GetHashtagInfo.java) · `GET /getHashtagInfo`

```sh
java -cp target/classes:examples/endpoints GetHashtagInfo --help
```

## Get hashtag feed by URL or tag name

[Open the complete example](endpoints/GetHashtagFeed.java) · `GET /getHashtagFeed`

```sh
java -cp target/classes:examples/endpoints GetHashtagFeed --help
```

## Get hashtag feed by ID

[Open the complete example](endpoints/GetHashtagFeedById.java) · `GET /getHashtagFeedByID`

```sh
java -cp target/classes:examples/endpoints GetHashtagFeedById --help
```

## Get location info by ID

[Open the complete example](endpoints/GetLocationInfoById.java) · `GET /getLocationInfoByID`

```sh
java -cp target/classes:examples/endpoints GetLocationInfoById --help
```

## Get videos by location ID

[Open the complete example](endpoints/GetLocationFeedById.java) · `GET /getLocationFeedByID`

```sh
java -cp target/classes:examples/endpoints GetLocationFeedById --help
```

## Get music info by URL or ID

[Open the complete example](endpoints/GetMusicInfo.java) · `GET /getMusicInfo`

```sh
java -cp target/classes:examples/endpoints GetMusicInfo --help
```

## Get music feed by URL or ID

[Open the complete example](endpoints/GetMusicFeed.java) · `GET /getMusicFeed`

```sh
java -cp target/classes:examples/endpoints GetMusicFeed --help
```

## Get music charts

[Open the complete example](endpoints/GetMusicCharts.java) · `GET /getMusicCharts`

```sh
java -cp target/classes:examples/endpoints GetMusicCharts --help
```

## Get trending categories list

[Open the complete example](endpoints/GetTrendingCategoriesList.java) · `GET /getTrendingCategoriesList`

```sh
java -cp target/classes:examples/endpoints GetTrendingCategoriesList --help
```

## Get trending feed

[Open the complete example](endpoints/GetTrendingFeed.java) · `GET /getTrendingFeed`

```sh
java -cp target/classes:examples/endpoints GetTrendingFeed --help
```

## Get effect information by IDs

[Open the complete example](endpoints/GetStickersById.java) · `GET /getStickersByID`

```sh
java -cp target/classes:examples/endpoints GetStickersById --help
```

## Get effect information by ID

[Open the complete example](endpoints/GetStickerById.java) · `GET /getStickerByID`

```sh
java -cp target/classes:examples/endpoints GetStickerById --help
```

## Get videos by effect ID

[Open the complete example](endpoints/GetStickerFeedById.java) · `GET /getStickerFeedByID`

```sh
java -cp target/classes:examples/endpoints GetStickerFeedById --help
```

## Get user stories

[Open the complete example](endpoints/GetUserStories.java) · `GET /getUserStories`

```sh
java -cp target/classes:examples/endpoints GetUserStories --help
```

## Get story info by ID

[Open the complete example](endpoints/GetStoryInfoById.java) · `GET /getStoryInfoByID`

```sh
java -cp target/classes:examples/endpoints GetStoryInfoById --help
```

## Get user playlists

[Open the complete example](endpoints/GetUserPlaylists.java) · `GET /getUserPlaylists`

```sh
java -cp target/classes:examples/endpoints GetUserPlaylists --help
```

## Get user playlist by ID

[Open the complete example](endpoints/GetUserPlaylistById.java) · `GET /getUserPlaylistByID`

```sh
java -cp target/classes:examples/endpoints GetUserPlaylistById --help
```

## Get video by playlist ID

[Open the complete example](endpoints/GetVideoByPlaylistId.java) · `GET /getVideoByPlaylistID`

```sh
java -cp target/classes:examples/endpoints GetVideoByPlaylistId --help
```

## Get available ranking list

[Open the complete example](endpoints/GetAvailableRankingList.java) · `GET /getAvailableRankingList`

```sh
java -cp target/classes:examples/endpoints GetAvailableRankingList --help
```

## Get ranking info

[Open the complete example](endpoints/GetRankingInfo.java) · `GET /getRankingInfo`

```sh
java -cp target/classes:examples/endpoints GetRankingInfo --help
```

## Get live info

[Open the complete example](endpoints/GetLiveInfo.java) · `GET /getLiveInfo`

```sh
java -cp target/classes:examples/endpoints GetLiveInfo --help
```

## Get live feed

[Open the complete example](endpoints/GetLiveFeed.java) · `GET /getLiveFeed`

```sh
java -cp target/classes:examples/endpoints GetLiveFeed --help
```

