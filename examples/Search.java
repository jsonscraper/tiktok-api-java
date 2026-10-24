import com.jsonscraper.tiktok.TikTok;
import java.util.Map;
import java.nio.charset.StandardCharsets;
public class Search {public static void main(String[] args)throws Exception{var c=new TikTok(System.getenv("JSONSCRAPER_TIKTOK_LICENSE_KEY"));var r=c.request("/searchVideo",Map.of("keyword", "nature", "count", 10, "cache_timeout", 60));System.out.println(new String(r.body(),StandardCharsets.UTF_8));}}
