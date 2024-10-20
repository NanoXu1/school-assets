package cn.zwz.data.serviceimpl;

import cn.zwz.data.dao.mapper.RolePermissionMapper;
import cn.zwz.data.entity.RolePermission;
import cn.zwz.data.service.IRolePermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色-菜单关系 服务层实现
 * @author 郑为中
 */
@Service
public class IRolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements IRolePermissionService {

    @Resource
    private RolePermissionMapper mapper;

    @Override
    public List<RolePermission> getRolePermissionByRoleId(String roleId) {
        return mapper.getRolePermissionByRoleId(roleId);
    }
}
