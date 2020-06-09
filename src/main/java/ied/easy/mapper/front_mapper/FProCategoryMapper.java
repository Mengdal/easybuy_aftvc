package ied.easy.mapper.front_mapper;

import ied.easy.bean.Page;
import ied.easy.bean.ProCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by mdh on 2020/3/28.
 */
@Mapper
public interface FProCategoryMapper {
    List<ProCategory> findPage(Page<ProCategory> page);
    int count(Page<ProCategory> page);
    ProCategory get(Integer id);
}
