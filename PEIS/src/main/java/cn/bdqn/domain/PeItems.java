package cn.bdqn.domain;


public class PeItems {

    private Integer intemId;// INT PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
    private String  intemName;// VARCHAR(30) NOT NULL COMMENT'项目名称',
    private Integer typeId;// INT NOT NULL COMMENT'项目类别主键',
    private Integer necessary;// INT  COMMENT'是否必查',
    private String  ref;// VARCHAR(20) COMMENT'参考值',
    private Double price;// DOUBLE NOT NULL COMMENT'价格',
    private String  info;// VARCHAR(50) COMMENT'说明'

    private ItemTypes itemTypes;

    public ItemTypes getItemTypes() {
        return itemTypes;
    }

    public void setItemTypes(ItemTypes itemTypes) {
        this.itemTypes = itemTypes;
    }

    public Integer getIntemId() {
        return intemId;
    }

    public void setIntemId(Integer intemId) {
        this.intemId = intemId;
    }

    public String getIntemName() {
        return intemName;
    }

    public void setIntemName(String intemName) {
        this.intemName = intemName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getNecessary() {
        return necessary;
    }

    public void setNecessary(Integer necessary) {
        this.necessary = necessary;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "PeItems{" +
                "intemId=" + intemId +
                ", intemName='" + intemName + '\'' +
                ", typeId=" + typeId +
                ", necessary=" + necessary +
                ", ref='" + ref + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", itemTypes=" + itemTypes +
                '}';
    }
}
