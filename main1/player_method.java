package main1;

public class player_method extends player {
    void show_Score(char player_Name, int score)
    {
        System.out.println(player_Name + "adli oyuncunun skoru" + score);
    }
    void select_Item(String[] item_Slot, String[] input)
    {
        item_Slot[0] = input[0];
        item_Slot[1] = input[1];
        item_Slot[2] = input[2];
        item_Slot[3] = input[3];
        item_Slot[4] = input[4];
    }
    void item_List(String[] item_Slot)
    {
        System.out.println("secmis oldugunuz nesneler gosteriliyor");
        System.out.println( "1 - " + item_Slot[0]);
        System.out.println( "2 - " + item_Slot[1]);
        System.out.println( "3 - " + item_Slot[2]);
        System.out.println( "4 - " + item_Slot[3]);
        System.out.println( "5 - " + item_Slot[4]);
    }
}
