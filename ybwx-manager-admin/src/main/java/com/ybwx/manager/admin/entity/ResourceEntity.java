package com.ybwx.manager.admin.entity;

import java.util.Date;
import com.ybwx.common.enums.RoleResourceType;
import com.ybwx.common.mysql.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceEntity extends BaseEntity<ResourceEntity> {

    private Long id;
    private Date createdTime;
    private String icon;
    private String identifier;
    private String memo;
    private String name;
    private Long parentId;
    private Long priority;
    private RoleResourceType type;
    private Date updatedTime;
    private String url;

}
