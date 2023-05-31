package com.CodeLine.Task6Said.ResponceObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetMedalResponse {

    private String countryName;
    private int goldMedals;
    private int silverMedals;
    private int bronzeMedals;
}