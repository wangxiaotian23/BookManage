package com.example.bills.utils;

import com.example.bills.model.Ticket;
import org.joda.time.DateTime;

/**
 * @Auther: 李清依
 * @Date: 2019/11/10 09:00
 * @Description:
 */
public class TicketUtils {
    public static Ticket next(int uid){

        Ticket ticket = new Ticket();
        ticket.setTicket(UuidUtils.next());
        ticket.setUserId(uid);
        //设置t票过期时间
        DateTime expiredTime = new DateTime();
        expiredTime = expiredTime.plusMonths(3);
        ticket.setExpiredAt(expiredTime.toDate());

        return ticket;
    }
}
