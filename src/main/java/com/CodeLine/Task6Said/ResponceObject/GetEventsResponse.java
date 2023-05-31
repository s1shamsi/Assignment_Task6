package com.CodeLine.Task6Said.ResponceObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEventsResponse {

    private String eventName;
    private String sport;
    private String results;
}
