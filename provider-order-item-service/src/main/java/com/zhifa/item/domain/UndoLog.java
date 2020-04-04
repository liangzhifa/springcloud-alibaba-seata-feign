package com.zhifa.item.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "undo_log")
public class UndoLog implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "branch_id")
    private Long branchId;

    @TableField(value = "xid")
    private String xid;

    @TableField(value = "context")
    private String context;

    @TableField(value = "rollback_info")
    private byte[] rollbackInfo;

    @TableField(value = "log_status")
    private Integer logStatus;

    @TableField(value = "log_created")
    private Date logCreated;

    @TableField(value = "log_modified")
    private Date logModified;

    @TableField(value = "ext")
    private String ext;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_BRANCH_ID = "branch_id";

    public static final String COL_XID = "xid";

    public static final String COL_CONTEXT = "context";

    public static final String COL_ROLLBACK_INFO = "rollback_info";

    public static final String COL_LOG_STATUS = "log_status";

    public static final String COL_LOG_CREATED = "log_created";

    public static final String COL_LOG_MODIFIED = "log_modified";

    public static final String COL_EXT = "ext";
}