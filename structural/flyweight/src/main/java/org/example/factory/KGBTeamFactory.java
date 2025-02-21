package org.example.factory;

import org.example.flyweight.KGBTeam;

import java.util.HashMap;

public class KGBTeamFactory {
    private HashMap<String, KGBTeam> kgbTeam = new HashMap<>();

    public KGBTeam getKGBTeam(String name, String baseLocation, String teamObjective) {
        if(!kgbTeam.containsKey(name)) {
            kgbTeam.put(name, new KGBTeam(name, baseLocation, teamObjective));
        }
        return kgbTeam.get(name);
    }
}
