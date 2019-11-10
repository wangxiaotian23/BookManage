package com.example.bills.model;

import lombok.Data;

/**
 * @Auther: 李清依
 * @Date: 2019/11/9 16:40
 * @Description:
 */
@Data
public class Book {
    private int id;

    private String name;

    private String author;

    private String price;

    /**
     * {@link com.nowcoder.project.model.enums.BookStatusEnum}
     */
    private int status;
}
