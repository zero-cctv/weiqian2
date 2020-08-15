/*
 * Copyright Huayu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.huayu.springboot.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import io.huayu.springboot.framework.common.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.util.Date;

/**
 * <pre>
 * 系统用户
 * </pre>
 *
 * @author weiqian
 * @since 2020-03-23
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "SysUser对象", description = "系统用户")
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    // TODO 验证分组
    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户名")
    // TODO 验证分组
    @NotBlank(message = "用户名不能为空")
    private String username;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("盐值")
    private String salt;

    @ApiModelProperty("手机号码")
//    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @ApiModelProperty("类型，1：学生，2：学校，3：企业")
    private Integer type;

    @ApiModelProperty("性别，0：女，1：男，默认1")
    private Integer gender;

    @ApiModelProperty("简介")
    private String profile;

    @ApiModelProperty("服务成交总数")
    private Integer service_total;

    @ApiModelProperty("服务成交金额")
    private Integer total_fee;

    @ApiModelProperty("星级")
    private Integer rating;

    @ApiModelProperty("头像")
    private String head;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("状态，0：禁用，1：启用，2：锁定")
    private Integer state;

    @ApiModelProperty("部门id")
    private Long departmentId;

    @ApiModelProperty("角色id")
    private Long roleId;

    @ApiModelProperty("逻辑删除，0：未删除，1：已删除")
    @Null(message = "逻辑删除不用传")
    @TableLogic
    private Integer deleted;

    @ApiModelProperty("版本")
    @Null(message = "版本不用传")
    @Version
    private Integer version;

    @ApiModelProperty("创建时间")
    @Null(message = "创建时间不用传")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @Null(message = "修改时间不用传")
    private Date updateTime;

}
