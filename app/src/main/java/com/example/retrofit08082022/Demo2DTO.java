package com.example.retrofit08082022;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Demo2DTO {

    @SerializedName("danhsach")
    @Expose
    private List<Danhsach> danhSach = null;

    public List<Danhsach> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(List<Danhsach> danhSach) {
        this.danhSach = danhSach;
    }
   
}