package com.example.capstona_a;

import com.google.gson.annotations.Expose;

public class CMatchDetailDtoGroup {
    public CMatchDetailDTO getcMatchDetailDTO() {
        return cMatchDetailDTO;
    }

    public void setcMatchDetailDTO(CMatchDetailDTO cMatchDetailDTO) {
        this.cMatchDetailDTO = cMatchDetailDTO;
    }

    @Expose
    private CMatchDetailDTO cMatchDetailDTO= null;
}
