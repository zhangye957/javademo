package load.jopo;

public class Blue extends Epigraph {

    public String getEname() {
        return ename;
    }

    public String getColor() {
        return color;
    }

    public int getDengji() {
        return dengji;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDengji(int dengji) {
        this.dengji = dengji;
    }

















    Blue(){}
    public Blue(String ename,String color, int dengji,int adhurt, int aphurt, int adspeed, int wlct, int fsct, int wlxx, int fsxx, int zdsm, int fsfy, int bjl, int lqsj, int hx, int ys) {
        this.ename=ename;
        this.color=color;
        this.dengji=dengji;
        this.adhurt = adhurt;
        this.aphurt = aphurt;
        this.adspeed = adspeed;
        this.wlct = wlct;
        this.fsct = fsct;
        this.wlxx = wlxx;
        this.fsxx = fsxx;
        this.zdsm = zdsm;
        this.fsfy = fsfy;
        this.bjl = bjl;
        this.lqsj = lqsj;
        this.hx = hx;
        this.ys = ys;
    }

    public int getAdhurt() {
        return adhurt;
    }

    public int getAphurt() {
        return aphurt;
    }

    public int getAdspeed() {
        return adspeed;
    }

    public int getWlct() {
        return wlct;
    }

    public int getFsct() {
        return fsct;
    }

    public int getWlxx() {
        return wlxx;
    }

    public int getFsxx() {
        return fsxx;
    }

    public int getZdsm() {
        return zdsm;
    }

    public int getFsfy() {
        return fsfy;
    }

    public int getBjl() {
        return bjl;
    }

    public int getLqsj() {
        return lqsj;
    }

    public int getHx() {
        return hx;
    }

    public int getYs() {
        return ys;
    }

    public void setAdhurt(int adhurt) {
        this.adhurt = adhurt;
    }

    public void setAphurt(int aphurt) {
        this.aphurt = aphurt;
    }

    public void setAdspeed(int adspeed) {
        this.adspeed = adspeed;
    }

    public void setWlct(int wlct) {
        this.wlct = wlct;
    }

    public void setFsct(int fsct) {
        this.fsct = fsct;
    }

    public void setWlxx(int wlxx) {
        this.wlxx = wlxx;
    }

    public void setFsxx(int fsxx) {
        this.fsxx = fsxx;
    }

    public void setZdsm(int zdsm) {
        this.zdsm = zdsm;
    }

    public void setFsfy(int fsfy) {
        this.fsfy = fsfy;
    }

    public void setBjl(int bjl) {
        this.bjl = bjl;
    }

    public void setLqsj(int lqsj) {
        this.lqsj = lqsj;
    }

    public void setHx(int hx) {
        this.hx = hx;
    }

    public void setYs(int ys) {
        this.ys = ys;
    }

    private int adhurt;//物理攻击
    private int aphurt;//法术攻击
    private int adspeed;//攻击速度
    private int wlct;//物理穿透
    private int fsct;//法术穿透
    private int wlxx;//物理吸血
    private int fsxx;//法术吸血
    private int zdsm;//最大生命
    private int fsfy;//法术防御
    private int bjl;//暴击率
    private int lqsj;//冷却缩减
    private int hx;//每5秒回血
    private int ys;//移速
}
