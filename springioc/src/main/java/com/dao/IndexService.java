package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
    private IndexDao indexDao;

    public IndexService(IndexDao indexDao) {
        this.indexDao = indexDao;
    }

//    public void setIndexDao(IndexDao indexDao) {
//        this.indexDao = indexDao;
//    }

    public void test() {
        indexDao.test();
    }
}
