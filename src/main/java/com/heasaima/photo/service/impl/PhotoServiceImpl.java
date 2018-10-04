package com.heasaima.photo.service.impl;

import com.heasaima.photo.mapper.PhotoInfoMapper;
import com.heasaima.photo.mapper.model.PhotoInfo;
import com.heasaima.photo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoInfoMapper photoInfoMapper;

    @Override
    public int insert(PhotoInfo photoInfo) {
        return photoInfoMapper.insert(photoInfo);
    }

    @Override
    public List<PhotoInfo> queryList(PhotoInfo photoInfo) {
        return photoInfoMapper.selectPageList(photoInfo);
    }

    @Override
    public PhotoInfo selectByPrimaryKey(Integer id) {
        return photoInfoMapper.selectByPrimaryKey(id);
    }
}
