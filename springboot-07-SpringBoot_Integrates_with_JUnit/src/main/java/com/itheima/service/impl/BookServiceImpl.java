package com.itheima.service.impl;

import com.itheima.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author Mendy
 * @create 2023-07-03 8:56
 */

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service is running....");
    }
}
