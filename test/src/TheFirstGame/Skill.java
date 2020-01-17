package TheFirstGame;

public class Skill {
    String s_name;
    int s_attrack;
    int s_mp;

    public Skill(String s_name,int s_attrack,int s_mp){
        this.s_name=s_name;
        this.s_attrack=s_attrack;
        this.s_mp=s_mp;
    }
    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_attrack() {
        return s_attrack;
    }

    public void setS_attrack(int s_attrack) {
        this.s_attrack = s_attrack;
    }

    public int getS_mp() {
        return s_mp;
    }

    public void setS_mp(int s_mp) {
        this.s_mp = s_mp;
    }


}
