package com.example.capstona_a.data;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Style implements Serializable {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("selections")
    @Expose
    private List<Selection> selections = null;
    @SerializedName("style")
    @Expose
    private long style;
    private final static long serialVersionUID = 9152746451271348396L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Style withDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public Style withSelections(List<Selection> selections) {
        this.selections = selections;
        return this;
    }

    public long getStyle() {
        return style;
    }

    public void setStyle(long style) {
        this.style = style;
    }

    public Style withStyle(long style) {
        this.style = style;
        return this;
    }
}
