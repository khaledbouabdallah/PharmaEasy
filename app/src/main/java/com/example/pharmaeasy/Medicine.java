package com.example.pharmaeasy;

import android.annotation.SuppressLint;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity(tableName =  "Medicines")
public class Medicine {
    @PrimaryKey
    private  int MedId;
    private  String  MedName;
    private String Labo ;
    @ColumnInfo(name = "Presentation ")
    private  float Pres;
    private float CI;
    private float CMin ;
    private float CMax;
    private float Price;
    private  float remainder ;
    private  Date remainderDate;

    public int getMedId() {
        return MedId;
    }

    public void setMedId(int medId) {
        MedId = medId;
    }

    public String getMedName() {
        return MedName;
    }

    public void setMedName(String medName) {
        MedName = medName;
    }

    public String getLabo() {
        return Labo;
    }

    public void setLabo(String labo) {
        Labo = labo;
    }

    public float getPres() {
        return Pres;
    }

    public void setPres(float pres) {
        Pres = pres;
    }

    public float getCI() {
        return CI;
    }

    public void setCI(float CI) {
        this.CI = CI;
    }

    public float getCMin() {
        return CMin;
    }

    public void setCMin(float CMin) {
        this.CMin = CMin;
    }

    public float getCMax() {
        return CMax;
    }

    public void setCMax(float CMax) {
        this.CMax = CMax;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public float getRemainder() {
        return remainder;
    }

    public void setRemainder(float remainder) {
        this.remainder = remainder;
    }

    public Date getRemainderDate() {
        return remainderDate;
    }

    public void setRemainderDate(Date remainderDate) {
        this.remainderDate = remainderDate;
    }
}


