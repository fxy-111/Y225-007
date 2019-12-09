package cn.bdqn.domain;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * 体检项目类
 */
public class ItemTypes  {
    private Integer typeId;// INT PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
    private String typeName;// VARCHAR(30) NOT NULL COMMENT'类别名称'

    //查询项目集合
    private List<PeItems> peItems;

    public List<PeItems> getPeItems() {
        return peItems;
    }

    public void setPeItems(List<PeItems> peItems) {
        this.peItems = peItems;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "ItemTypes{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", peItems=" + peItems +
                '}';
    }
}
