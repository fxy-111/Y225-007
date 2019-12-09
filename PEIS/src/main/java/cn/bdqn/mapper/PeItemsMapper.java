package cn.bdqn.mapper;


import cn.bdqn.domain.PeItems;

import java.util.List;

public interface PeItemsMapper {

    /**
     * 查询全部
     * @return
     */
    public List<PeItems> selectAll();


    /**
     * 修改
     * @param peItems
     */
    public void updateByPeItems(PeItems peItems);


    /**
     * 添加方法
     * @param peItems
     */
    public void insert(PeItems peItems);

    /**
     * 根据id查询
     * @param typeId
     * @return
     */
    public List<PeItems> selectByTypeId(Integer typeId);

    /**
     * 根据id查询信息
     * @param intemId
     * @return
     */
    public PeItems queryByIntemId(Integer intemId);


    /**
     * 根据id删除
     * @param intemId
     */
    public void deleteByIntemId(Integer intemId);
}
