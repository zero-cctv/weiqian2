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

package io.huayu.springboot.system.controller;

import io.huayu.springboot.framework.common.api.ApiResult;
import io.huayu.springboot.framework.common.controller.BaseController;
import io.huayu.springboot.framework.pagination.Paging;
import io.huayu.springboot.framework.validator.groups.Add;
import io.huayu.springboot.framework.validator.groups.Update;
import io.huayu.springboot.system.entity.SysRole;
import io.huayu.springboot.system.param.sysrole.SysRolePageParam;
import io.huayu.springboot.system.param.sysrole.UpdateSysRolePermissionParam;
import io.huayu.springboot.system.service.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <pre>
 * 系统角色 前端控制器
 * </pre>
 *
 * @author weiqian
 * @since 2020-03-23
 */
@Slf4j
@RestController
@RequestMapping("/sysRole")
@Api("系统角色 API")
public class SysRoleController extends BaseController {


}

