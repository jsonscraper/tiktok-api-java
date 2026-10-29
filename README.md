# TikTok Scraper API for Java

[![Latest release](https://img.shields.io/github/v/tag/jsonscraper/tiktok-api-java?label=release&style=flat-square)](https://github.com/jsonscraper/tiktok-api-java/tags)
[![Java requirements](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white&style=flat-square)](#quick-start)
[![Last commit](https://img.shields.io/github/last-commit/jsonscraper/tiktok-api-java?style=flat-square)](https://github.com/jsonscraper/tiktok-api-java/commits)
[![MIT license](https://img.shields.io/github/license/jsonscraper/tiktok-api-java?style=flat-square)](LICENSE)

[![Run in Postman](https://run.pstmn.io/button.svg)](https://www.postman.com/evelode/workspace/evelode/collection/24862082-d886cc87-4267-4e0c-b57a-2d083add50ad)

A small, configurable client with named methods and ready-to-run examples. Supports **54 TikTok Scraper API methods**.

**Package:** `com.jsonscraper:tiktok-api` · **[Methods](#main-methods)** · **[Examples](#ready-to-run-examples)** · **[Documentation](docs/guide.md)**

<picture>
  <source media="(max-width: 640px) and (prefers-color-scheme: dark)" srcset="docs/quickstart-mobile-dark.svg">
  <source media="(max-width: 640px)" srcset="docs/quickstart-mobile.svg">
  <source media="(prefers-color-scheme: dark)" srcset="docs/quickstart-dark.svg">
  <img src="docs/quickstart.svg" alt="Quick start: API key, setup, first request, JSON response" width="880">
</picture>

<!-- mcp-announcement:start -->
<a href="https://jsonscraper.com/mcp?utm_source=github&utm_medium=readme&utm_campaign=jsonscraper-tiktok-api-java&utm_content=mcp_announcement#connect">
  <picture>
    <source media="(max-width: 640px) and (prefers-color-scheme: dark)" srcset="docs/mcp-announcement-mobile-dark.svg">
    <source media="(max-width: 640px)" srcset="docs/mcp-announcement-mobile.svg">
    <source media="(prefers-color-scheme: dark)" srcset="docs/mcp-announcement-dark.svg">
    <img src="docs/mcp-announcement.svg" alt="MCP is live: connect Instagram and TikTok data to ChatGPT, Claude or Codex with your existing API key. Connect via MCP." width="1100">
  </picture>
</a>
<!-- mcp-announcement:end -->

## Quick start

**1. Get your key** from the [TikTok API product page](https://jsonscraper.com/services/tiktok-scraper-api?utm_source=github&utm_medium=sdk&utm_campaign=tiktok-api-java&utm_content=readme) and set it on your server:

```sh
export JSONSCRAPER_TIKTOK_LICENSE_KEY='your-license-key'
```

**2. Install the package:**

```sh
git clone https://github.com/jsonscraper/tiktok-api-java.git
cd tiktok-api-java
mvn install
```

**3. Make a request:**

```java
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
```

The API payload is in `tiktok`. Live calls require a valid API license and may consume quota. [Response examples and status handling](docs/responses.md).

## Main methods

54 methods are available. Common starting points:

| What you need | Method |
| --- | --- |
| Read a profile | `get_user_info()` |
| Read a video | `get_video_by_id()` |
| Get a video download URL | `get_no_watermark_url()` |
| Read comments | `get_comments_by_id()` |
| Search videos | `search_video()` |
| List profile videos | `get_user_feed()` |

[All methods and parameters →](docs/endpoints.md)

## Ready-to-run examples

- [Read a profile](examples/endpoints/GetUserInfo.java).
- [Read a video](examples/endpoints/GetVideoById.java).
- [Read comments](examples/endpoints/GetCommentsById.java).
- [Search videos](examples/endpoints/SearchVideo.java).
- [List profile videos](examples/endpoints/GetUserFeed.java).

Each example includes command-line parameters, key setup, timeouts, error handling and response output. Run it with `--help` first; this makes no API request.

**[Browse all 54 complete examples](examples/README.md)** · **[Full method and parameter reference](docs/endpoints.md)**

## Configuration

Requests use a 30-second timeout by default. Configure caching and retries to fit your application's request budget. Keys are read from your server environment; redirects are disabled.

[Configuration options, HTTP errors, caching and pagination](docs/configuration.md) · [Full integration guide](docs/guide.md)

## Use with ChatGPT and Codex

Prefer an assistant connection? Use the shared [jsonscraper MCP server](https://jsonscraper.com/mcp?utm_source=github&utm_medium=sdk&utm_campaign=tiktok-api-java&utm_content=mcp). Connect an Instagram API license, a TikTok API license, or both; each product keeps its own plan and quota. [MCP source and setup](https://github.com/jsonscraper/mcp-server).

## Access, pricing and support

The SDK source is **MIT-licensed**. Hosted API access requires a separate TikTok license. Check [current plans and get access](https://jsonscraper.com/services/tiktok-scraper-api?utm_source=github&utm_medium=sdk&utm_campaign=tiktok-api-java&utm_content=readme).

[Service support](https://jsonscraper.com/contacts?utm_source=github&utm_medium=sdk&utm_campaign=tiktok-api-java&utm_content=support) · [SDK issues](https://github.com/jsonscraper/tiktok-api-java/issues) · [Changelog](CHANGELOG.md) · [MIT license](LICENSE)

## Development

```sh
python3 tests/contract.py
```

Tests use a local/mock server and require no API key. A [GitHub Actions template](docs/github-actions.yml) is available for optional automation.

The SDK has no installation or usage telemetry. README links use campaign parameters for website referral analytics. jsonscraper is independent and is not affiliated with TikTok.
