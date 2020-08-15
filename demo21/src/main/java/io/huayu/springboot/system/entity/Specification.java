package io.huayu.springboot.system.entity;

import java.time.LocalDateTime;
import io.huayu.springboot.framework.common.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 规格
 * </p>
 *
 * @author luyong
 * @since 2020-08-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="Specification对象", description="规格")
public class Specification extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "规格id")
    private String id;

    @ApiModelProperty(value = "规格名称")
    private String name;

    @ApiModelProperty(value = "规格模板id")
    private String tId;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


}
