/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huawei.javamesh.metricserver.dao.influxdb.request;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * Influx DB 查询请求类
 */
@Data
@Builder
public class InfluxQueryRequest {
    private String measurement;

    /**
     * Start and stop values can be relative using negative durations or absolute using timestamps.
     *
     * <p>Example relative time ranges:<p/>
     * <p>  Relative time range with start only. Stop defaults to now.
     * from(bucket:"example-bucket")
     * |> range(start: -1h)<p/>
     *
     * <p>  Relative time range with start and stop
     * from(bucket:"example-bucket")
     * |> range(start: -1h, stop: -10m)<p/>
     *
     *
     * <p>Example absolute time range:<p/>
     * <p>  from(bucket:"example-bucket")
     * |> range(start: 2021-01-01T00:00:00Z, stop: 2021-01-01T12:00:00Z)<p/>
     */
    private String start;
    private String end;

    /**
     * tag筛选条件
     * <p>
     * 仅支持tag1==value1 and tag2==value2 ...这种简单的与逻辑
     */
    private Map<String, String> tags;
}