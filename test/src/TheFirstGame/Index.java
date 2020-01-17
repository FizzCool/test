package TheFirstGame;

public class Index {
    public static void main(String[] args) {
        System.out.println("游戏开始！！！");
        System.out.println("-------------------");
        SunWuKong s=new SunWuKong(10,5);
        BGJ b= new BGJ(9,4);
        s.attract(b);
        s.useSkill(b);


    }
}
