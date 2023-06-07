package com.sjy.eduplatform.enroll.application.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sjy.eduplatform.enroll.business.service.SysDictService;
import com.sjy.eduplatform.enroll.model.entity.SysDict;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : hechuansheng
 * @date : 2023/6/7 23:18
 * @since : version-1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    @Resource
    private SysDictService sysDictService;

    @Resource
    private ObjectMapper objectMapper;

    @Test
    public void testService() throws JsonProcessingException {
        List<SysDict> dictList = sysDictService.list();

        log.info("sysList: {}", objectMapper.writeValueAsString(dictList));
    }


}
