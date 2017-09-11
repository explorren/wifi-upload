package com.wiff.controller;

import com.google.gson.Gson;
import com.wiff.Service.BaseStationDBService;
import com.wiff.Service.MacInfoDBService;
import com.wiff.domain.BaseStation;
import com.wiff.domain.BaseStationDB;
import com.wiff.domain.MacInfo;
import com.wiff.domain.MacInfoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Jupiter on 2017-09-10.
 */


@RestController
public class ResultInfoController {

    @Autowired
    BaseStationDBService baseStationDBService;

    @Autowired
    MacInfoDBService macInfoDBService;


/*    @RequestMapping("dsky")
    public void Upload(@Valid ResultInfo resultInfo, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.println(new Date());
        }

        //System.err.println("------------------"+resultInfo.getMmac());
        //System.err.println("------------------"+resultInfo.getId());
        return ;
    }*/

/*    @RequestMapping("dsky")
    public void Upload(@RequestParam(value = "data",defaultValue = "0000000") String data){

        System.out.println(data);
        return ;
    }*/

    @RequestMapping("upload")
    public void UploadData(@RequestParam("data") String data){

        System.out.println(data.toString());
        Gson gson=new Gson();
        BaseStation baseStation;
        List<MacInfo> macInfos;
        if(data==null||data.equals("")){
            return;

        }else {
            baseStation=gson.fromJson(data,BaseStation.class);
        }

        if(baseStation.getData()==null||baseStation.getData().equals("")){
            return;
        }else {
            macInfos=baseStation.getData();
        }

        BaseStationDB baseStationDB=new BaseStationDB(baseStation);

        baseStationDBService.saveBaseStation2DB(baseStationDB);

        List<MacInfoDB> macInfoDBs=new ArrayList<MacInfoDB>();



        for(MacInfo macInfo:macInfos){

            //这里不知道好不好
            MacInfoDB macInfoDB=new MacInfoDB();
            macInfoDB.setBaseId(baseStationDB.getStationId());

            macInfoDB.set2DB(macInfo);

            macInfoDBs.add(macInfoDB);
        }

        macInfoDBService.saveMacInfo2DB(macInfoDBs);


        System.err.println(new Date());
    }

/*
    @RequestMapping("dsky")
    public void Upload(@RequestParam("data") String data) {

        Gson gson=new Gson();

        ResultInfo resultInfo=gson.fromJson(data,ResultInfo.class);

        List<MacInfo> macInfos = new ArrayList<MacInfo>();

        macInfos=resultInfo.getData();

        System.out.println(resultInfo.getId());





        //data.getData().getId()

        //ResultInfo resultInfo=(ResultInfo)data.getData();


    //   System.err.println(data.getData().getLat().toString());

        return;
    }

    @RequestMapping("get")
    public ResultInfo getDate(){



        ResultInfo resultInfo=new ResultInfo();

        resultInfo.setId("id1");

        resultInfo.setLat("120");
        resultInfo.setLon("123");
        resultInfo.setMmac("ASD00");
        resultInfo.setRate("100");
        resultInfo.setTime("2015");

        List<MacInfo> macInfos = new ArrayList<MacInfo>();

        macInfos.add(new MacInfo("mac","ssi","ch","range"));

        macInfos.add(new MacInfo("mac","ssi","ch","range"));

        resultInfo.setData(macInfos);




        return resultInfo;
    }*/

    @RequestMapping("hello")
    public String Hello(){
        System.out.print("ssss");
        return "hello";
    }
}
