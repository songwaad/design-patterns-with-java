package org.example.flyweight;

public class KGBTeam {
    private String name;
    private String baseLocation;
    private String teamObjective;

    public KGBTeam(String name, String baseLocation, String teamObjective) {
        this.name = name;
        this.baseLocation = baseLocation;
        this.teamObjective = teamObjective;
    }

    public String getInfo() {
        return "Team : " + name +
                "\nBase Location : " + baseLocation +
                "\nTeam Objective : " + teamObjective;
    }
}
