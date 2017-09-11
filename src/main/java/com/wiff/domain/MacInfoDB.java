package com.wiff.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jupiter on 2017-09-10.
 */
@Entity
@Table(name = "MACINFO")
@Data
public class MacInfoDB {

    @Id
    @GeneratedValue
    Long  macId;

    Long baseId;

    String mac;
    String rssi;
    String ch;
    String distanceRange;

    public MacInfoDB() {
    }

    public void set2DB(MacInfo macInfo) {
        this.mac=macInfo.getMac();
        this.rssi=macInfo.getRssi();
        this.ch=macInfo.getCh();
        this.distanceRange=macInfo.getRange();
    }
}
