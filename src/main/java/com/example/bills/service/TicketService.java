package com.example.bills.service;

import com.example.bills.dao.TicketDao;
import com.example.bills.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 李清依
 * @Date: 2019/11/9 17:01
 * @Description:
 */
@Service
public class TicketService {
    @Autowired
    private TicketDao ticketDAO;

    public void addTicket(Ticket t){
        ticketDAO.addTicket(t);
    }

    public Ticket getTicket(int uid){
        return ticketDAO.selectByUserId(uid);
    }

    public Ticket getTicket(String t){
        return ticketDAO.selectByTicket(t);
    }

    public void deleteTicket(int tid){
        ticketDAO.deleteTicketById(tid);
    }

    public void deleteTicket(String t){
        ticketDAO.deleteTicket(t);
    }
}
