package cn.bdqn.mapper;

import cn.bdqn.domain.ItemTypes;

import java.util.List;

public interface ItemTypesMapper {


    /**
     * 查询全部项目类型
     * @return
     */
    public List<ItemTypes> selectAll();

}
