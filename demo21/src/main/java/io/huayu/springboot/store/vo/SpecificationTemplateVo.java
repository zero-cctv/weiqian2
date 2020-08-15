package io.huayu.springboot.store.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.huayu.springboot.framework.common.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * <p>
 * 规格模板
 * </p>
 *
 * @author luyong
 * @since 2020-08-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SpecificationTemplate对象", description="规格模板")
public class SpecificationTemplateVo extends BaseEntity {

    @ApiModelProperty(value = "规格模板名称")
    private String s_name;
    @ApiModelProperty(value = "规格列表")
    private ArrayList<norms> array;




}
