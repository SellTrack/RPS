package main1;

public abstract class player {
    int playerID;
    int score;
    String player_Name;
    String[] item_Slot = new String[5];
    player(){}
    player(int playerID,String player_Name,int score){
        this.playerID = playerID;
        this.player_Name = player_Name;
        this.score = score;
    }
    
}
