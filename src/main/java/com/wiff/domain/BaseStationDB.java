package com.wiff.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Jupiter on 2017-09-10.
 */
@Entity
@Table(name = "BASESTAION")
@Data
public class BaseStationDB {

    @Id
    @GeneratedValue
    Long stationId;

    String id;

    String mmac;

    String rate;

    String time;

    String lat;

    String lon;

    public BaseStationDB() {

    }

    public BaseStationDB(BaseStation baseStation) {

        this.id=baseStation.getId();
        this.mmac=baseStation.getMmac();
        this.rate=baseStation.getRate();
        this.time=baseStation.getTime();
        this.lat=baseStation.getLat();
        this.lon=baseStation.getLon();
    }
}
