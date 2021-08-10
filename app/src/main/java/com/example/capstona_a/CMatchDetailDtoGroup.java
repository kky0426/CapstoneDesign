package com.example.capstona_a;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

public class CMatchDetailDtoGroup {


    public ArrayList<CMatchDetailDTO> getcMatchDetailDTO() {
        return cMatchDetailDTO;
    }

    public void setcMatchDetailDTO(ArrayList<CMatchDetailDTO> cMatchDetailDTO) {
        this.cMatchDetailDTO = cMatchDetailDTO;
    }

    @Expose
    private ArrayList<CMatchDetailDTO> cMatchDetailDTO= null;
}
