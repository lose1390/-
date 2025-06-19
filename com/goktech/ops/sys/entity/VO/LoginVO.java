package com.goktech.ops.sys.entity.VO;

import com.goktech.ops.sys.entity.TPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LoginVO {

    private Long id;
    private String username;
    private String nickName;
    private String email;
    private String phone;
    private String avatar;
    private List<String> role;
    private String address;
    private Integer age;
    private String sex;
    private String createTime;
    private List<TPermission> permission;
}
