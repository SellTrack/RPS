package main1;


public class stone extends items{
    public stone(){
        Health = 20;
        xp = 0;
        level = 1;
        System.out.println("tas nesnesi olusturuldu");
        eternity = 2;
        name = "Tas";
        speciality[0][0] = 2;
        speciality[0][1] = 1;
        speciality[1][0] = 0;
        speciality[1][1] = 0;
        speciality[2][0] = 0;
        speciality[2][1] = 0;
    }

    public double damage_give(int[][] speciality, int eternity){
        double a = 0.2;
        if(eternity == 2)
            return 0;
        return ((this.speciality[0][0] * this.speciality[0][1])/( (a * speciality[2][0] * speciality[2][1]) + ((1-a)*speciality[1][0]*speciality[1][1])));
    }
}
