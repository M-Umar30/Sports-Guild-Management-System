package com.example.i200444_i200518_project;

public class Report {
    private String month;
    private String year;
    private String teamName;
    private Integer fixtures_held;
    private Integer fixtures_won;
    private Double win_percentage;

    private Double attendance_percentage;

    public Report(String month, String year, String teamName, Integer fixtures_held, Integer fixtures_won) {
        this.month = month;
        this.year = year;
        this.teamName = teamName;
        this.fixtures_held = fixtures_held;
        this.fixtures_won = fixtures_won;
        this.win_percentage = (double) (fixtures_won * 100) / fixtures_held;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getFixtures_held() {
        return fixtures_held;
    }

    public void setFixtures_held(Integer fixtures_held) {
        this.fixtures_held = fixtures_held;
    }

    public Integer getFixtures_won() {
        return fixtures_won;
    }

    public void setFixtures_won(Integer fixtures_won) {
        this.fixtures_won = fixtures_won;
    }

    public Double getWin_percentage() {
        return win_percentage;
    }

    public void setWin_percentage(Double win_percentage) {
        this.win_percentage = win_percentage;
    }

    public Double getAttendance_percentage() {
        return attendance_percentage;
    }

    public void setAttendance_percentage(Double attendance_percentage) {
        this.attendance_percentage = attendance_percentage;
    }
}
