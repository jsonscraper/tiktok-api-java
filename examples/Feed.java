import com.jsonscraper.tiktok.TikTok;
import java.util.Map;
import java.nio.charset.StandardCharsets;
public class Feed {public static void main(String[] args)throws Exception{var c=new TikTok(System.getenv("JSONSCRAPER_TIKTOK_LICENSE_KEY"));var r=c.request("/getUserFeed",Map.of("query", "therock", "count", 10, "max_cursor", "", "cache_timeout", 60));System.out.println(new String(r.body(),StandardCharsets.UTF_8));}}
