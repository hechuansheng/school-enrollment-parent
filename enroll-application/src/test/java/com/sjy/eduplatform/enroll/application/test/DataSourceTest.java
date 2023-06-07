package com.sjy.eduplatform.enroll.application.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : hechuansheng
 * @date : 2023/6/7 21:18
 * @since : version-1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTest {

    @Resource
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement prepareStatement = connection.prepareStatement("select * from sys_dict_item t where t.dict_id = 22"); //----- ①
        ResultSet resultSet = prepareStatement.executeQuery();
        while (resultSet.next()) {
            String itemText = resultSet.getString("item_text");
            log.info("item_text: {}", itemText);
        }
    }

}
