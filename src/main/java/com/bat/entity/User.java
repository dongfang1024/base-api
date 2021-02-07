package com.bat.entity;

import com.bat.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "s_user")
@Entity
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 7369854743161052039L;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("名")
    private String firstName;

    @ApiModelProperty("姓")
    private String lastName;

    @ApiModelProperty("性别")
    private Integer gender;

    @ApiModelProperty("头像地址")
    private String imageUrl;

    @ApiModelProperty("手机号码")
    private String tel;

    @ApiModelProperty("微信账号")
    private String wechatAccount;

    @ApiModelProperty("钉钉账号")
    private String dingTalkAccount;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("备注")
    private String remark;


}
