package com.heasaima.photo.mapper;

import com.heasaima.photo.mapper.model.PhotoInfo;

import java.util.List;

public interface PhotoInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhotoInfo record);

    int insertSelective(PhotoInfo record);

    PhotoInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhotoInfo record);

    int updateByPrimaryKey(PhotoInfo record);

    List<PhotoInfo> selectPageList(PhotoInfo photoInfo);
}