package main1;

public class scissors extends items{
    public scissors(){
        Health = 20;
        xp = 0;
        level = 1;
        System.out.println("makas nesnesi olusturuldu");
        eternity = 4;
        name = "Makas";
        speciality[0][0] = 0;
        speciality[0][1] = 0;
        speciality[1][0] = 0;
        speciality[1][1] = 0;
        speciality[2][0] = 2;
        speciality[2][1] = 1;
    }

    public double damage_give(int[][] speciality, int eternity){
        double a = 0.2;
        if(eternity == 4)
            return 0;
        return ((this.speciality[2][0] * this.speciality[2][1])/( (a * speciality[1][0] * speciality[1][1]) + ((1-a)*speciality[0][0]*speciality[0][1])));
    }
}
