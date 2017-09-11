package com.wiff.domain;

import lombok.Data;

/**
 * Created by Jupiter on 2017-09-10.
 */
@Data
public class MacInfo {

    String mac;
    String rssi;
    String ch;
    String range;

    public MacInfo() {
    }
}
