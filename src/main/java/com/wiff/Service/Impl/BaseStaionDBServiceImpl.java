package com.wiff.Service.Impl;

import com.wiff.Repository.BaseStaionDBRepository;
import com.wiff.Service.BaseStationDBService;
import com.wiff.domain.BaseStation;
import com.wiff.domain.BaseStationDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Jupiter on 2017-09-10.
 */
@Service
public class BaseStaionDBServiceImpl implements BaseStationDBService{

    @Autowired
    BaseStaionDBRepository baseStaionDBRepository;


    @Override
    public void saveBaseStation2DB(BaseStationDB baseStationDBs) {

        baseStaionDBRepository.save(baseStationDBs);
    }
}
