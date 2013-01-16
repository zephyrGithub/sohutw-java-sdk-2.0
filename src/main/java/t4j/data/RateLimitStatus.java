package t4j.data;

import t4j.TBlogException;
import t4j.http.Response;
import t4j.org.json.JSONException;
import t4j.org.json.JSONObject;

/**
 * User: chenxiaojian
 * Date: 13-1-8
 * Time: 上午11:59
 */
public class RateLimitStatus {

    private Integer hourly_limit;
    private Integer remaining_hits;
    private Integer reset_time_in_seconds;
    private String reset_time;

    public RateLimitStatus(Response res) throws TBlogException {
        JSONObject json = res.asJSONObject();
        init(json);
    }

    private void init(JSONObject json) {
        try {
            this.hourly_limit = json.getInt("hourly_limit");
            this.remaining_hits = json.getInt("remaining_hits");
            this.reset_time_in_seconds = json.getInt("reset_time_in_seconds");
            this.reset_time = json.getString("reset_time");
        } catch (JSONException je) {

        }
    }


    public Integer getHourly_limit() {
        return hourly_limit;
    }

    public void setHourly_limit(Integer hourly_limit) {
        this.hourly_limit = hourly_limit;
    }

    public Integer getRemaining_hits() {
        return remaining_hits;
    }

    public void setRemaining_hits(Integer remaining_hits) {
        this.remaining_hits = remaining_hits;
    }

    public Integer getReset_time_in_seconds() {
        return reset_time_in_seconds;
    }

    public void setReset_time_in_seconds(Integer reset_time_in_seconds) {
        this.reset_time_in_seconds = reset_time_in_seconds;
    }

    public String getReset_time() {
        return reset_time;
    }

    public void setReset_time(String reset_time) {
        this.reset_time = reset_time;
    }
}
