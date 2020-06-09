package ied.easy.mapper;


import ied.easy.bean.News;
import ied.easy.bean.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * Created by as on 2020/3/22.
 */
@Mapper
/**
 * 新闻接口
 */
public interface NewsMapper {
    int count(Page<News> page);
    List<News> findPage(Page<News> page);
    News get(Integer id);

    int update(News news);

    // 添加新闻
    int insert(News news);

    /**
     * 根据主键删除新闻信息
     * @param id
     * @return
     */
    int delete(Integer id);
}
