package TheFirstGame;

import java.util.Scanner;

public class BGJ extends Role implements  Activity{
    Skill[] skill={
            new Skill("变成老头",25,5),
            new Skill("变成老妪",25,5),
            new Skill("变成少年",60,20),
            new Skill("现出原形",20,5)
    };
    public BGJ(int attact_v,int defend_v){
        this.name="白骨精";
        this.attact_v=attact_v;
        this.defend_v=defend_v;
    }


    @Override
    public void attract( Role b) {
        System.out.println(this.name+"平A了一下"+b.name);
        b.hp-=this.attact_v;
    }

    @Override
    public void useSkill(Role b) {
        int cN;
        System.out.println("请选择要使用的技能");
        for(int i=0;i<4;i++){
            System.out.println((i+1)+"."+"技能："+skill[i].s_name+"伤害："+skill[i].s_attrack+"蓝耗："+skill[i].s_mp);
        }
        Scanner sc=new Scanner(System.in);
        cN=sc.nextInt();
        switch (cN){
            case 1:
                System.out.println(this.name+"对"+b.name+"使用了"+skill[0].s_name+"效果显著");
                break;
            case 2:
                System.out.println(this.name+"对"+b.name+"使用了"+skill[1].s_name+"效果显著");
                break;
            case 3:
                System.out.println(this.name+"对"+b.name+"使用了"+skill[2].s_name+"效果显著");
                break;
            case 4:
                System.out.println(this.name+"对"+b.name+"使用了"+skill[3].s_name+"效果显著");
                break;

        }

    }
}
