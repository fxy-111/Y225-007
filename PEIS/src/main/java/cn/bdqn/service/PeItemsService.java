package cn.bdqn.service;

import cn.bdqn.domain.PeItems;

import java.util.List;

public interface PeItemsService {

    /**
     * 查询全部
     * @return
     */
    public List<PeItems> queryAll();


    /**
     * 修改
     * @param peItems
     */
    public void updateByPeItems(PeItems peItems);


    /**
     * 添加方法
     * @param peItems
     */
    public void save(PeItems peItems);


    /**
     * 根据id查询
     * @param typeId
     * @return
     */
    public List<PeItems> queryByTypeId(Integer typeId);



    /**
     * 根据id查询信息
     * @param intemId
     * @return
     */
    public PeItems queryByIntemId(Integer intemId);

    /**
     * 删除
     * @param intemId
     */
    public void deleteByIntemId(Integer intemId);
}
