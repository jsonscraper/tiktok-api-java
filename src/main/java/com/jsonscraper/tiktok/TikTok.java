package com.jsonscraper.tiktok;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;
public final class TikTok extends Client {
 public TikTok(String key){super(key);}
 public TikTok(String key,String baseUrl,Duration timeout,int retries,Integer cacheTimeout){super(key,baseUrl,timeout,retries,cacheTimeout);}
 public HttpResponse<byte[]> get_no_watermark_url(Map<String,?> params)throws IOException,InterruptedException{return request("/getNoWatermarkUrl",params);}
 public HttpResponse<byte[]> get_no_watermark_url_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getNoWatermarkUrlByID",params);}
 public HttpResponse<byte[]> get_video_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getVideoByID",params);}
 public HttpResponse<byte[]> get_video_by_url(Map<String,?> params)throws IOException,InterruptedException{return request("/getVideoByUrl",params);}
 public HttpResponse<byte[]> get_unshortened_url(Map<String,?> params)throws IOException,InterruptedException{return request("/getUnshortenedUrl",params);}
 public HttpResponse<byte[]> get_comments_by_url(Map<String,?> params)throws IOException,InterruptedException{return request("/getCommentsByUrl",params);}
 public HttpResponse<byte[]> get_comments_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getCommentsByID",params);}
 public HttpResponse<byte[]> get_comments_replies(Map<String,?> params)throws IOException,InterruptedException{return request("/getCommentsReplies",params);}
 public HttpResponse<byte[]> search_user(Map<String,?> params)throws IOException,InterruptedException{return request("/searchUser",params);}
 public HttpResponse<byte[]> search_video(Map<String,?> params)throws IOException,InterruptedException{return request("/searchVideo",params);}
 public HttpResponse<byte[]> search_music(Map<String,?> params)throws IOException,InterruptedException{return request("/searchMusic",params);}
 public HttpResponse<byte[]> search_live(Map<String,?> params)throws IOException,InterruptedException{return request("/searchLive",params);}
 public HttpResponse<byte[]> search_hashtag(Map<String,?> params)throws IOException,InterruptedException{return request("/searchHashtag",params);}
 public HttpResponse<byte[]> search_location(Map<String,?> params)throws IOException,InterruptedException{return request("/searchLocation",params);}
 public HttpResponse<byte[]> search_top(Map<String,?> params)throws IOException,InterruptedException{return request("/searchTop",params);}
 public HttpResponse<byte[]> search_insights(Map<String,?> params)throws IOException,InterruptedException{return request("/searchInsights",params);}
 public HttpResponse<byte[]> search_comment_suggested_users(Map<String,?> params)throws IOException,InterruptedException{return request("/searchCommentSuggestedUsers",params);}
 public HttpResponse<byte[]> get_user_info(Map<String,?> params)throws IOException,InterruptedException{return request("/getUserInfo",params);}
 public HttpResponse<byte[]> get_user_info_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getUserInfoByID",params);}
 public HttpResponse<byte[]> get_basic_user_info(Map<String,?> params)throws IOException,InterruptedException{return request("/getBasicUserInfo",params);}
 public HttpResponse<byte[]> get_user_feed(Map<String,?> params)throws IOException,InterruptedException{return request("/getUserFeed",params);}
 public HttpResponse<byte[]> get_user_feed_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getUserFeedByID",params);}
 public HttpResponse<byte[]> get_user_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getUserID",params);}
 public HttpResponse<byte[]> get_username_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getUsernameByID",params);}
 public HttpResponse<byte[]> get_twitter_username(Map<String,?> params)throws IOException,InterruptedException{return request("/getTwitterUsername",params);}
 public HttpResponse<byte[]> get_instagram_username(Map<String,?> params)throws IOException,InterruptedException{return request("/getInstagramUsername",params);}
 public HttpResponse<byte[]> get_youtube_channel(Map<String,?> params)throws IOException,InterruptedException{return request("/getYoutubeChannel",params);}
 public HttpResponse<byte[]> get_followers(Map<String,?> params)throws IOException,InterruptedException{return request("/getFollowers",params);}
 public HttpResponse<byte[]> get_followers_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getFollowersByID",params);}
 public HttpResponse<byte[]> get_following(Map<String,?> params)throws IOException,InterruptedException{return request("/getFollowing",params);}
 public HttpResponse<byte[]> get_following_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getFollowingByID",params);}
 public HttpResponse<byte[]> get_live_event_info_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getLiveEventInfoByID",params);}
 public HttpResponse<byte[]> get_hashtag_info(Map<String,?> params)throws IOException,InterruptedException{return request("/getHashtagInfo",params);}
 public HttpResponse<byte[]> get_hashtag_feed(Map<String,?> params)throws IOException,InterruptedException{return request("/getHashtagFeed",params);}
 public HttpResponse<byte[]> get_hashtag_feed_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getHashtagFeedByID",params);}
 public HttpResponse<byte[]> get_location_info_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getLocationInfoByID",params);}
 public HttpResponse<byte[]> get_location_feed_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getLocationFeedByID",params);}
 public HttpResponse<byte[]> get_music_info(Map<String,?> params)throws IOException,InterruptedException{return request("/getMusicInfo",params);}
 public HttpResponse<byte[]> get_music_feed(Map<String,?> params)throws IOException,InterruptedException{return request("/getMusicFeed",params);}
 public HttpResponse<byte[]> get_music_charts(Map<String,?> params)throws IOException,InterruptedException{return request("/getMusicCharts",params);}
 public HttpResponse<byte[]> get_trending_categories_list(Map<String,?> params)throws IOException,InterruptedException{return request("/getTrendingCategoriesList",params);}
 public HttpResponse<byte[]> get_trending_feed(Map<String,?> params)throws IOException,InterruptedException{return request("/getTrendingFeed",params);}
 public HttpResponse<byte[]> get_stickers_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getStickersByID",params);}
 public HttpResponse<byte[]> get_sticker_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getStickerByID",params);}
 public HttpResponse<byte[]> get_sticker_feed_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getStickerFeedByID",params);}
 public HttpResponse<byte[]> get_user_stories(Map<String,?> params)throws IOException,InterruptedException{return request("/getUserStories",params);}
 public HttpResponse<byte[]> get_story_info_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getStoryInfoByID",params);}
 public HttpResponse<byte[]> get_user_playlists(Map<String,?> params)throws IOException,InterruptedException{return request("/getUserPlaylists",params);}
 public HttpResponse<byte[]> get_user_playlist_by_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getUserPlaylistByID",params);}
 public HttpResponse<byte[]> get_video_by_playlist_id(Map<String,?> params)throws IOException,InterruptedException{return request("/getVideoByPlaylistID",params);}
 public HttpResponse<byte[]> get_available_ranking_list(Map<String,?> params)throws IOException,InterruptedException{return request("/getAvailableRankingList",params);}
 public HttpResponse<byte[]> get_ranking_info(Map<String,?> params)throws IOException,InterruptedException{return request("/getRankingInfo",params);}
 public HttpResponse<byte[]> get_live_info(Map<String,?> params)throws IOException,InterruptedException{return request("/getLiveInfo",params);}
 public HttpResponse<byte[]> get_live_feed(Map<String,?> params)throws IOException,InterruptedException{return request("/getLiveFeed",params);}
}
