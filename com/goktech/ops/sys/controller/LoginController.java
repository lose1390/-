package com.goktech.ops.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.goktech.ops.sys.dao.ITPermissionService;
import com.goktech.ops.sys.dao.ITRoleService;
import com.goktech.ops.sys.dao.ITUserService;
import com.goktech.ops.sys.entity.VO.LoginVO;
import com.goktech.ops.sys.entity.param.LoginParam;
import com.goktech.ops.sys.entity.TRole;
import com.goktech.ops.sys.entity.TUser;
import com.goktech.ops.sys.entity.base.R;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private ITUserService userService;
    @Autowired
    private ITPermissionService permissionService;
    @Autowired
    private ITRoleService roleService;

    @RequestMapping("/api/user/login")
    public R<LoginVO> login(@RequestBody LoginParam param) {
        TUser user = userService.getOne(new QueryWrapper<TUser>()
                .eq("username", param.getUsername())
                .eq("password", param.getPassword())
        );
        if (user == null) {
            return R.fail("用户名或密码错误");
        }
        LoginVO loginVO = new LoginVO();
        BeanUtils.copyProperties(user, loginVO);
        // 给登录角色菜单权限
        loginVO.setPermission(permissionService.list());
        // 给登录角色名称
        List<String> roleName = new ArrayList<>();
        String[] roleIds = user.getRole().replace("[", "").replace("]", "").split(",");
        for (String roleId : roleIds) {
            TRole role = roleService.getById(roleId);
            if (role != null) {
                roleName.add(role.getName());
            }
        }
        loginVO.setRole(roleName);
        return R.success(loginVO);
    }
}
