/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.travels;

public class IntrareCLE {

    private int VIN;
    private boolean VINok;

    private boolean neafectat;

    private int plata;
    private boolean plataOK;

    private String contDestinatar;
    private boolean contDestinatarOK;

    // stocare ca serviciu - info tb obtinuta 
    private int compoundOcupat;
    private boolean compoundFull;

    private boolean stocareCompound;
    private boolean stocareCLE;

    public IntrareCLE() {

    }

    public IntrareCLE(int vIN, boolean vINok, boolean neafectat, int plata, boolean plataOK, String contDestinatar,
            boolean contDestinatarOK, int compoundOcupat, boolean compoundFull, boolean stocareCompound,
            boolean stocareCLE) {
        VIN = vIN;
        VINok = vINok;
        this.neafectat = neafectat;
        this.plata = plata;
        this.plataOK = plataOK;
        this.contDestinatar = contDestinatar;
        this.contDestinatarOK = contDestinatarOK;
        this.compoundOcupat = compoundOcupat;
        this.compoundFull = compoundFull;
        this.stocareCompound = stocareCompound;
        this.stocareCLE = stocareCLE;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int vIN) {
        VIN = vIN;
    }

    public boolean isNeafectat() {
        return neafectat;
    }

    public void setNeafectat(boolean neafectat) {
        this.neafectat = neafectat;
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

    public boolean isCompoundFull() {
        return compoundFull;
    }

    public void setCompoundFull(boolean compoundFull) {
        this.compoundFull = compoundFull;
    }

    public boolean isStocareCompound() {
        return stocareCompound;
    }

    public void setStocareCompound(boolean stocareCompound) {
        this.stocareCompound = stocareCompound;
    }

    public boolean isStocareCLE() {
        return stocareCLE;
    }

    public void setStocareCLE(boolean stocareCLE) {
        this.stocareCLE = stocareCLE;
    }

    public boolean isVINok() {
        return VINok;
    }

    public void setVINok(boolean vINok) {
        VINok = vINok;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        return "IntrareCLE [VIN=" + VIN + ", VINok=" + VINok + ", neafectat=" + neafectat + ", plata=" + plata
                + ", plataOK=" + plataOK + ", contDestinatar=" + contDestinatar + ", contDestinatarOK="
                + contDestinatarOK + ", compoundOcupat=" + compoundOcupat + ", compoundFull=" + compoundFull
                + ", stocareCompound=" + stocareCompound + ", stocareCLE=" + stocareCLE + "]";
    }

    public boolean isContDestinatarOK() {
        return contDestinatarOK;
    }

    public void setContDestinatarOK(boolean contDestinatarOK) {
        this.contDestinatarOK = contDestinatarOK;
    }

    public int getCompoundOcupat() {
        return compoundOcupat;
    }

    public void setCompoundOcupat(int compoundOcupat) {
        this.compoundOcupat = compoundOcupat;
    }

}
