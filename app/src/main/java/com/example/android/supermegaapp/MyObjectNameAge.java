package com.example.android.supermegaapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class MyObjectNameAge implements Parcelable{
    public String lastName,name;
    public int age;
    public  MyObjectNameAge(String _lastName, String _name, int _age){
        Log.d("MyObjectNameAge",_lastName+_name+_age);
        lastName=_lastName;
        age=_age;
        name=_name;

    }
    public  MyObjectNameAge(Parcel parcel){
        lastName=parcel.readString();
        name=parcel.readString();
        age=parcel.readInt();



    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel parcel,int flags){
        Log.d("MyObject","write to parcel");
        parcel.writeString(lastName);
        parcel.writeString(name);
        parcel.writeInt(age);

    }
    public static final Parcelable.Creator<MyObjectNameAge> CREATOR = new Parcelable.Creator<MyObjectNameAge>() {
        @Override
        public MyObjectNameAge createFromParcel(Parcel in) {
            return new MyObjectNameAge(in);
        }
        @Override
        public MyObjectNameAge[] newArray(int size) {
            return new MyObjectNameAge[size];
        }
    };
    public static Creator<MyObjectNameAge> getCREATOR() {
        return CREATOR;
    }
}
