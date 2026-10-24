import com.jsonscraper.tiktok.TikTok;
import com.jsonscraper.tiktok.Client.APIException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.*;

/**
 * Get trending feed. GET /getTrendingFeed
 * Set JSONSCRAPER_TIKTOK_LICENSE_KEY. This example performs one request.
 * Compile with the SDK on your classpath; run GetTrendingFeed --help for parameters.
 */
public class GetTrendingFeed {
 public static void main(String[] args) {
  try { run(args); }
  catch(APIException e) {System.err.println("HTTP "+e.status+". Check parameters, access and quota. Retry-After: "+e.retryAfter);System.exit(1);}
  catch(InterruptedException e) {Thread.currentThread().interrupt();System.err.println("Request cancelled");System.exit(1);}
  catch(Exception e) {System.err.println(e.getMessage());System.exit(1);}
 }
 private static void run(String[] args)throws IOException,InterruptedException {
  Map<String,String> query=new LinkedHashMap<>(Map.ofEntries(Map.entry("cache_timeout", "60")));
  double timeout=30;int retries=0;Path output=null;
  for(String arg:args) {
   if(arg.equals("--help")){System.out.println("Get trending feed\nGET /getTrendingFeed\n\nEnvironment: JSONSCRAPER_TIKTOK_LICENSE_KEY\nCommon options: --timeout=30, --help\nQuery options:\n  --region=VALUE  Region (country) code. Default: US\n  --pull_type=VALUE  The type of loading feed (0 - Initial loading, 2 - Load more, 8 - Reload)\n  --cache_timeout=VALUE  Cache timeout in seconds. By default we use caching system with 3600 seconds window to speed up next requests to API. If you want to disable caching, you can set 0 here. \n\nValues omitted from the command use the public Postman sample defaults. Replace IDs/URLs with your own inputs. Each run makes one request; live requests may consume quota.");return;}
   if(!arg.startsWith("--")||!arg.contains("="))throw new IllegalArgumentException("Use --parameter=value or --help");
   String[] pair=arg.substring(2).split("=",2);
   switch(pair[0]) {
    case "timeout":timeout=Double.parseDouble(pair[1]);break;
    case "retries":retries=Integer.parseInt(pair[1]);break;
    case "output":output=Path.of(pair[1]);break;
    default:if(!Set.of("region", "pull_type", "cache_timeout").contains(pair[0]))throw new IllegalArgumentException("Unknown parameter: "+pair[0]);query.put(pair[0],pair[1]);
   }
  }
  String key=System.getenv("JSONSCRAPER_TIKTOK_LICENSE_KEY");
  if(key==null||key.isBlank())throw new IllegalArgumentException("Set JSONSCRAPER_TIKTOK_LICENSE_KEY before making a licensed request");
  if(!Double.isFinite(timeout)||timeout<=0||retries<0||retries>5)throw new IllegalArgumentException("Use a positive timeout and 0 to 5 retries");
  var client=new TikTok(key,null,Duration.ofMillis((long)(timeout*1000)),retries,null);
  var response=client.get_trending_feed(query);
  String type=response.headers().firstValue("Content-Type").orElse("");
  if(output!=null){Files.write(output,response.body());return;}
  if(!type.contains("json"))throw new IOException("Binary response: provide --output=filename");
  // The SDK retains the full envelope and exact ID bytes. Parse it with your
  // application's JSON library and check its status/quota fields before use.
  System.out.println(new String(response.body(),StandardCharsets.UTF_8));
 }
}
