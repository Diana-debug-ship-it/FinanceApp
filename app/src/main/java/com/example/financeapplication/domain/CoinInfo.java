package com.example.financeapplication.domain;

import java.util.Objects;

public class CoinInfo {
    private String price;
    private String lowDay;
    private String highDay;
    private String market;
    private Long lastUpdate;
    private String fromSymbol;
    private String toSymbol;
    private String imageUrl;

    public CoinInfo(String price,
                    String lowDay,
                    String highDay,
                    String market,
                    Long lastUpdate,
                    String fromSymbol,
                    String toSymbol,
                    String imageUrl) {
        this.price = price;
        this.lowDay = lowDay;
        this.highDay = highDay;
        this.market = market;
        this.lastUpdate = lastUpdate;
        this.fromSymbol = fromSymbol;
        this.toSymbol = toSymbol;
        this.imageUrl = imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLowDay() {
        return lowDay;
    }

    public void setLowDay(String lowDay) {
        this.lowDay = lowDay;
    }

    public String getHighDay() {
        return highDay;
    }

    public void setHighDay(String highDay) {
        this.highDay = highDay;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public Long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getFromSymbol() {
        return fromSymbol;
    }

    public void setFromSymbol(String fromSymbol) {
        this.fromSymbol = fromSymbol;
    }

    public String getToSymbol() {
        return toSymbol;
    }

    public void setToSymbol(String toSymbol) {
        this.toSymbol = toSymbol;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoinInfo coinInfo = (CoinInfo) o;
        return Objects.equals(price, coinInfo.price) && Objects.equals(lowDay, coinInfo.lowDay) && Objects.equals(highDay, coinInfo.highDay) && Objects.equals(market, coinInfo.market) && Objects.equals(lastUpdate, coinInfo.lastUpdate) && Objects.equals(fromSymbol, coinInfo.fromSymbol) && Objects.equals(toSymbol, coinInfo.toSymbol) && Objects.equals(imageUrl, coinInfo.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, lowDay, highDay, market, lastUpdate, fromSymbol, toSymbol, imageUrl);
    }

    @Override
    public String toString() {
        return "CoinInfo{" +
                "price='" + price + '\'' +
                ", lowDay='" + lowDay + '\'' +
                ", highDay='" + highDay + '\'' +
                ", market='" + market + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", fromSymbol='" + fromSymbol + '\'' +
                ", toSymbol='" + toSymbol + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
