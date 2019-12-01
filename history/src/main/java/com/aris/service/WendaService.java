package com.aris.service;

import org.springframework.stereotype.Service;

/**
 * Created by aris on 2019/7/10.
 */
@Service
public class WendaService {
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
