package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CStats implements Serializable {
    @SerializedName("participantId")
    @Expose
    private Long participantId;
    @SerializedName("win")
    @Expose
    private Boolean win;
    @SerializedName("item0")
    @Expose
    private Long item0;
    @SerializedName("item1")
    @Expose
    private Long item1;
    @SerializedName("item2")
    @Expose
    private Long item2;
    @SerializedName("item3")
    @Expose
    private Long item3;
    @SerializedName("item4")
    @Expose
    private Long item4;
    @SerializedName("item5")
    @Expose
    private Long item5;
    @SerializedName("item6")
    @Expose
    private Long item6;
    @SerializedName("kills")
    @Expose
    private Long kills;
    @SerializedName("deaths")
    @Expose
    private Long deaths;
    @SerializedName("assists")
    @Expose
    private Long assists;
    @SerializedName("largestKillingSpree")
    @Expose
    private Long largestKillingSpree;
    @SerializedName("largestMultiKill")
    @Expose
    private Long largestMultiKill;
    @SerializedName("killingSprees")
    @Expose
    private Long killingSprees;
    @SerializedName("longestTimeSpentLiving")
    @Expose
    private Long longestTimeSpentLiving;
    @SerializedName("doubleKills")
    @Expose
    private Long doubleKills;
    @SerializedName("tripleKills")
    @Expose
    private Long tripleKills;
    @SerializedName("quadraKills")
    @Expose
    private Long quadraKills;
    @SerializedName("pentaKills")
    @Expose
    private Long pentaKills;
    @SerializedName("unrealKills")
    @Expose
    private Long unrealKills;
    @SerializedName("totalDamageDealt")
    @Expose
    private Long totalDamageDealt;
    @SerializedName("magicDamageDealt")
    @Expose
    private Long magicDamageDealt;
    @SerializedName("physicalDamageDealt")
    @Expose
    private Long physicalDamageDealt;
    @SerializedName("trueDamageDealt")
    @Expose
    private Long trueDamageDealt;
    @SerializedName("largestCriticalStrike")
    @Expose
    private Long largestCriticalStrike;
    @SerializedName("totalDamageDealtToChampions")
    @Expose
    private Long totalDamageDealtToChampions;
    @SerializedName("magicDamageDealtToChampions")
    @Expose
    private Long magicDamageDealtToChampions;
    @SerializedName("physicalDamageDealtToChampions")
    @Expose
    private Long physicalDamageDealtToChampions;
    @SerializedName("trueDamageDealtToChampions")
    @Expose
    private Long trueDamageDealtToChampions;
    @SerializedName("totalHeal")
    @Expose
    private Long totalHeal;
    @SerializedName("totalUnitsHealed")
    @Expose
    private Long totalUnitsHealed;
    @SerializedName("damageSelfMitigated")
    @Expose
    private Long damageSelfMitigated;
    @SerializedName("damageDealtToObjectives")
    @Expose
    private Long damageDealtToObjectives;
    @SerializedName("damageDealtToTurrets")
    @Expose
    private Long damageDealtToTurrets;
    @SerializedName("visionScore")
    @Expose
    private Long visionScore;
    @SerializedName("timeCCingOthers")
    @Expose
    private Long timeCCingOthers;
    @SerializedName("totalDamageTaken")
    @Expose
    private Long totalDamageTaken;
    @SerializedName("magicalDamageTaken")
    @Expose
    private Long magicalDamageTaken;
    @SerializedName("physicalDamageTaken")
    @Expose
    private Long physicalDamageTaken;
    @SerializedName("trueDamageTaken")
    @Expose
    private Long trueDamageTaken;
    @SerializedName("goldEarned")
    @Expose
    private Long goldEarned;
    @SerializedName("goldSpent")
    @Expose
    private Long goldSpent;
    @SerializedName("turretKills")
    @Expose
    private Long turretKills;
    @SerializedName("inhibitorKills")
    @Expose
    private Long inhibitorKills;
    @SerializedName("totalMinionsKilled")
    @Expose
    private Long totalMinionsKilled;
    @SerializedName("neutralMinionsKilled")
    @Expose
    private Long neutralMinionsKilled;
    @SerializedName("totalTimeCrowdControlDealt")
    @Expose
    private Long totalTimeCrowdControlDealt;
    @SerializedName("champLevel")
    @Expose
    private Long champLevel;
    @SerializedName("visionWardsBoughtInGame")
    @Expose
    private Long visionWardsBoughtInGame;
    @SerializedName("sightWardsBoughtInGame")
    @Expose
    private Long sightWardsBoughtInGame;
    @SerializedName("firstBloodKill")
    @Expose
    private Boolean firstBloodKill;
    @SerializedName("firstBloodAssist")
    @Expose
    private Boolean firstBloodAssist;
    @SerializedName("firstTowerKill")
    @Expose
    private Boolean firstTowerKill;
    @SerializedName("firstTowerAssist")
    @Expose
    private Boolean firstTowerAssist;
    @SerializedName("firstInhibitorKill")
    @Expose
    private Boolean firstInhibitorKill;
    @SerializedName("firstInhibitorAssist")
    @Expose
    private Boolean firstInhibitorAssist;
    @SerializedName("combatPlayerScore")
    @Expose
    private Long combatPlayerScore;
    @SerializedName("objectivePlayerScore")
    @Expose
    private Long objectivePlayerScore;
    @SerializedName("totalPlayerScore")
    @Expose
    private Long totalPlayerScore;
    @SerializedName("totalScoreRank")
    @Expose
    private Long totalScoreRank;
    @SerializedName("playerScore0")
    @Expose
    private Long playerScore0;
    @SerializedName("playerScore1")
    @Expose
    private Long playerScore1;
    @SerializedName("playerScore2")
    @Expose
    private Long playerScore2;
    @SerializedName("playerScore3")
    @Expose
    private Long playerScore3;
    @SerializedName("playerScore4")
    @Expose
    private Long playerScore4;
    @SerializedName("playerScore5")
    @Expose
    private Long playerScore5;
    @SerializedName("playerScore6")
    @Expose
    private Long playerScore6;
    @SerializedName("playerScore7")
    @Expose
    private Long playerScore7;
    @SerializedName("playerScore8")
    @Expose
    private Long playerScore8;
    @SerializedName("playerScore9")
    @Expose
    private Long playerScore9;
    @SerializedName("perk0")
    @Expose
    private Long perk0;
    @SerializedName("perk0Var1")
    @Expose
    private Long perk0Var1;
    @SerializedName("perk0Var2")
    @Expose
    private Long perk0Var2;
    @SerializedName("perk0Var3")
    @Expose
    private Long perk0Var3;
    @SerializedName("perk1")
    @Expose
    private Long perk1;
    @SerializedName("perk1Var1")
    @Expose
    private Long perk1Var1;
    @SerializedName("perk1Var2")
    @Expose
    private Long perk1Var2;
    @SerializedName("perk1Var3")
    @Expose
    private Long perk1Var3;
    @SerializedName("perk2")
    @Expose
    private Long perk2;
    @SerializedName("perk2Var1")
    @Expose
    private Long perk2Var1;
    @SerializedName("perk2Var2")
    @Expose
    private Long perk2Var2;
    @SerializedName("perk2Var3")
    @Expose
    private Long perk2Var3;
    @SerializedName("perk3")
    @Expose
    private Long perk3;
    @SerializedName("perk3Var1")
    @Expose
    private Long perk3Var1;
    @SerializedName("perk3Var2")
    @Expose
    private Long perk3Var2;
    @SerializedName("perk3Var3")
    @Expose
    private Long perk3Var3;
    @SerializedName("perk4")
    @Expose
    private Long perk4;
    @SerializedName("perk4Var1")
    @Expose
    private Long perk4Var1;
    @SerializedName("perk4Var2")
    @Expose
    private Long perk4Var2;
    @SerializedName("perk4Var3")
    @Expose
    private Long perk4Var3;
    @SerializedName("perk5")
    @Expose
    private Long perk5;
    @SerializedName("perk5Var1")
    @Expose
    private Long perk5Var1;
    @SerializedName("perk5Var2")
    @Expose
    private Long perk5Var2;
    @SerializedName("perk5Var3")
    @Expose
    private Long perk5Var3;
    @SerializedName("perkPrimaryStyle")
    @Expose
    private Long perkPrimaryStyle;
    @SerializedName("perkSubStyle")
    @Expose
    private Long perkSubStyle;
    @SerializedName("statPerk0")
    @Expose
    private Long statPerk0;
    @SerializedName("statPerk1")
    @Expose
    private Long statPerk1;
    @SerializedName("statPerk2")
    @Expose
    private Long statPerk2;
    private final static long serialVersionUID = 5286757990676758083L;

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public CStats withParticipantId(Long participantId) {
        this.participantId = participantId;
        return this;
    }

    public Boolean getWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

    public CStats withWin(Boolean win) {
        this.win = win;
        return this;
    }

    public Long getItem0() {
        return item0;
    }

    public void setItem0(Long item0) {
        this.item0 = item0;
    }

    public CStats withItem0(Long item0) {
        this.item0 = item0;
        return this;
    }

    public Long getItem1() {
        return item1;
    }

    public void setItem1(Long item1) {
        this.item1 = item1;
    }

    public CStats withItem1(Long item1) {
        this.item1 = item1;
        return this;
    }

    public Long getItem2() {
        return item2;
    }

    public void setItem2(Long item2) {
        this.item2 = item2;
    }

    public CStats withItem2(Long item2) {
        this.item2 = item2;
        return this;
    }

    public Long getItem3() {
        return item3;
    }

    public void setItem3(Long item3) {
        this.item3 = item3;
    }

    public CStats withItem3(Long item3) {
        this.item3 = item3;
        return this;
    }

    public Long getItem4() {
        return item4;
    }

    public void setItem4(Long item4) {
        this.item4 = item4;
    }

    public CStats withItem4(Long item4) {
        this.item4 = item4;
        return this;
    }

    public Long getItem5() {
        return item5;
    }

    public void setItem5(Long item5) {
        this.item5 = item5;
    }

    public CStats withItem5(Long item5) {
        this.item5 = item5;
        return this;
    }

    public Long getItem6() {
        return item6;
    }

    public void setItem6(Long item6) {
        this.item6 = item6;
    }

    public CStats withItem6(Long item6) {
        this.item6 = item6;
        return this;
    }

    public Long getKills() {
        return kills;
    }

    public void setKills(Long kills) {
        this.kills = kills;
    }

    public CStats withKills(Long kills) {
        this.kills = kills;
        return this;
    }

    public Long getDeaths() {
        return deaths;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public CStats withDeaths(Long deaths) {
        this.deaths = deaths;
        return this;
    }

    public Long getAssists() {
        return assists;
    }

    public void setAssists(Long assists) {
        this.assists = assists;
    }

    public CStats withAssists(Long assists) {
        this.assists = assists;
        return this;
    }

    public Long getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(Long largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public CStats withLargestKillingSpree(Long largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
        return this;
    }

    public Long getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(Long largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public CStats withLargestMultiKill(Long largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
        return this;
    }

    public Long getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(Long killingSprees) {
        this.killingSprees = killingSprees;
    }

    public CStats withKillingSprees(Long killingSprees) {
        this.killingSprees = killingSprees;
        return this;
    }

    public Long getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    public void setLongestTimeSpentLiving(Long longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
    }

    public CStats withLongestTimeSpentLiving(Long longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
        return this;
    }

    public Long getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(Long doubleKills) {
        this.doubleKills = doubleKills;
    }

    public CStats withDoubleKills(Long doubleKills) {
        this.doubleKills = doubleKills;
        return this;
    }

    public Long getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(Long tripleKills) {
        this.tripleKills = tripleKills;
    }

    public CStats withTripleKills(Long tripleKills) {
        this.tripleKills = tripleKills;
        return this;
    }

    public Long getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(Long quadraKills) {
        this.quadraKills = quadraKills;
    }

    public CStats withQuadraKills(Long quadraKills) {
        this.quadraKills = quadraKills;
        return this;
    }

    public Long getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(Long pentaKills) {
        this.pentaKills = pentaKills;
    }

    public CStats withPentaKills(Long pentaKills) {
        this.pentaKills = pentaKills;
        return this;
    }

    public Long getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(Long unrealKills) {
        this.unrealKills = unrealKills;
    }

    public CStats withUnrealKills(Long unrealKills) {
        this.unrealKills = unrealKills;
        return this;
    }

    public Long getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(Long totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public CStats withTotalDamageDealt(Long totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
        return this;
    }

    public Long getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(Long magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public CStats withMagicDamageDealt(Long magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
        return this;
    }

    public Long getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(Long physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public CStats withPhysicalDamageDealt(Long physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
        return this;
    }

    public Long getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(Long trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public CStats withTrueDamageDealt(Long trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
        return this;
    }

    public Long getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(Long largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public CStats withLargestCriticalStrike(Long largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
        return this;
    }

    public Long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(Long totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public CStats withTotalDamageDealtToChampions(Long totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
        return this;
    }

    public Long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(Long magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public CStats withMagicDamageDealtToChampions(Long magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
        return this;
    }

    public Long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(Long physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public CStats withPhysicalDamageDealtToChampions(Long physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
        return this;
    }

    public Long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(Long trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public CStats withTrueDamageDealtToChampions(Long trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
        return this;
    }

    public Long getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(Long totalHeal) {
        this.totalHeal = totalHeal;
    }

    public CStats withTotalHeal(Long totalHeal) {
        this.totalHeal = totalHeal;
        return this;
    }

    public Long getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(Long totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public CStats withTotalUnitsHealed(Long totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
        return this;
    }

    public Long getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    public void setDamageSelfMitigated(Long damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    public CStats withDamageSelfMitigated(Long damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
        return this;
    }

    public Long getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    public void setDamageDealtToObjectives(Long damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    public CStats withDamageDealtToObjectives(Long damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
        return this;
    }

    public Long getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    public void setDamageDealtToTurrets(Long damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    public CStats withDamageDealtToTurrets(Long damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
        return this;
    }

    public Long getVisionScore() {
        return visionScore;
    }

    public void setVisionScore(Long visionScore) {
        this.visionScore = visionScore;
    }

    public CStats withVisionScore(Long visionScore) {
        this.visionScore = visionScore;
        return this;
    }

    public Long getTimeCCingOthers() {
        return timeCCingOthers;
    }

    public void setTimeCCingOthers(Long timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    public CStats withTimeCCingOthers(Long timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
        return this;
    }

    public Long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(Long totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public CStats withTotalDamageTaken(Long totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
        return this;
    }

    public Long getMagicalDamageTaken() {
        return magicalDamageTaken;
    }

    public void setMagicalDamageTaken(Long magicalDamageTaken) {
        this.magicalDamageTaken = magicalDamageTaken;
    }

    public CStats withMagicalDamageTaken(Long magicalDamageTaken) {
        this.magicalDamageTaken = magicalDamageTaken;
        return this;
    }

    public Long getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Long physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public CStats withPhysicalDamageTaken(Long physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
        return this;
    }

    public Long getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(Long trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public CStats withTrueDamageTaken(Long trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
        return this;
    }

    public Long getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(Long goldEarned) {
        this.goldEarned = goldEarned;
    }

    public CStats withGoldEarned(Long goldEarned) {
        this.goldEarned = goldEarned;
        return this;
    }

    public Long getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(Long goldSpent) {
        this.goldSpent = goldSpent;
    }

    public CStats withGoldSpent(Long goldSpent) {
        this.goldSpent = goldSpent;
        return this;
    }

    public Long getTurretKills() {
        return turretKills;
    }

    public void setTurretKills(Long turretKills) {
        this.turretKills = turretKills;
    }

    public CStats withTurretKills(Long turretKills) {
        this.turretKills = turretKills;
        return this;
    }

    public Long getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(Long inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public CStats withInhibitorKills(Long inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
        return this;
    }

    public Long getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    public void setTotalMinionsKilled(Long totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    public CStats withTotalMinionsKilled(Long totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
        return this;
    }

    public Long getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(Long neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public CStats withNeutralMinionsKilled(Long neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
        return this;
    }

    public Long getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public void setTotalTimeCrowdControlDealt(Long totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    public CStats withTotalTimeCrowdControlDealt(Long totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
        return this;
    }

    public Long getChampLevel() {
        return champLevel;
    }

    public void setChampLevel(Long champLevel) {
        this.champLevel = champLevel;
    }

    public CStats withChampLevel(Long champLevel) {
        this.champLevel = champLevel;
        return this;
    }

    public Long getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(Long visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public CStats withVisionWardsBoughtInGame(Long visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
        return this;
    }

    public Long getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(Long sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public CStats withSightWardsBoughtInGame(Long sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
        return this;
    }

    public Boolean getFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(Boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public CStats withFirstBloodKill(Boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
        return this;
    }

    public Boolean getFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(Boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public CStats withFirstBloodAssist(Boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
        return this;
    }

    public Boolean getFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(Boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public CStats withFirstTowerKill(Boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
        return this;
    }

    public Boolean getFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(Boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public CStats withFirstTowerAssist(Boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
        return this;
    }

    public Boolean getFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    public void setFirstInhibitorKill(Boolean firstInhibitorKill) {
        this.firstInhibitorKill = firstInhibitorKill;
    }

    public CStats withFirstInhibitorKill(Boolean firstInhibitorKill) {
        this.firstInhibitorKill = firstInhibitorKill;
        return this;
    }

    public Boolean getFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    public void setFirstInhibitorAssist(Boolean firstInhibitorAssist) {
        this.firstInhibitorAssist = firstInhibitorAssist;
    }

    public CStats withFirstInhibitorAssist(Boolean firstInhibitorAssist) {
        this.firstInhibitorAssist = firstInhibitorAssist;
        return this;
    }

    public Long getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public void setCombatPlayerScore(Long combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }

    public CStats withCombatPlayerScore(Long combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
        return this;
    }

    public Long getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public void setObjectivePlayerScore(Long objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    public CStats withObjectivePlayerScore(Long objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
        return this;
    }

    public Long getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public void setTotalPlayerScore(Long totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    public CStats withTotalPlayerScore(Long totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
        return this;
    }

    public Long getTotalScoreRank() {
        return totalScoreRank;
    }

    public void setTotalScoreRank(Long totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    public CStats withTotalScoreRank(Long totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
        return this;
    }

    public Long getPlayerScore0() {
        return playerScore0;
    }

    public void setPlayerScore0(Long playerScore0) {
        this.playerScore0 = playerScore0;
    }

    public CStats withPlayerScore0(Long playerScore0) {
        this.playerScore0 = playerScore0;
        return this;
    }

    public Long getPlayerScore1() {
        return playerScore1;
    }

    public void setPlayerScore1(Long playerScore1) {
        this.playerScore1 = playerScore1;
    }

    public CStats withPlayerScore1(Long playerScore1) {
        this.playerScore1 = playerScore1;
        return this;
    }

    public Long getPlayerScore2() {
        return playerScore2;
    }

    public void setPlayerScore2(Long playerScore2) {
        this.playerScore2 = playerScore2;
    }

    public CStats withPlayerScore2(Long playerScore2) {
        this.playerScore2 = playerScore2;
        return this;
    }

    public Long getPlayerScore3() {
        return playerScore3;
    }

    public void setPlayerScore3(Long playerScore3) {
        this.playerScore3 = playerScore3;
    }

    public CStats withPlayerScore3(Long playerScore3) {
        this.playerScore3 = playerScore3;
        return this;
    }

    public Long getPlayerScore4() {
        return playerScore4;
    }

    public void setPlayerScore4(Long playerScore4) {
        this.playerScore4 = playerScore4;
    }

    public CStats withPlayerScore4(Long playerScore4) {
        this.playerScore4 = playerScore4;
        return this;
    }

    public Long getPlayerScore5() {
        return playerScore5;
    }

    public void setPlayerScore5(Long playerScore5) {
        this.playerScore5 = playerScore5;
    }

    public CStats withPlayerScore5(Long playerScore5) {
        this.playerScore5 = playerScore5;
        return this;
    }

    public Long getPlayerScore6() {
        return playerScore6;
    }

    public void setPlayerScore6(Long playerScore6) {
        this.playerScore6 = playerScore6;
    }

    public CStats withPlayerScore6(Long playerScore6) {
        this.playerScore6 = playerScore6;
        return this;
    }

    public Long getPlayerScore7() {
        return playerScore7;
    }

    public void setPlayerScore7(Long playerScore7) {
        this.playerScore7 = playerScore7;
    }

    public CStats withPlayerScore7(Long playerScore7) {
        this.playerScore7 = playerScore7;
        return this;
    }

    public Long getPlayerScore8() {
        return playerScore8;
    }

    public void setPlayerScore8(Long playerScore8) {
        this.playerScore8 = playerScore8;
    }

    public CStats withPlayerScore8(Long playerScore8) {
        this.playerScore8 = playerScore8;
        return this;
    }

    public Long getPlayerScore9() {
        return playerScore9;
    }

    public void setPlayerScore9(Long playerScore9) {
        this.playerScore9 = playerScore9;
    }

    public CStats withPlayerScore9(Long playerScore9) {
        this.playerScore9 = playerScore9;
        return this;
    }

    public Long getPerk0() {
        return perk0;
    }

    public void setPerk0(Long perk0) {
        this.perk0 = perk0;
    }

    public CStats withPerk0(Long perk0) {
        this.perk0 = perk0;
        return this;
    }

    public Long getPerk0Var1() {
        return perk0Var1;
    }

    public void setPerk0Var1(Long perk0Var1) {
        this.perk0Var1 = perk0Var1;
    }

    public CStats withPerk0Var1(Long perk0Var1) {
        this.perk0Var1 = perk0Var1;
        return this;
    }

    public Long getPerk0Var2() {
        return perk0Var2;
    }

    public void setPerk0Var2(Long perk0Var2) {
        this.perk0Var2 = perk0Var2;
    }

    public CStats withPerk0Var2(Long perk0Var2) {
        this.perk0Var2 = perk0Var2;
        return this;
    }

    public Long getPerk0Var3() {
        return perk0Var3;
    }

    public void setPerk0Var3(Long perk0Var3) {
        this.perk0Var3 = perk0Var3;
    }

    public CStats withPerk0Var3(Long perk0Var3) {
        this.perk0Var3 = perk0Var3;
        return this;
    }

    public Long getPerk1() {
        return perk1;
    }

    public void setPerk1(Long perk1) {
        this.perk1 = perk1;
    }

    public CStats withPerk1(Long perk1) {
        this.perk1 = perk1;
        return this;
    }

    public Long getPerk1Var1() {
        return perk1Var1;
    }

    public void setPerk1Var1(Long perk1Var1) {
        this.perk1Var1 = perk1Var1;
    }

    public CStats withPerk1Var1(Long perk1Var1) {
        this.perk1Var1 = perk1Var1;
        return this;
    }

    public Long getPerk1Var2() {
        return perk1Var2;
    }

    public void setPerk1Var2(Long perk1Var2) {
        this.perk1Var2 = perk1Var2;
    }

    public CStats withPerk1Var2(Long perk1Var2) {
        this.perk1Var2 = perk1Var2;
        return this;
    }

    public Long getPerk1Var3() {
        return perk1Var3;
    }

    public void setPerk1Var3(Long perk1Var3) {
        this.perk1Var3 = perk1Var3;
    }

    public CStats withPerk1Var3(Long perk1Var3) {
        this.perk1Var3 = perk1Var3;
        return this;
    }

    public Long getPerk2() {
        return perk2;
    }

    public void setPerk2(Long perk2) {
        this.perk2 = perk2;
    }

    public CStats withPerk2(Long perk2) {
        this.perk2 = perk2;
        return this;
    }

    public Long getPerk2Var1() {
        return perk2Var1;
    }

    public void setPerk2Var1(Long perk2Var1) {
        this.perk2Var1 = perk2Var1;
    }

    public CStats withPerk2Var1(Long perk2Var1) {
        this.perk2Var1 = perk2Var1;
        return this;
    }

    public Long getPerk2Var2() {
        return perk2Var2;
    }

    public void setPerk2Var2(Long perk2Var2) {
        this.perk2Var2 = perk2Var2;
    }

    public CStats withPerk2Var2(Long perk2Var2) {
        this.perk2Var2 = perk2Var2;
        return this;
    }

    public Long getPerk2Var3() {
        return perk2Var3;
    }

    public void setPerk2Var3(Long perk2Var3) {
        this.perk2Var3 = perk2Var3;
    }

    public CStats withPerk2Var3(Long perk2Var3) {
        this.perk2Var3 = perk2Var3;
        return this;
    }

    public Long getPerk3() {
        return perk3;
    }

    public void setPerk3(Long perk3) {
        this.perk3 = perk3;
    }

    public CStats withPerk3(Long perk3) {
        this.perk3 = perk3;
        return this;
    }

    public Long getPerk3Var1() {
        return perk3Var1;
    }

    public void setPerk3Var1(Long perk3Var1) {
        this.perk3Var1 = perk3Var1;
    }

    public CStats withPerk3Var1(Long perk3Var1) {
        this.perk3Var1 = perk3Var1;
        return this;
    }

    public Long getPerk3Var2() {
        return perk3Var2;
    }

    public void setPerk3Var2(Long perk3Var2) {
        this.perk3Var2 = perk3Var2;
    }

    public CStats withPerk3Var2(Long perk3Var2) {
        this.perk3Var2 = perk3Var2;
        return this;
    }

    public Long getPerk3Var3() {
        return perk3Var3;
    }

    public void setPerk3Var3(Long perk3Var3) {
        this.perk3Var3 = perk3Var3;
    }

    public CStats withPerk3Var3(Long perk3Var3) {
        this.perk3Var3 = perk3Var3;
        return this;
    }

    public Long getPerk4() {
        return perk4;
    }

    public void setPerk4(Long perk4) {
        this.perk4 = perk4;
    }

    public CStats withPerk4(Long perk4) {
        this.perk4 = perk4;
        return this;
    }

    public Long getPerk4Var1() {
        return perk4Var1;
    }

    public void setPerk4Var1(Long perk4Var1) {
        this.perk4Var1 = perk4Var1;
    }

    public CStats withPerk4Var1(Long perk4Var1) {
        this.perk4Var1 = perk4Var1;
        return this;
    }

    public Long getPerk4Var2() {
        return perk4Var2;
    }

    public void setPerk4Var2(Long perk4Var2) {
        this.perk4Var2 = perk4Var2;
    }

    public CStats withPerk4Var2(Long perk4Var2) {
        this.perk4Var2 = perk4Var2;
        return this;
    }

    public Long getPerk4Var3() {
        return perk4Var3;
    }

    public void setPerk4Var3(Long perk4Var3) {
        this.perk4Var3 = perk4Var3;
    }

    public CStats withPerk4Var3(Long perk4Var3) {
        this.perk4Var3 = perk4Var3;
        return this;
    }

    public Long getPerk5() {
        return perk5;
    }

    public void setPerk5(Long perk5) {
        this.perk5 = perk5;
    }

    public CStats withPerk5(Long perk5) {
        this.perk5 = perk5;
        return this;
    }

    public Long getPerk5Var1() {
        return perk5Var1;
    }

    public void setPerk5Var1(Long perk5Var1) {
        this.perk5Var1 = perk5Var1;
    }

    public CStats withPerk5Var1(Long perk5Var1) {
        this.perk5Var1 = perk5Var1;
        return this;
    }

    public Long getPerk5Var2() {
        return perk5Var2;
    }

    public void setPerk5Var2(Long perk5Var2) {
        this.perk5Var2 = perk5Var2;
    }

    public CStats withPerk5Var2(Long perk5Var2) {
        this.perk5Var2 = perk5Var2;
        return this;
    }

    public Long getPerk5Var3() {
        return perk5Var3;
    }

    public void setPerk5Var3(Long perk5Var3) {
        this.perk5Var3 = perk5Var3;
    }

    public CStats withPerk5Var3(Long perk5Var3) {
        this.perk5Var3 = perk5Var3;
        return this;
    }

    public Long getPerkPrimaryStyle() {
        return perkPrimaryStyle;
    }

    public void setPerkPrimaryStyle(Long perkPrimaryStyle) {
        this.perkPrimaryStyle = perkPrimaryStyle;
    }

    public CStats withPerkPrimaryStyle(Long perkPrimaryStyle) {
        this.perkPrimaryStyle = perkPrimaryStyle;
        return this;
    }

    public Long getPerkSubStyle() {
        return perkSubStyle;
    }

    public void setPerkSubStyle(Long perkSubStyle) {
        this.perkSubStyle = perkSubStyle;
    }

    public CStats withPerkSubStyle(Long perkSubStyle) {
        this.perkSubStyle = perkSubStyle;
        return this;
    }

    public Long getStatPerk0() {
        return statPerk0;
    }

    public void setStatPerk0(Long statPerk0) {
        this.statPerk0 = statPerk0;
    }

    public CStats withStatPerk0(Long statPerk0) {
        this.statPerk0 = statPerk0;
        return this;
    }

    public Long getStatPerk1() {
        return statPerk1;
    }

    public void setStatPerk1(Long statPerk1) {
        this.statPerk1 = statPerk1;
    }

    public CStats withStatPerk1(Long statPerk1) {
        this.statPerk1 = statPerk1;
        return this;
    }

    public Long getStatPerk2() {
        return statPerk2;
    }

    public void setStatPerk2(Long statPerk2) {
        this.statPerk2 = statPerk2;
    }

    public CStats withStatPerk2(Long statPerk2) {
        this.statPerk2 = statPerk2;
        return this;
    }

}
