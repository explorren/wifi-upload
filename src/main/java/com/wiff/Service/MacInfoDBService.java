package com.wiff.Service;

import com.wiff.domain.MacInfo;
import com.wiff.domain.MacInfoDB;

import java.util.List;

/**
 * Created by Jupiter on 2017-09-10.
 */
public interface MacInfoDBService {

    void saveMacInfo2DB(List<MacInfoDB> macInfos);
}
