package com.example.capstona_a;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CUserSetleagueEntryDTO {
    @Expose
    private Set<CuserLeagueEntryDTO> leagueEntryDTO=null;
    public Set<CuserLeagueEntryDTO> getLeagueEntryDTO() {
        return leagueEntryDTO;
    }

    public void setLeagueEntryDTO(Set<CuserLeagueEntryDTO> leagueEntryDTO) {
        this.leagueEntryDTO = leagueEntryDTO;
    }
}
