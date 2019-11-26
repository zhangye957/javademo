package load.jopo;

public class Orange extends Epigraph {
    Orange(){}
    public Orange(String adhurt, String aphurt, String adspeed, String zdsm, String wlfy, String wlxx, String bjl, String bjxg, String wlct, String fsct) {
        this.adhurt = adhurt;
        this.aphurt = aphurt;
        this.adspeed = adspeed;
        this.zdsm = zdsm;
        this.wlfy = wlfy;
        this.wlxx = wlxx;
        this.bjl = bjl;
        this.bjxg = bjxg;
        this.wlct = wlct;
        this.fsct = fsct;
    }

    public String getAdhurt() {
        return adhurt;
    }

    public String getAphurt() {
        return aphurt;
    }

    public String getAdspeed() {
        return adspeed;
    }

    public String getZdsm() {
        return zdsm;
    }

    public String getWlfy() {
        return wlfy;
    }

    public String getWlxx() {
        return wlxx;
    }

    public String getBjl() {
        return bjl;
    }

    public String getBjxg() {
        return bjxg;
    }

    public String getWlct() {
        return wlct;
    }

    public String getFsct() {
        return fsct;
    }

    public void setAdhurt(String adhurt) {
        this.adhurt = adhurt;
    }

    public void setAphurt(String aphurt) {
        this.aphurt = aphurt;
    }

    public void setAdspeed(String adspeed) {
        this.adspeed = adspeed;
    }

    public void setZdsm(String zdsm) {
        this.zdsm = zdsm;
    }

    public void setWlfy(String wlfy) {
        this.wlfy = wlfy;
    }

    public void setWlxx(String wlxx) {
        this.wlxx = wlxx;
    }

    public void setBjl(String bjl) {
        this.bjl = bjl;
    }

    public void setBjxg(String bjxg) {
        this.bjxg = bjxg;
    }

    public void setWlct(String wlct) {
        this.wlct = wlct;
    }

    public void setFsct(String fsct) {
        this.fsct = fsct;
    }

    private String adhurt;//物理攻击
    private String aphurt;//法术攻击
    private String adspeed;//攻击速度
    private String zdsm;//最大生命
    private String wlfy;//物理防御
    private String wlxx;//物理吸血
    private String bjl;//暴击率
    private String bjxg;//暴击效果
    private String wlct;//物理穿透
    private String fsct;//法术穿透
}
