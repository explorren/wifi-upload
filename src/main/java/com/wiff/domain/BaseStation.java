package com.wiff.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Jupiter on 2017-09-10.
 */
@Data
public class BaseStation {


    String id;

    @JsonProperty("data")
    List<MacInfo> data;

    String mmac;

    String rate;

    String time;

    String lat;

    String lon;

    public BaseStation() {
    }
}
