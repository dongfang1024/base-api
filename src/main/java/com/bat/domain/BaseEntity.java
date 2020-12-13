package com.bat.domain;

import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = -7195149994467671201L;

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
     @ApiModelProperty(value = "主键")
//    @JSONField(serializeUsing = ToStringSerializer.class)
    protected Long id;

    /** 创建时间 */
    @Column(name = "created_time")
//    @JSONField(name = "create_time", format = "yyyy-MM-dd HH:mm:ss")
     @ApiModelProperty(value = "创建时间")
    protected Date createdTime;

    /** 创建人 */
    @Column(name = "created_by")
//    @JSONField(name = "create_by")
    @ApiModelProperty(value = "创建用户")
    protected String createdBy;

    /** 更新时间 */
    @Column(name = "updated_time")
//    @JSONField(name = "updated_time", format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "修改时间")
    protected Date updatedTime;

    /** 更新人 */
    @Column(name = "updated_by")
//    @JSONField(name = "update_by")
    @ApiModelProperty(value = "修改用户")
    protected String updatedBy ;

    /** 删除标识 */
//    @JSONField(name = "del_flag")
    @Column(name = "del_flag")
    @ApiModelProperty(value = "删除（false: 未删除, true: 已删除）")
    protected Boolean delFlag ;


}
