package com.example.capstona_a.data;
import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CMatchV5 implements Serializable
{

    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("info")
    @Expose
    private Info info;
    private int playernum;
    public String getUsername() {
        return Username;
    }

    public int getPlayernum() {
        return playernum;
    }

    public void setPlayernum(int playernum) {
        this.playernum = playernum;
    }

    public void setUsername(String username) {
        Username = username;
    }

    private String Username;
    private final static long serialVersionUID = -3056699362254295135L;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public CMatchV5 withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public CMatchV5 withInfo(Info info) {
        this.info = info;
        return this;
    }

    public void activateplayerNum(){
        String name=this.getUsername();
        for(int i=0;i<10; i++){
            if(this.getInfo().getParticipants().get(i).getSummonerName().equals(name))
            {
                this.playernum=i;
            }

        }


    }



}