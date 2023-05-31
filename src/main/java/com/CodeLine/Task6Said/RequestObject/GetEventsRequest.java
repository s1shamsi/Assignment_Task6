package com.CodeLine.Task6Said.RequestObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEventsRequest {


    private String eventName;
    private String sport;

    private String results;
}
