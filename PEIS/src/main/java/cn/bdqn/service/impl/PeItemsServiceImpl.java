package cn.bdqn.service.impl;

import cn.bdqn.domain.PeItems;
import cn.bdqn.mapper.PeItemsMapper;
import cn.bdqn.service.PeItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("peItemsService")
public class PeItemsServiceImpl implements PeItemsService {

    @Autowired
    private PeItemsMapper peItemsMapper;

    @Override
    public List<PeItems> queryAll() {
        return peItemsMapper.selectAll();
    }

    @Override
    public void updateByPeItems(PeItems peItems) {

        peItemsMapper.updateByPeItems(peItems);
    }

    @Override
    public void save(PeItems peItems) {
        peItemsMapper.insert(peItems);
    }

    @Override
    public List<PeItems> queryByTypeId(Integer typeId) {
        return peItemsMapper.selectByTypeId(typeId);
    }

    @Override
    public PeItems queryByIntemId(Integer intemId) {
        return peItemsMapper.queryByIntemId(intemId);
    }

    @Override
    public void deleteByIntemId(Integer intemId) {
        peItemsMapper.deleteByIntemId(intemId);
    }
}
