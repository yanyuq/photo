package com.heasaima.photo.service;

import com.heasaima.photo.mapper.model.PhotoInfo;

import java.util.List;

public interface PhotoService {
    int insert(PhotoInfo photoInfo);

    List<PhotoInfo> queryList(PhotoInfo photoInfo);

    PhotoInfo selectByPrimaryKey(Integer id);

}
