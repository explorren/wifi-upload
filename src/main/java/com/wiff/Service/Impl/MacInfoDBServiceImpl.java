package com.wiff.Service.Impl;

import com.wiff.Repository.MacInfoDBRepository;
import com.wiff.Service.MacInfoDBService;
import com.wiff.domain.MacInfo;
import com.wiff.domain.MacInfoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Jupiter on 2017-09-10.
 */

@Service
public class MacInfoDBServiceImpl implements MacInfoDBService{

    @Autowired
    MacInfoDBRepository macInfoDBRepository;

    @Override
    public void saveMacInfo2DB(List<MacInfoDB> macInfoDBs) {
        macInfoDBRepository.save(macInfoDBs);
    }
}
