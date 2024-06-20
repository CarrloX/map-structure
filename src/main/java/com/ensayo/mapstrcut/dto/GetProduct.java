package com.ensayo.mapstrcut.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class GetProduct {

    private long id;
    private String name;
    private String creationDate;
    private GetCategory category;
    private String price;
}
