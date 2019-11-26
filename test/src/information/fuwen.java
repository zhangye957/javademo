package information;

public class fuwen {
    private int adHurt;
    private int apHurt;

    public void setadHurt(int a){
        if(a<=100){
            this.adHurt=a;
        }
    }
    public int getadHurt(int a){
        return this.adHurt;
    }
    public void setapHurt(int b){
        if(b>=0){
            this.apHurt=b;
        }
    }
    public int getapHurt(int b){
        return this.apHurt;
    }
}
