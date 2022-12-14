package com.example.weathapp.db;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    @Column(unique = true)
    private int id;
    @Column(index = true)
    private String provinceName;
    @Column(index = true)
    private int provinceCode;

    public Province(){}

    public Province(int provinceCode,String provinceName){
        this.provinceCode = provinceCode;
        this.provinceName = provinceName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
