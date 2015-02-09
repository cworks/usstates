package net.cworks.usstates;

import java.util.Date;

public class State {

    private String name;
    private String isoCode;
    private String ansiCode;
    private Integer ansiNumber;
    private String usps;
    private String uscg;
    private String[] others;

    private String capital;
    private Date admissionDate;
    private Integer admissionRank;
    private String motto;
    private String nickname;

    State() {

    }

    public String getName() {
        return name;
    }

    public String[] getOthers() {
        return others;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public String getAnsiCode() {
        return ansiCode;
    }

    public Integer getAnsiNumber() {
        return ansiNumber;
    }

    public String getUsps() {
        return usps;
    }

    public String getUscg() {
        return uscg;
    }

    public String getMotto() {
        return motto;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCapital() {
        return capital;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public Integer getAdmissionRank() {
        return admissionRank;
    }

    State name(String name) {
        this.name = name;
        return this;
    }

    State isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    State ansiCode(String ansiCode) {
        this.ansiCode = ansiCode;
        return this;
    }

    State ansiNumber(Integer ansiNumber) {
        this.ansiNumber = ansiNumber;
        return this;
    }

    State usps(String usps) {
        this.usps = usps;
        return this;
    }

    State uscg(String uscg) {
        this.uscg = uscg;
        return this;
    }

    State others(String...others) {
        this.others = others;
        return this;
    }

    State motto(String motto) {
        this.motto = motto;
        return this;
    }

    State nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    State capital(String capital) {
        this.capital = capital;
        return this;
    }

    State admissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
        return this;
    }

    State admissionRank(Integer admissionRank) {
        this.admissionRank = admissionRank;
        return this;
    }

    public String toString() {
        return "[ name: " + this.name + "," +
                "isoCode: " + this.isoCode + "," +
                "ansiCode: " + this.ansiCode + "," +
                "ansiNumber: " + this.ansiNumber + "," +
                "usps: " + this.usps + "," +
                "uscg: " + this.uscg + "," +
                "others: " + this.others + "," +
                "capital: " + this.capital + "," +
                "admissionDate: " + this.admissionDate + "," +
                "admissionRank: " + this.admissionRank + "," +
                "motto: " + this.motto + ", " +
                "nickname: " + this.nickname + "]";

    }

}
