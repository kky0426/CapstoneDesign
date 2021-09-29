package com.example.capstona_a.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
/* {
    "id": "RfMTzYCQNktLvXVIyMWg9DsAjwajwwpXVL9h8Nao2wUfFfk",
    "accountId": "iFAK9w4SzkTCpdvRwTf5aEbCTVCci8BCy5Y2iu9swTl1QZCuFmjtU8q-",
    "puuid": "wyJ1Evp59ureSIMWjt5flBQkxBWBKopVrex1BVLR5o1hX6L9FtR_eqHUhPrBB80N_eju6Yu0bxKK_w",
    "name": "글썽글썽태윤",
    "profileIconId": 6,
    "revisionDate": 1632805380000,
    "summonerLevel": 178
}
 */
public class CUserDTO implements Serializable {
    @Expose
    @SerializedName("id")
    private String id;
    @Expose
    @SerializedName("accountId")
    private String accountId;
    @Expose
    @SerializedName("puuid")
    private String puuid;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("profileIconId")
    private int profileIconId;
    @Expose
    @SerializedName("revisionDate")
    private long revisionDate;
    @Expose
    @SerializedName("summonerLevel")
    private long summonerLevel;


    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
