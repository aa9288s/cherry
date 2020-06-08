package com.cherry.cloud.orm.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface Repository<T> extends Mapper<T>, MySqlMapper<T> {
}
