package com.example.i200444_i200518_project;

public class Team {
    private String teamName;
    private Integer playerCount;
    private String[] players;

    public Team(String teamName, Integer playerCount, String[] players) {
        this.teamName = teamName;
        this.playerCount = playerCount;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(Integer playerCount) {
        this.playerCount = playerCount;
    }

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }
}
