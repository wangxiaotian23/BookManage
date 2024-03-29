package com.example.bills.dao;

import com.example.bills.model.Ticket;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: 李清依
 * @Date: 2019/11/9 16:48
 * @Description:
 */
@Mapper
public interface TicketDao {
    String table_name = " ticket ";
    String insert_field = " user_id, ticket, expired_at ";
    String select_field = " id, " + insert_field;

    @Insert({"insert into", table_name, "(", insert_field,
            ") values (#{userId},#{ticket},#{expiredAt})"})
    int addTicket(Ticket ticket);

    @Select({"select", select_field, "from", table_name, "where user_id=#{uid}"})
    Ticket selectByUserId(int uid);

    @Select({"select", select_field, "from", table_name, "where ticket=#{t}"})
    Ticket selectByTicket(String t);

    @Delete({"delete from", table_name, " where id=#{tid}"})
    void deleteTicketById(int tid);

    @Delete({"delete from", table_name, " where ticket=#{t}"})
    void deleteTicket(String t);
}
