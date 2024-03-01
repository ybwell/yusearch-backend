package com.ybwell.yuso.controller;

import com.ybwell.yuso.common.BaseResponse;
import com.ybwell.yuso.common.ResultUtils;
import com.ybwell.yuso.manager.SearchFacade;
import com.ybwell.yuso.model.dto.search.SearchRequest;
import com.ybwell.yuso.model.vo.SearchVO;
import com.ybwell.yuso.service.PictureService;
import com.ybwell.yuso.service.PostService;
import com.ybwell.yuso.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private UserService userService;

    @Resource
    private PostService postService;

    @Resource
    private PictureService pictureService;

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }

}
