package org.example.context;

import org.example.flyweight.KGBTeam;

public class KGBAgent {
    private String codeName;
    private String status;
    private String secretLevel;
    private KGBTeam team;

    public KGBAgent(String codeName, String status, String secretLevel, KGBTeam team) {
        this.codeName = codeName;
        this.status = status;
        this.secretLevel = secretLevel;
        this.team = 
    }

    public void showInfo() {
        System.out.println("☠️ KGB Agent ----");
        System.out.println("Code Name : " + codeName);
        System.out.println("Status : " + status);
        System.out.println("Secret Level : " + secretLevel);
        System.out.println(team.getInfo());
    }
}
