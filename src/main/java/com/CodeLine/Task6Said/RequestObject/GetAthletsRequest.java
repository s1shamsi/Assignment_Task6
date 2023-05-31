package com.CodeLine.Task6Said.RequestObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAthletsRequest {
    private String name;
    private String nationality;
    private String sport;
}

