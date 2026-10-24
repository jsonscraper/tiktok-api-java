import com.jsonscraper.tiktok.TikTok;
import java.util.Map;
import java.nio.charset.StandardCharsets;

public class Example {
 public static void main(String[] args) throws Exception {
  var client = new TikTok(System.getenv("JSONSCRAPER_TIKTOK_LICENSE_KEY"));
  var response = client.get_user_info(Map.of("query", "therock", "cache_timeout", 60));
  System.out.println(new String(response.body(), StandardCharsets.UTF_8));
 }
}
