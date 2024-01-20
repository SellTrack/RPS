package main1;

public class paper extends items {
    public paper(){
        Health = 20;
        xp = 0;
        level = 1;
        System.out.println("kagit nesnesi olusturuldu");
        eternity = 3;
        name = "Kagit";
        speciality[0][0] = 0;
        speciality[0][1] = 0;
        speciality[1][0] = 2;
        speciality[1][1] = 1;
        speciality[2][0] = 0;
        speciality[2][1] = 0;
    }
    public double damage_give(int[][] speciality, int eternity){
        double a = 0.2;
        if(eternity == 3)
            return 0;
        return ((this.speciality[1][0] * this.speciality[1][1])/( (a * speciality[0][0] * speciality[0][1]) + ((1-a)*speciality[2][0]*speciality[2][1])));
    }
}
