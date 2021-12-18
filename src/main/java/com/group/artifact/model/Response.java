package com.group.artifact.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Response {
    private int status;
    private int responseId;
    private String responseBody;
}
