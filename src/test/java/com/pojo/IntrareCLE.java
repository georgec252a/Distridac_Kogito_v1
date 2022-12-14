package com.pojo;
//        intrareCLE.put("marcaSofer", "12345678");
//                intrareCLE.put("vin", "12345678901234567");

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntrareCLE {

    private String marcaSofer;
    private String vin;
    private String culoare;
    private String stare;
    private String tara ;
    private String neafectat;
    private String plata;
    private boolean plataOK;
    private String contDestinatar;
    private boolean contDestinatarOK;
    private boolean compoundFull;
    private String stocareCompound;

    private String compoundOcupat;

    private boolean stocareCLE;
    private boolean vinValid;
    private boolean soferValid;
    private boolean vinok;

    public IntrareCLE() {
    }

    public IntrareCLE(String marcaSofer, String vin) {
        this.marcaSofer = marcaSofer;
        this.vin = vin;
    }

    public String getMarcaSofer() {
        return marcaSofer;
    }

    public void setMarcaSofer(String marcaSofer) {
        this.marcaSofer = marcaSofer;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getNeafectat() {
        return neafectat;
    }

    public void setNeafectat(String neafectat) {
        this.neafectat = neafectat;
    }

    public String getPlata() {
        return plata;
    }

    public void setPlata(String plata) {
        this.plata = plata;
    }

    public boolean isPlataOK() {
        return plataOK;
    }

    public void setPlataOK(boolean plataOK) {
        this.plataOK = plataOK;
    }

    public String getContDestinatar() {
        return contDestinatar;
    }

    public void setContDestinatar(String contDestinatar) {
        this.contDestinatar = contDestinatar;
    }

    public boolean isContDestinatarOK() {
        return contDestinatarOK;
    }

    public void setContDestinatarOK(boolean contDestinatarOK) {
        this.contDestinatarOK = contDestinatarOK;
    }

    public boolean isCompoundFull() {
        return compoundFull;
    }

    public void setCompoundFull(boolean compoundFull) {
        this.compoundFull = compoundFull;
    }

    public String getStocareCompound() {
        return stocareCompound;
    }

    public void setStocareCompound(String stocareCompound) {
        this.stocareCompound = stocareCompound;
    }

    public String getCompoundOcupat() {
        return compoundOcupat;
    }

    public void setCompoundOcupat(String compoundOcupat) {
        this.compoundOcupat = compoundOcupat;
    }

    public boolean isStocareCLE() {
        return stocareCLE;
    }

    public void setStocareCLE(boolean stocareCLE) {
        this.stocareCLE = stocareCLE;
    }

    public boolean isVinValid() {
        return vinValid;
    }

    public void setVinValid(boolean vinValid) {
        this.vinValid = vinValid;
    }

    public boolean isSoferValid() {
        return soferValid;
    }

    public void setSoferValid(boolean soferValid) {
        this.soferValid = soferValid;
    }

    public boolean isVinok() {
        return vinok;
    }

    public void setVinok(boolean vinok) {
        this.vinok = vinok;
    }

    @Override
    public String toString() {
        return "IntrareCLE{" +
                "marcaSofer='" + marcaSofer + '\'' +
                ", vin='" + vin + '\'' +
                ", culoare='" + culoare + '\'' +
                ", stare='" + stare + '\'' +
                ", tara='" + tara + '\'' +
                ", neafectat='" + neafectat + '\'' +
                ", plata='" + plata + '\'' +
                ", plataOK=" + plataOK +
                ", contDestinatar='" + contDestinatar + '\'' +
                ", contDestinatarOK=" + contDestinatarOK +
                ", compoundFull=" + compoundFull +
                ", stocareCompound='" + stocareCompound + '\'' +
                ", compoundOcupat='" + compoundOcupat + '\'' +
                ", stocareCLE=" + stocareCLE +
                ", vinValid=" + vinValid +
                ", soferValid=" + soferValid +
                ", vinok=" + vinok +
                '}';
    }
}
