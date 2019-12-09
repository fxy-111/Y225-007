package cn.bdqn.service;

import cn.bdqn.domain.ItemTypes;

import java.util.List;

public interface ItemTypesService {

    /**
     * 查询全部项目类型
     * @return
     */
    public List<ItemTypes> queryAll();
}
