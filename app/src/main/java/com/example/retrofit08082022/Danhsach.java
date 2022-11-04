package com.example.retrofit08082022;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tichhv on 11/4/2022.
 **/
public class Danhsach {
    @SerializedName("khoahoc")
    @Expose
    private String khoaHoc;

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
}
