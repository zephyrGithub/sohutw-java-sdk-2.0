package t4j.data;

import t4j.TBlogException;
import t4j.org.json.JSONException;
import t4j.org.json.JSONObject;

/**
 * User: chenxiaojian
 * Date: 13-1-5
 * Time: 上午10:28
 */
public class PicGroupVO {

    public String url;
    public String ps;

    public PicGroupVO(JSONObject json) throws TBlogException {
        init(json);
    }

    private void init(JSONObject json) throws TBlogException {
        try {
            this.url = json.getString("url");
            this.ps = json.getString("ps");
        } catch (JSONException je) {

        }
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

}
