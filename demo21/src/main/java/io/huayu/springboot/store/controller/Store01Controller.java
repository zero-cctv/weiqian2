package io.huayu.springboot.store.controller;


import io.huayu.springboot.demo.vo.UserMessagesQueryVo;
import io.huayu.springboot.framework.common.api.ApiResult;
import io.huayu.springboot.framework.common.controller.BaseController;
import io.huayu.springboot.store.vo.SpecificationTemplateVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author luyong
 * @since 2020-08-13
 */
@Controller
@RequestMapping("/store")
public class Store01Controller extends BaseController {
    /**
     * 获取规格模板列表
     */

//    @PostMapping("/{id}/norms")
//    @ApiOperation(value = "获取SpecificationTemplate对象详情", notes = "查看用户留言表", response = UserMessagesQueryVo.class)
//    public ApiResult<UserMessagesQueryVo> getSpecificationTemplate(@PathVariable("id") Long id,@Validated @RequestBody HashMap<String,Object> hashMap) throws Exception {
//        System.out.println(hashMap.toString());
//
////        return ApiResult.ok(userMessagesQueryVo);
//        return ApiResult.ok();
//    }
    @PostMapping("/{id}/norms")
    @ResponseBody
//    @ApiOperation(value = "获取SpecificationTemplate对象详情", notes = "查看用户留言表", response = UserMessagesQueryVo.class)
    public ApiResult<UserMessagesQueryVo> getSpecificationTemplate(@PathVariable("id") Long id, @Validated @RequestBody SpecificationTemplateVo specificationTemplateVo) throws Exception {
        System.out.println(specificationTemplateVo.toString());

//        return ApiResult.ok(userMessagesQueryVo);
        return ApiResult.ok();
    }
    @GetMapping("/{id}/norms")
    @ResponseBody
//    @ApiOperation(value = "获取SpecificationTemplate对象详情", notes = "查看用户留言表", response = UserMessagesQueryVo.class)
    public ApiResult<UserMessagesQueryVo> getTemplateList(@PathVariable("id") Long id) throws Exception {


//        return ApiResult.ok(userMessagesQueryVo);
        return ApiResult.ok();
    }
}
