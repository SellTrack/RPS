package main1;

import javax.swing.text.html.HTMLFrameHyperlinkEvent;

public abstract class items {
    public double Health;
    public double xp;
    public double level;
    public int eternity;
    public String name;
    public int[][] speciality = {{0,0},{0,0},{0,0}};
    public items(){
        System.out.println("nesne basarili bir sekilde olusturuldu");
        Health = 20;
        xp = 0;
        level = 1;
    }
    public items(double Health,double xp){
        System.out.println("nesne basarili bir sekilde olusturuldu");
        this.Health = Health;
        this.xp = xp;
        level = 1;
    }
    public double damage_give(int[][] speciality, int eternity, int eternity2){
        double a = 0.2;
        if(eternity == 2 && eternity2 != 2){
            return ((this.speciality[0][0] * this.speciality[0][1])/( (a * speciality[2][0] * speciality[2][1]) + ((1-a)*speciality[1][0]*speciality[1][1])));
        }
        else if(eternity == 3 && eternity2 != 3){
            return ((this.speciality[1][0] * this.speciality[1][1])/( (a * speciality[0][0] * speciality[0][1]) + ((1-a)*speciality[2][0]*speciality[2][1])));
        }
        else if(eternity == 4 && eternity2 != 4){
            return ((this.speciality[2][0] * this.speciality[2][1])/( (a * speciality[1][0] * speciality[1][1]) + ((1-a)*speciality[0][0]*speciality[0][1])));
        }
        return 0;
    }
    public void damage_take(items[] items, items[] items_pc, int r ,int place){
        items[3].Health -= items_pc[r].damage_give(items[3].speciality, items_pc[r].eternity, items[3].eternity);
            System.out.println("bizim kartın canı " + items[3].Health);
            System.out.println("pc nin sectigi kart" + r + "yani su elemana denk geliyor " + items_pc[r].eternity
                    + " pc nin canı " + items_pc[r].Health);

    }
}
