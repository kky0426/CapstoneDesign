package com.example.capstona_a;

import android.app.Application;
import android.content.pm.ApplicationInfo;

import java.util.ArrayList;
import java.util.List;

public class CMatchData_a extends Application {
    private ArrayList<CMatch> CMatchlist = null;

    public ArrayList<CMatch> getCMatchlist() {
        return CMatchlist;
    }

    public void setCMatchlist(ArrayList<CMatch> CMatchlist) {
        this.CMatchlist = CMatchlist;
    }
}
