package com.example.capstona_a.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Participant implements Serializable
{

    @SerializedName("assists")
    @Expose
    private long assists;
    @SerializedName("baronKills")
    @Expose
    private long baronKills;
    @SerializedName("bountyLevel")
    @Expose
    private long bountyLevel;
    @SerializedName("champExperience")
    @Expose
    private long champExperience;
    @SerializedName("champLevel")
    @Expose
    private long champLevel;
    @SerializedName("championId")
    @Expose
    private long championId;
    @SerializedName("championName")
    @Expose
    private String championName;
    @SerializedName("championTransform")
    @Expose
    private long championTransform;
    @SerializedName("consumablesPurchased")
    @Expose
    private long consumablesPurchased;
    @SerializedName("damageDealtToBuildings")
    @Expose
    private long damageDealtToBuildings;
    @SerializedName("damageDealtToObjectives")
    @Expose
    private long damageDealtToObjectives;
    @SerializedName("damageDealtToTurrets")
    @Expose
    private long damageDealtToTurrets;
    @SerializedName("damageSelfMitigated")
    @Expose
    private long damageSelfMitigated;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("detectorWardsPlaced")
    @Expose
    private long detectorWardsPlaced;
    @SerializedName("doubleKills")
    @Expose
    private long doubleKills;
    @SerializedName("dragonKills")
    @Expose
    private long dragonKills;
    @SerializedName("firstBloodAssist")
    @Expose
    private boolean firstBloodAssist;
    @SerializedName("firstBloodKill")
    @Expose
    private boolean firstBloodKill;
    @SerializedName("firstTowerAssist")
    @Expose
    private boolean firstTowerAssist;
    @SerializedName("firstTowerKill")
    @Expose
    private boolean firstTowerKill;
    @SerializedName("gameEndedInEarlySurrender")
    @Expose
    private boolean gameEndedInEarlySurrender;
    @SerializedName("gameEndedInSurrender")
    @Expose
    private boolean gameEndedInSurrender;
    @SerializedName("goldEarned")
    @Expose
    private long goldEarned;
    @SerializedName("goldSpent")
    @Expose
    private long goldSpent;
    @SerializedName("individualPosition")
    @Expose
    private String individualPosition;
    @SerializedName("inhibitorKills")
    @Expose
    private long inhibitorKills;
    @SerializedName("inhibitorTakedowns")
    @Expose
    private long inhibitorTakedowns;
    @SerializedName("inhibitorsLost")
    @Expose
    private long inhibitorsLost;
    @SerializedName("item0")
    @Expose
    private long item0;
    @SerializedName("item1")
    @Expose
    private long item1;
    @SerializedName("item2")
    @Expose
    private long item2;
    @SerializedName("item3")
    @Expose
    private long item3;
    @SerializedName("item4")
    @Expose
    private long item4;
    @SerializedName("item5")
    @Expose
    private long item5;
    @SerializedName("item6")
    @Expose
    private long item6;
    @SerializedName("itemsPurchased")
    @Expose
    private long itemsPurchased;
    @SerializedName("killingSprees")
    @Expose
    private long killingSprees;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("lane")
    @Expose
    private String lane;
    @SerializedName("largestCriticalStrike")
    @Expose
    private long largestCriticalStrike;
    @SerializedName("largestKillingSpree")
    @Expose
    private long largestKillingSpree;
    @SerializedName("largestMultiKill")
    @Expose
    private long largestMultiKill;
    @SerializedName("longestTimeSpentLiving")
    @Expose
    private long longestTimeSpentLiving;
    @SerializedName("magicDamageDealt")
    @Expose
    private long magicDamageDealt;
    @SerializedName("magicDamageDealtToChampions")
    @Expose
    private long magicDamageDealtToChampions;
    @SerializedName("magicDamageTaken")
    @Expose
    private long magicDamageTaken;
    @SerializedName("neutralMinionsKilled")
    @Expose
    private long neutralMinionsKilled;
    @SerializedName("nexusKills")
    @Expose
    private long nexusKills;
    @SerializedName("nexusLost")
    @Expose
    private long nexusLost;
    @SerializedName("nexusTakedowns")
    @Expose
    private long nexusTakedowns;
    @SerializedName("objectivesStolen")
    @Expose
    private long objectivesStolen;
    @SerializedName("objectivesStolenAssists")
    @Expose
    private long objectivesStolenAssists;
    @SerializedName("participantId")
    @Expose
    private long participantId;
    @SerializedName("pentaKills")
    @Expose
    private long pentaKills;
    @SerializedName("perks")
    @Expose
    private Perks perks;
    @SerializedName("physicalDamageDealt")
    @Expose
    private long physicalDamageDealt;
    @SerializedName("physicalDamageDealtToChampions")
    @Expose
    private long physicalDamageDealtToChampions;
    @SerializedName("physicalDamageTaken")
    @Expose
    private long physicalDamageTaken;
    @SerializedName("profileIcon")
    @Expose
    private long profileIcon;
    @SerializedName("puuid")
    @Expose
    private String puuid;
    @SerializedName("quadraKills")
    @Expose
    private long quadraKills;
    @SerializedName("riotIdName")
    @Expose
    private String riotIdName;
    @SerializedName("riotIdTagline")
    @Expose
    private String riotIdTagline;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("sightWardsBoughtInGame")
    @Expose
    private long sightWardsBoughtInGame;
    @SerializedName("spell1Casts")
    @Expose
    private long spell1Casts;
    @SerializedName("spell2Casts")
    @Expose
    private long spell2Casts;
    @SerializedName("spell3Casts")
    @Expose
    private long spell3Casts;
    @SerializedName("spell4Casts")
    @Expose
    private long spell4Casts;
    @SerializedName("summoner1Casts")
    @Expose
    private long summoner1Casts;
    @SerializedName("summoner1Id")
    @Expose
    private long summoner1Id;
    @SerializedName("summoner2Casts")
    @Expose
    private long summoner2Casts;
    @SerializedName("summoner2Id")
    @Expose
    private long summoner2Id;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("summonerLevel")
    @Expose
    private long summonerLevel;
    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("teamEarlySurrendered")
    @Expose
    private boolean teamEarlySurrendered;
    @SerializedName("teamId")
    @Expose
    private long teamId;
    @SerializedName("teamPosition")
    @Expose
    private String teamPosition;
    @SerializedName("timeCCingOthers")
    @Expose
    private long timeCCingOthers;
    @SerializedName("timePlayed")
    @Expose
    private long timePlayed;
    @SerializedName("totalDamageDealt")
    @Expose
    private long totalDamageDealt;
    @SerializedName("totalDamageDealtToChampions")
    @Expose
    private long totalDamageDealtToChampions;
    @SerializedName("totalDamageShieldedOnTeammates")
    @Expose
    private long totalDamageShieldedOnTeammates;
    @SerializedName("totalDamageTaken")
    @Expose
    private long totalDamageTaken;
    @SerializedName("totalHeal")
    @Expose
    private long totalHeal;
    @SerializedName("totalHealsOnTeammates")
    @Expose
    private long totalHealsOnTeammates;
    @SerializedName("totalMinionsKilled")
    @Expose
    private long totalMinionsKilled;
    @SerializedName("totalTimeCCDealt")
    @Expose
    private long totalTimeCCDealt;
    @SerializedName("totalTimeSpentDead")
    @Expose
    private long totalTimeSpentDead;
    @SerializedName("totalUnitsHealed")
    @Expose
    private long totalUnitsHealed;
    @SerializedName("tripleKills")
    @Expose
    private long tripleKills;
    @SerializedName("trueDamageDealt")
    @Expose
    private long trueDamageDealt;
    @SerializedName("trueDamageDealtToChampions")
    @Expose
    private long trueDamageDealtToChampions;
    @SerializedName("trueDamageTaken")
    @Expose
    private long trueDamageTaken;
    @SerializedName("turretKills")
    @Expose
    private long turretKills;
    @SerializedName("turretTakedowns")
    @Expose
    private long turretTakedowns;
    @SerializedName("turretsLost")
    @Expose
    private long turretsLost;
    @SerializedName("unrealKills")
    @Expose
    private long unrealKills;
    @SerializedName("visionScore")
    @Expose
    private long visionScore;
    @SerializedName("visionWardsBoughtInGame")
    @Expose
    private long visionWardsBoughtInGame;
    @SerializedName("wardsKilled")
    @Expose
    private long wardsKilled;
    @SerializedName("wardsPlaced")
    @Expose
    private long wardsPlaced;
    @SerializedName("win")
    @Expose
    private boolean win;
    private final static long serialVersionUID = -1658629424935497391L;

    public long getAssists() {
        return assists;
    }

    public void setAssists(long assists) {
        this.assists = assists;
    }

    public Participant withAssists(long assists) {
        this.assists = assists;
        return this;
    }

    public long getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(long baronKills) {
        this.baronKills = baronKills;
    }

    public Participant withBaronKills(long baronKills) {
        this.baronKills = baronKills;
        return this;
    }

    public long getBountyLevel() {
        return bountyLevel;
    }

    public void setBountyLevel(long bountyLevel) {
        this.bountyLevel = bountyLevel;
    }

    public Participant withBountyLevel(long bountyLevel) {
        this.bountyLevel = bountyLevel;
        return this;
    }

    public long getChampExperience() {
        return champExperience;
    }

    public void setChampExperience(long champExperience) {
        this.champExperience = champExperience;
    }

    public Participant withChampExperience(long champExperience) {
        this.champExperience = champExperience;
        return this;
    }

    public long getChampLevel() {
        return champLevel;
    }

    public void setChampLevel(long champLevel) {
        this.champLevel = champLevel;
    }

    public Participant withChampLevel(long champLevel) {
        this.champLevel = champLevel;
        return this;
    }

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public Participant withChampionId(long championId) {
        this.championId = championId;
        return this;
    }

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public Participant withChampionName(String championName) {
        this.championName = championName;
        return this;
    }

    public long getChampionTransform() {
        return championTransform;
    }

    public void setChampionTransform(long championTransform) {
        this.championTransform = championTransform;
    }

    public Participant withChampionTransform(long championTransform) {
        this.championTransform = championTransform;
        return this;
    }

    public long getConsumablesPurchased() {
        return consumablesPurchased;
    }

    public void setConsumablesPurchased(long consumablesPurchased) {
        this.consumablesPurchased = consumablesPurchased;
    }

    public Participant withConsumablesPurchased(long consumablesPurchased) {
        this.consumablesPurchased = consumablesPurchased;
        return this;
    }

    public long getDamageDealtToBuildings() {
        return damageDealtToBuildings;
    }

    public void setDamageDealtToBuildings(long damageDealtToBuildings) {
        this.damageDealtToBuildings = damageDealtToBuildings;
    }

    public Participant withDamageDealtToBuildings(long damageDealtToBuildings) {
        this.damageDealtToBuildings = damageDealtToBuildings;
        return this;
    }

    public long getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    public void setDamageDealtToObjectives(long damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    public Participant withDamageDealtToObjectives(long damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
        return this;
    }

    public long getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    public void setDamageDealtToTurrets(long damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    public Participant withDamageDealtToTurrets(long damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
        return this;
    }

    public long getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    public void setDamageSelfMitigated(long damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    public Participant withDamageSelfMitigated(long damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
        return this;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public Participant withDeaths(long deaths) {
        this.deaths = deaths;
        return this;
    }

    public long getDetectorWardsPlaced() {
        return detectorWardsPlaced;
    }

    public void setDetectorWardsPlaced(long detectorWardsPlaced) {
        this.detectorWardsPlaced = detectorWardsPlaced;
    }

    public Participant withDetectorWardsPlaced(long detectorWardsPlaced) {
        this.detectorWardsPlaced = detectorWardsPlaced;
        return this;
    }

    public long getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(long doubleKills) {
        this.doubleKills = doubleKills;
    }

    public Participant withDoubleKills(long doubleKills) {
        this.doubleKills = doubleKills;
        return this;
    }

    public long getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(long dragonKills) {
        this.dragonKills = dragonKills;
    }

    public Participant withDragonKills(long dragonKills) {
        this.dragonKills = dragonKills;
        return this;
    }

    public boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public Participant withFirstBloodAssist(boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
        return this;
    }

    public boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public Participant withFirstBloodKill(boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
        return this;
    }

    public boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public Participant withFirstTowerAssist(boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
        return this;
    }

    public boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public Participant withFirstTowerKill(boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
        return this;
    }

    public boolean isGameEndedInEarlySurrender() {
        return gameEndedInEarlySurrender;
    }

    public void setGameEndedInEarlySurrender(boolean gameEndedInEarlySurrender) {
        this.gameEndedInEarlySurrender = gameEndedInEarlySurrender;
    }

    public Participant withGameEndedInEarlySurrender(boolean gameEndedInEarlySurrender) {
        this.gameEndedInEarlySurrender = gameEndedInEarlySurrender;
        return this;
    }

    public boolean isGameEndedInSurrender() {
        return gameEndedInSurrender;
    }

    public void setGameEndedInSurrender(boolean gameEndedInSurrender) {
        this.gameEndedInSurrender = gameEndedInSurrender;
    }

    public Participant withGameEndedInSurrender(boolean gameEndedInSurrender) {
        this.gameEndedInSurrender = gameEndedInSurrender;
        return this;
    }

    public long getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(long goldEarned) {
        this.goldEarned = goldEarned;
    }

    public Participant withGoldEarned(long goldEarned) {
        this.goldEarned = goldEarned;
        return this;
    }

    public long getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(long goldSpent) {
        this.goldSpent = goldSpent;
    }

    public Participant withGoldSpent(long goldSpent) {
        this.goldSpent = goldSpent;
        return this;
    }

    public String getIndividualPosition() {
        return individualPosition;
    }

    public void setIndividualPosition(String individualPosition) {
        this.individualPosition = individualPosition;
    }

    public Participant withIndividualPosition(String individualPosition) {
        this.individualPosition = individualPosition;
        return this;
    }

    public long getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(long inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public Participant withInhibitorKills(long inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
        return this;
    }

    public long getInhibitorTakedowns() {
        return inhibitorTakedowns;
    }

    public void setInhibitorTakedowns(long inhibitorTakedowns) {
        this.inhibitorTakedowns = inhibitorTakedowns;
    }

    public Participant withInhibitorTakedowns(long inhibitorTakedowns) {
        this.inhibitorTakedowns = inhibitorTakedowns;
        return this;
    }

    public long getInhibitorsLost() {
        return inhibitorsLost;
    }

    public void setInhibitorsLost(long inhibitorsLost) {
        this.inhibitorsLost = inhibitorsLost;
    }

    public Participant withInhibitorsLost(long inhibitorsLost) {
        this.inhibitorsLost = inhibitorsLost;
        return this;
    }

    public long getItem0() {
        return item0;
    }

    public void setItem0(long item0) {
        this.item0 = item0;
    }

    public Participant withItem0(long item0) {
        this.item0 = item0;
        return this;
    }

    public long getItem1() {
        return item1;
    }

    public void setItem1(long item1) {
        this.item1 = item1;
    }

    public Participant withItem1(long item1) {
        this.item1 = item1;
        return this;
    }

    public long getItem2() {
        return item2;
    }

    public void setItem2(long item2) {
        this.item2 = item2;
    }

    public Participant withItem2(long item2) {
        this.item2 = item2;
        return this;
    }

    public long getItem3() {
        return item3;
    }

    public void setItem3(long item3) {
        this.item3 = item3;
    }

    public Participant withItem3(long item3) {
        this.item3 = item3;
        return this;
    }

    public long getItem4() {
        return item4;
    }

    public void setItem4(long item4) {
        this.item4 = item4;
    }

    public Participant withItem4(long item4) {
        this.item4 = item4;
        return this;
    }

    public long getItem5() {
        return item5;
    }

    public void setItem5(long item5) {
        this.item5 = item5;
    }

    public Participant withItem5(long item5) {
        this.item5 = item5;
        return this;
    }

    public long getItem6() {
        return item6;
    }

    public void setItem6(long item6) {
        this.item6 = item6;
    }

    public Participant withItem6(long item6) {
        this.item6 = item6;
        return this;
    }

    public long getItemsPurchased() {
        return itemsPurchased;
    }

    public void setItemsPurchased(long itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    public Participant withItemsPurchased(long itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
        return this;
    }

    public long getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(long killingSprees) {
        this.killingSprees = killingSprees;
    }

    public Participant withKillingSprees(long killingSprees) {
        this.killingSprees = killingSprees;
        return this;
    }

    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }

    public Participant withKills(long kills) {
        this.kills = kills;
        return this;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Participant withLane(String lane) {
        this.lane = lane;
        return this;
    }

    public long getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(long largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public Participant withLargestCriticalStrike(long largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
        return this;
    }

    public long getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(long largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public Participant withLargestKillingSpree(long largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
        return this;
    }

    public long getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(long largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public Participant withLargestMultiKill(long largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
        return this;
    }

    public long getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    public void setLongestTimeSpentLiving(long longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
    }

    public Participant withLongestTimeSpentLiving(long longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
        return this;
    }

    public long getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(long magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public Participant withMagicDamageDealt(long magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
        return this;
    }

    public long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(long magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public Participant withMagicDamageDealtToChampions(long magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
        return this;
    }

    public long getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public void setMagicDamageTaken(long magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public Participant withMagicDamageTaken(long magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
        return this;
    }

    public long getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(long neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public Participant withNeutralMinionsKilled(long neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
        return this;
    }

    public long getNexusKills() {
        return nexusKills;
    }

    public void setNexusKills(long nexusKills) {
        this.nexusKills = nexusKills;
    }

    public Participant withNexusKills(long nexusKills) {
        this.nexusKills = nexusKills;
        return this;
    }

    public long getNexusLost() {
        return nexusLost;
    }

    public void setNexusLost(long nexusLost) {
        this.nexusLost = nexusLost;
    }

    public Participant withNexusLost(long nexusLost) {
        this.nexusLost = nexusLost;
        return this;
    }

    public long getNexusTakedowns() {
        return nexusTakedowns;
    }

    public void setNexusTakedowns(long nexusTakedowns) {
        this.nexusTakedowns = nexusTakedowns;
    }

    public Participant withNexusTakedowns(long nexusTakedowns) {
        this.nexusTakedowns = nexusTakedowns;
        return this;
    }

    public long getObjectivesStolen() {
        return objectivesStolen;
    }

    public void setObjectivesStolen(long objectivesStolen) {
        this.objectivesStolen = objectivesStolen;
    }

    public Participant withObjectivesStolen(long objectivesStolen) {
        this.objectivesStolen = objectivesStolen;
        return this;
    }

    public long getObjectivesStolenAssists() {
        return objectivesStolenAssists;
    }

    public void setObjectivesStolenAssists(long objectivesStolenAssists) {
        this.objectivesStolenAssists = objectivesStolenAssists;
    }

    public Participant withObjectivesStolenAssists(long objectivesStolenAssists) {
        this.objectivesStolenAssists = objectivesStolenAssists;
        return this;
    }

    public long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(long participantId) {
        this.participantId = participantId;
    }

    public Participant withParticipantId(long participantId) {
        this.participantId = participantId;
        return this;
    }

    public long getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(long pentaKills) {
        this.pentaKills = pentaKills;
    }

    public Participant withPentaKills(long pentaKills) {
        this.pentaKills = pentaKills;
        return this;
    }

    public Perks getPerks() {
        return perks;
    }

    public void setPerks(Perks perks) {
        this.perks = perks;
    }

    public Participant withPerks(Perks perks) {
        this.perks = perks;
        return this;
    }

    public long getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(long physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public Participant withPhysicalDamageDealt(long physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
        return this;
    }

    public long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(long physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public Participant withPhysicalDamageDealtToChampions(long physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
        return this;
    }

    public long getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(long physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public Participant withPhysicalDamageTaken(long physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
        return this;
    }

    public long getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(long profileIcon) {
        this.profileIcon = profileIcon;
    }

    public Participant withProfileIcon(long profileIcon) {
        this.profileIcon = profileIcon;
        return this;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public Participant withPuuid(String puuid) {
        this.puuid = puuid;
        return this;
    }

    public long getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(long quadraKills) {
        this.quadraKills = quadraKills;
    }

    public Participant withQuadraKills(long quadraKills) {
        this.quadraKills = quadraKills;
        return this;
    }

    public String getRiotIdName() {
        return riotIdName;
    }

    public void setRiotIdName(String riotIdName) {
        this.riotIdName = riotIdName;
    }

    public Participant withRiotIdName(String riotIdName) {
        this.riotIdName = riotIdName;
        return this;
    }

    public String getRiotIdTagline() {
        return riotIdTagline;
    }

    public void setRiotIdTagline(String riotIdTagline) {
        this.riotIdTagline = riotIdTagline;
    }

    public Participant withRiotIdTagline(String riotIdTagline) {
        this.riotIdTagline = riotIdTagline;
        return this;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Participant withRole(String role) {
        this.role = role;
        return this;
    }

    public long getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(long sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public Participant withSightWardsBoughtInGame(long sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
        return this;
    }

    public long getSpell1Casts() {
        return spell1Casts;
    }

    public void setSpell1Casts(long spell1Casts) {
        this.spell1Casts = spell1Casts;
    }

    public Participant withSpell1Casts(long spell1Casts) {
        this.spell1Casts = spell1Casts;
        return this;
    }

    public long getSpell2Casts() {
        return spell2Casts;
    }

    public void setSpell2Casts(long spell2Casts) {
        this.spell2Casts = spell2Casts;
    }

    public Participant withSpell2Casts(long spell2Casts) {
        this.spell2Casts = spell2Casts;
        return this;
    }

    public long getSpell3Casts() {
        return spell3Casts;
    }

    public void setSpell3Casts(long spell3Casts) {
        this.spell3Casts = spell3Casts;
    }

    public Participant withSpell3Casts(long spell3Casts) {
        this.spell3Casts = spell3Casts;
        return this;
    }

    public long getSpell4Casts() {
        return spell4Casts;
    }

    public void setSpell4Casts(long spell4Casts) {
        this.spell4Casts = spell4Casts;
    }

    public Participant withSpell4Casts(long spell4Casts) {
        this.spell4Casts = spell4Casts;
        return this;
    }

    public long getSummoner1Casts() {
        return summoner1Casts;
    }

    public void setSummoner1Casts(long summoner1Casts) {
        this.summoner1Casts = summoner1Casts;
    }

    public Participant withSummoner1Casts(long summoner1Casts) {
        this.summoner1Casts = summoner1Casts;
        return this;
    }

    public long getSummoner1Id() {
        return summoner1Id;
    }

    public void setSummoner1Id(long summoner1Id) {
        this.summoner1Id = summoner1Id;
    }

    public Participant withSummoner1Id(long summoner1Id) {
        this.summoner1Id = summoner1Id;
        return this;
    }

    public long getSummoner2Casts() {
        return summoner2Casts;
    }

    public void setSummoner2Casts(long summoner2Casts) {
        this.summoner2Casts = summoner2Casts;
    }

    public Participant withSummoner2Casts(long summoner2Casts) {
        this.summoner2Casts = summoner2Casts;
        return this;
    }

    public long getSummoner2Id() {
        return summoner2Id;
    }

    public void setSummoner2Id(long summoner2Id) {
        this.summoner2Id = summoner2Id;
    }

    public Participant withSummoner2Id(long summoner2Id) {
        this.summoner2Id = summoner2Id;
        return this;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public Participant withSummonerId(String summonerId) {
        this.summonerId = summonerId;
        return this;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public Participant withSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
        return this;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public Participant withSummonerName(String summonerName) {
        this.summonerName = summonerName;
        return this;
    }

    public boolean isTeamEarlySurrendered() {
        return teamEarlySurrendered;
    }

    public void setTeamEarlySurrendered(boolean teamEarlySurrendered) {
        this.teamEarlySurrendered = teamEarlySurrendered;
    }

    public Participant withTeamEarlySurrendered(boolean teamEarlySurrendered) {
        this.teamEarlySurrendered = teamEarlySurrendered;
        return this;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public Participant withTeamId(long teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getTeamPosition() {
        return teamPosition;
    }

    public void setTeamPosition(String teamPosition) {
        this.teamPosition = teamPosition;
    }

    public Participant withTeamPosition(String teamPosition) {
        this.teamPosition = teamPosition;
        return this;
    }

    public long getTimeCCingOthers() {
        return timeCCingOthers;
    }

    public void setTimeCCingOthers(long timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    public Participant withTimeCCingOthers(long timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
        return this;
    }

    public long getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(long timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Participant withTimePlayed(long timePlayed) {
        this.timePlayed = timePlayed;
        return this;
    }

    public long getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(long totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public Participant withTotalDamageDealt(long totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
        return this;
    }

    public long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(long totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public Participant withTotalDamageDealtToChampions(long totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
        return this;
    }

    public long getTotalDamageShieldedOnTeammates() {
        return totalDamageShieldedOnTeammates;
    }

    public void setTotalDamageShieldedOnTeammates(long totalDamageShieldedOnTeammates) {
        this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates;
    }

    public Participant withTotalDamageShieldedOnTeammates(long totalDamageShieldedOnTeammates) {
        this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates;
        return this;
    }

    public long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(long totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Participant withTotalDamageTaken(long totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
        return this;
    }

    public long getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(long totalHeal) {
        this.totalHeal = totalHeal;
    }

    public Participant withTotalHeal(long totalHeal) {
        this.totalHeal = totalHeal;
        return this;
    }

    public long getTotalHealsOnTeammates() {
        return totalHealsOnTeammates;
    }

    public void setTotalHealsOnTeammates(long totalHealsOnTeammates) {
        this.totalHealsOnTeammates = totalHealsOnTeammates;
    }

    public Participant withTotalHealsOnTeammates(long totalHealsOnTeammates) {
        this.totalHealsOnTeammates = totalHealsOnTeammates;
        return this;
    }

    public long getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    public void setTotalMinionsKilled(long totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    public Participant withTotalMinionsKilled(long totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
        return this;
    }

    public long getTotalTimeCCDealt() {
        return totalTimeCCDealt;
    }

    public void setTotalTimeCCDealt(long totalTimeCCDealt) {
        this.totalTimeCCDealt = totalTimeCCDealt;
    }

    public Participant withTotalTimeCCDealt(long totalTimeCCDealt) {
        this.totalTimeCCDealt = totalTimeCCDealt;
        return this;
    }

    public long getTotalTimeSpentDead() {
        return totalTimeSpentDead;
    }

    public void setTotalTimeSpentDead(long totalTimeSpentDead) {
        this.totalTimeSpentDead = totalTimeSpentDead;
    }

    public Participant withTotalTimeSpentDead(long totalTimeSpentDead) {
        this.totalTimeSpentDead = totalTimeSpentDead;
        return this;
    }

    public long getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(long totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public Participant withTotalUnitsHealed(long totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
        return this;
    }

    public long getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(long tripleKills) {
        this.tripleKills = tripleKills;
    }

    public Participant withTripleKills(long tripleKills) {
        this.tripleKills = tripleKills;
        return this;
    }

    public long getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(long trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public Participant withTrueDamageDealt(long trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
        return this;
    }

    public long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(long trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public Participant withTrueDamageDealtToChampions(long trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
        return this;
    }

    public long getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(long trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public Participant withTrueDamageTaken(long trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
        return this;
    }

    public long getTurretKills() {
        return turretKills;
    }

    public void setTurretKills(long turretKills) {
        this.turretKills = turretKills;
    }

    public Participant withTurretKills(long turretKills) {
        this.turretKills = turretKills;
        return this;
    }

    public long getTurretTakedowns() {
        return turretTakedowns;
    }

    public void setTurretTakedowns(long turretTakedowns) {
        this.turretTakedowns = turretTakedowns;
    }

    public Participant withTurretTakedowns(long turretTakedowns) {
        this.turretTakedowns = turretTakedowns;
        return this;
    }

    public long getTurretsLost() {
        return turretsLost;
    }

    public void setTurretsLost(long turretsLost) {
        this.turretsLost = turretsLost;
    }

    public Participant withTurretsLost(long turretsLost) {
        this.turretsLost = turretsLost;
        return this;
    }

    public long getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(long unrealKills) {
        this.unrealKills = unrealKills;
    }

    public Participant withUnrealKills(long unrealKills) {
        this.unrealKills = unrealKills;
        return this;
    }

    public long getVisionScore() {
        return visionScore;
    }

    public void setVisionScore(long visionScore) {
        this.visionScore = visionScore;
    }

    public Participant withVisionScore(long visionScore) {
        this.visionScore = visionScore;
        return this;
    }

    public long getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(long visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public Participant withVisionWardsBoughtInGame(long visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
        return this;
    }

    public long getWardsKilled() {
        return wardsKilled;
    }

    public void setWardsKilled(long wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    public Participant withWardsKilled(long wardsKilled) {
        this.wardsKilled = wardsKilled;
        return this;
    }

    public long getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(long wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public Participant withWardsPlaced(long wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
        return this;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public Participant withWin(boolean win) {
        this.win = win;
        return this;
    }

}