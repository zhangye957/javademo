package load.jopo;

public class Green extends Epigraph {
    Green(){

    }
    public Green(String adhurt, String aphurt, String adspeed, String wlct, String fsct, String fsxx, String zdsm, String wlfy, String fsfy, String bjl, String lqsj, String hx) {
        this.adhurt = adhurt;
        this.aphurt = aphurt;
        this.adspeed = adspeed;
        this.wlct = wlct;
        this.fsct = fsct;
        this.fsxx = fsxx;
        this.zdsm = zdsm;
        this.wlfy = wlfy;
        this.fsfy = fsfy;
        this.bjl = bjl;
        this.lqsj = lqsj;
        this.hx = hx;
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

    public String getWlct() {
        return wlct;
    }

    public String getFsct() {
        return fsct;
    }

    public String getFsxx() {
        return fsxx;
    }

    public String getZdsm() {
        return zdsm;
    }

    public String getWlfy() {
        return wlfy;
    }

    public String getFsfy() {
        return fsfy;
    }

    public String getBjl() {
        return bjl;
    }

    public String getLqsj() {
        return lqsj;
    }

    public String getHx() {
        return hx;
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

    public void setWlct(String wlct) {
        this.wlct = wlct;
    }

    public void setFsct(String fsct) {
        this.fsct = fsct;
    }

    public void setFsxx(String fsxx) {
        this.fsxx = fsxx;
    }

    public void setZdsm(String zdsm) {
        this.zdsm = zdsm;
    }

    public void setWlfy(String wlfy) {
        this.wlfy = wlfy;
    }

    public void setFsfy(String fsfy) {
        this.fsfy = fsfy;
    }

    public void setBjl(String bjl) {
        this.bjl = bjl;
    }

    public void setLqsj(String lqsj) {
        this.lqsj = lqsj;
    }

    public void setHx(String hx) {
        this.hx = hx;
    }

    private String adhurt;//物理攻击
    private String aphurt;//法术攻击
    private String adspeed;//攻击速度
    private String wlct;//物理穿透
    private String fsct;//法术穿透
    private String fsxx;//法术吸血
    private String zdsm;//最大生命
    private String wlfy;//物理防御
    private String fsfy;//法术防御
    private String bjl;//暴击率
    private String lqsj;//冷却缩减
    private String hx;//每5秒回血
}
