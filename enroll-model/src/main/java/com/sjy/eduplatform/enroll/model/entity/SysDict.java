package com.sjy.eduplatform.enroll.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 公共字典表
 * </p>
 *
 * @author hechuansheng
 * @since 2023-06-08 02:08:35
 */
@Getter
@Setter
@TableName("sys_dict")
@ApiModel(value = "SysDict对象", description = "公共字典表")
public class SysDict extends Model<SysDict> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("字典名称")
    @TableField("dict_name")
    private String dictName;

    @ApiModelProperty("字典编码")
    @TableField("dict_code")
    private String dictCode;

    @ApiModelProperty("描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("删除状态")
    @TableField("del_flag")
    private Integer delFlag;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
