package com.telran.prof.lesson.lessoneighteen;

import java.util.Calendar;

public class Match {
    private Calendar date;

    private String teamOne;

    private String teamTwo;

    private String result;

    private int watchers;

    private String staduim;

    public Match(Calendar date, String teamOne, String teamTwo, String result, int watchers, String staduim) {
        this.date = date;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.result = result;
        this.watchers = watchers;
        this.staduim = staduim;
    }

    public Calendar getDate() {
        return date;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public String getResult() {
        return result;
    }

    public int getWatchers() {
        return watchers;
    }

    public String getStaduim() {
        return staduim;
    }

    @Override
    public String toString() {
        return "Match{" +
                "date=" + date.get(Calendar.YEAR) +
                "-" + date.get(Calendar.MONTH) +
                "-" +date.get(Calendar.DATE) +
                ", teamOne='" + teamOne + '\'' +
                ", teamTwo='" + teamTwo + '\'' +
                ", result='" + result + '\'' +
                ", watchers=" + watchers +
                ", stadium='" + staduim + '\'' +
                '}';
    }
}
