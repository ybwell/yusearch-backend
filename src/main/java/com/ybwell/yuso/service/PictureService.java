package com.ybwell.yuso.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ybwell.yuso.model.entity.Picture;

/**
 * 图片服务
 *
 */
public interface PictureService {

    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}
