package com.example.capstona_a.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CObservers implements Serializable {
    @SerializedName("encryptionKey")
    @Expose
    private String encryptionKey;
    private final static long serialVersionUID = -8645702162523884694L;

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public CObservers withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
}
