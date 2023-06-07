package com.sjy.eduplatform.enroll.dao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : hechuansheng
 * @date : 2023/6/7 16:17
 * @since : version-1.0
 */
@MapperScan(basePackages = {"com.sjy.eduplatform.enroll.dao.mapper"})
@Configuration
public class MapperScanConfig {
}
