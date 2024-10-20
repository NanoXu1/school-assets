package cn.zwz.data.dao.mapper;

import cn.zwz.data.entity.RolePermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * 角色-菜单关系 数据链路层接口
 * @author 郑为中
 */
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

    List<RolePermission> getRolePermissionByRoleId(String roleId);
}
