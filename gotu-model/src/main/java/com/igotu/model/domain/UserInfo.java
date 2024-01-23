package com.igotu.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {
    @TableId
    private Long id;
    private Integer age; //年龄
    private String gender; //性别
    private String city; //城市
    private Long grade; //年级ID 高一
    private Long school; //学校ID
    private String user_name; //真实姓名
    private Long avatar; //头像ID
    private Integer isPhone; // 0表示FALSE，1表示TRUE
    private Integer isFacial; // 0表示FALSE，1表示TRUE
    private Integer isWechat; // 0表示FALSE，1表示TRUE
}
