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

package io.huayu.springboot.system.convert;

import io.huayu.springboot.system.entity.SysPermission;
import io.huayu.springboot.system.vo.SysPermissionTreeVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * SysPermission类相关转换
 *
 * @author weiqian
 * @date 2019-10-26
 **/
@Mapper
public interface SysPermissionConvert {

    SysPermissionConvert INSTANCE = Mappers.getMapper(SysPermissionConvert.class);

    /**
     * SysPermission对象转换成SysPermissionTreeVo对象
     *
     * @param sysPermission
     * @return
     */
    SysPermissionTreeVo permissionToTreeVo(SysPermission sysPermission);

}
