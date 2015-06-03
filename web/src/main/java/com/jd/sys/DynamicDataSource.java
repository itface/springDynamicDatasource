package com.jd.sys;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by wangrongtao on 15/6/1.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    protected Object determineCurrentLookupKey() {
        // 在进行DAO操作前，通过上下文环境变量，获得数据源的类型
        return DataSourceContextHolder.getDataSourceType();

    }
}
