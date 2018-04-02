package com.jackchen.erizlizable.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Email: 2185134304@qq.com
 * Created by JackChen 2018/4/2 15:40
 * Version 1.0
 * Params:
 * Description:
*/

public class Police implements Parcelable {

    private String name;
    private int workTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public static final Parcelable.Creator<Police> CREATOR = new Parcelable.Creator<Police>() {

        @Override
        public Police createFromParcel(Parcel source) {
            Police police = new Police();
            police.name = source.readString();
            police.workTime = source.readInt();
            return police;
        }

        @Override
        public Police[] newArray(int size) {
            return new Police[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(name);
        parcel.writeInt(workTime);
    }
}