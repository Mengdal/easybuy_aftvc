package ied.easy.mapper;

import com.sun.org.apache.xpath.internal.operations.Or;
import ied.easy.bean.Order;
import ied.easy.bean.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by mdh on 2020/3/24.
 */
@Mapper
/**
 * 订单接口
 */
public interface OrderMapper {
    int count(Page<Order> page);
    Order get(Integer id);
    List<Order> findPage(Page<Order> page);

    int delete(Integer id);
    int update(Order order);

}