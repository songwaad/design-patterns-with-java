package org.example.implementation;

public class Emirates implements Sponsor {

    private String slogan;
    private String benefits;

    public Emirates(String slogan, String benefits) {
        this.slogan = slogan;
        this.benefits = benefits;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    @Override
    public String getName() {
        return "Emirates";
    }

    @Override
    public String getSlogan() {
        return slogan;
    }

    @Override
    public String getBenefits() {
        return benefits;
    }
}
