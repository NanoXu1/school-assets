package cn.zwz.data.service;

import cn.zwz.data.entity.RolePermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 角色-菜单关系 服务层接口
 * @author 郑为中
 */
public interface IRolePermissionService extends IService<RolePermission> {

    List<RolePermission> getRolePermissionByRoleId(String roleId);

}
