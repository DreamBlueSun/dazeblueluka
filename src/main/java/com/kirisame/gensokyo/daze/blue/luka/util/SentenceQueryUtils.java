package com.kirisame.gensokyo.daze.blue.luka.util;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.EntityKindPropertiesValue;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.EntityKindPropertiesValueExample;
import com.kirisame.gensokyo.daze.blue.luka.mapper.EntityKindPropertiesValueMapper;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/19 14:27
 */

public class SentenceQueryUtils {

    private static EntityKindPropertiesValueMapper valueMapper = SpringUtils.getBean(EntityKindPropertiesValueMapper.class);


    public static String name(String id) {
        final String properties = "name";
        String name = null;
        try {
            EntityKindPropertiesValueExample example = new EntityKindPropertiesValueExample();
            example.createCriteria().andEntityIdEqualTo(id);
            List<EntityKindPropertiesValue> valueList = valueMapper.selectByExample(example);
            for (EntityKindPropertiesValue value : valueList) {
                if (StringUtils.equals(properties, value.getPropertiesName())) {
                    name = value.getPropertiesValue();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

    public static String propertiesValue(String[] parameters) {
        String value = null;
        try {
            EntityKindPropertiesValueExample example = new EntityKindPropertiesValueExample();
            example.createCriteria().andEntityIdEqualTo(parameters[0]);
            List<EntityKindPropertiesValue> valueList = valueMapper.selectByExample(example);
            for (EntityKindPropertiesValue propertiesValue : valueList) {
                if (StringUtils.equals(parameters[1], propertiesValue.getPropertiesName())) {
                    value = propertiesValue.getPropertiesValue();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

}
