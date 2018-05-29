package com.mr.realm;

import com.mr.model.User;
import com.mr.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 安晓 on 2018/5/25.
 */
public class MyRealm extends AuthorizingRealm{

    @Autowired
    private LoginService loginService;

    @Override
    public String getName() {
        return super.getName();
    }

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        User user = (User)principal.getPrimaryPrincipal();
        //权限
        List<String> permission = loginService.selectPermissionByUserId(user.getId());
        //角色
        List<String> role = loginService.selectRoleByUserId(user.getId());
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(permission);
        info.addRoles(role);
        return info;
    }

    //认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username =(String) token.getPrincipal();
        User user=loginService.selectByUserName(username);
        if(user==null)
        {
            return null;
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(user,user.getPassword(), ByteSource.Util.bytes(username),getName());
        return simpleAuthenticationInfo;
    }

    //清除缓存，修改角色和权限之后，需要手动清除
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }
}
