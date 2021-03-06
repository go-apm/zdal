/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.zdal.common.util;

/**
 * @author ����
 * @version $Id: TableSuffixTypeEnum.java, v 0.1 2014-1-6 ����05:23:35 Exp $
 */
public enum TableSuffixTypeEnum {
    twoColumnForEachDB("twoColumnForEachDB"),
    dbIndexForEachDB("dbIndexForEachDB"),
    groovyTableList("groovyTableList"),
    groovyAdjustTableList("groovyAdjustTableList"),
    groovyThroughAllDBTableList("groovyThroughAllDBTableList"),
    throughAllDB("throughAllDB"),
    resetForEachDB("resetForEachDB");
    
    private String value;

    TableSuffixTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
