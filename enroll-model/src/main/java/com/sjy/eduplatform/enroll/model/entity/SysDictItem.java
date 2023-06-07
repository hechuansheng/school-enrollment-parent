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
 * 公共字典选项表
 * </p>
 *
 * @author hechuansheng
 * @since 2023-06-08 02:08:35
 */
@Getter
@Setter
@TableName("sys_dict_item")
@ApiModel(value = "SysDictItem对象", description = "公共字典选项表")
public class SysDictItem extends Model<SysDictItem> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("字典id")
    @TableField("dict_id")
    private String dictId;

    @ApiModelProperty("字典项文本")
    @TableField("item_text")
    private String itemText;

    @ApiModelProperty("字典项值")
    @TableField("item_value")
    private String itemValue;

    @ApiModelProperty("描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("排序")
    @TableField("sort_order")
    private Integer sortOrder;

    @ApiModelProperty("状态（1启用 0不启用）")
    @TableField("status")
    private Integer status;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
