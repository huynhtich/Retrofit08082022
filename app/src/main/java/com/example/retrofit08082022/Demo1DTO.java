package com.example.retrofit08082022;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tichhv on 11/4/2022.
 **/
public class Demo1DTO {
    @SerializedName("monhoc")
    @Expose
    private String monHoc;

    @SerializedName("noihoc")
    @Expose
    private String noiHoc;

    private String website;

    @SerializedName("fanpage")
    @Expose
    private String fanPage;

    private String logo;

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getNoiHoc() {
        return noiHoc;
    }

    public void setNoiHoc(String noiHoc) {
        this.noiHoc = noiHoc;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFanPage() {
        return fanPage;
    }

    public void setFanPage(String fanPage) {
        this.fanPage = fanPage;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Demo1DTO{" +
                "monHoc='" + monHoc + '\'' +
                ", noiHoc='" + noiHoc + '\'' +
                ", website='" + website + '\'' +
                ", fanPage='" + fanPage + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
