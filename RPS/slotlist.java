public class slotlist {
    String[][] slotlist = new String[5][4];
    public void setslotvalue(String slotlist[][],int i) {
        slotlist[i][2] = "20";
        slotlist[i][3] = "0";
        slotlist[i][4] = "1";
    }
    public String getslotname(String slotlist[][],int i) {
        return slotlist[i][1];
    }

    public String getslothp(String slotlist[][],int i) {
        return slotlist[i][2];
    }

    public String getslotxp(String slotlist[][],int i) {
        return slotlist[i][3];
    }

    public String getslotlvl(String slotlist[][],int i) {
        return slotlist[i][4];
    }
}
