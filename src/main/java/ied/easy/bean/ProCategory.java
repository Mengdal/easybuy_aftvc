package ied.easy.bean;

/**
 * Created by mdh on 2020/3/22.
 */
//商品类别
public class ProCategory {
    //商品id
    private Integer id;
    //商品名称
    private String epc_name;
    //商品父id
    private Integer epc_parent_id;
    //商品等级
    private Integer level;
    //商品路径
    private String path;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEpc_name() {
        return epc_name;
    }

    public void setEpc_name(String epc_name) {
        this.epc_name = epc_name;
    }

    public Integer getEpc_parent_id() {
        return epc_parent_id;
    }

    public void setEpc_parent_id(Integer epc_parent_id) {
        this.epc_parent_id = epc_parent_id;
    }

    @Override
    public String toString() {
        return "ProCategory{" +
                "id=" + id +
                ", epc_name='" + epc_name + '\'' +
                ", epc_parent_id=" + epc_parent_id +
                ", level=" + level +
                ", path='" + path + '\'' +
                '}';
    }
}
