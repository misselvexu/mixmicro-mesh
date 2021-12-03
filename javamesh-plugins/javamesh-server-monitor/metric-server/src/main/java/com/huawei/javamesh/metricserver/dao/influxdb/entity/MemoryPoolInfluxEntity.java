/*
 * Copyright (C) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.javamesh.metricserver.dao.influxdb.entity;

import com.influxdb.annotations.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Memory Pool Influxdb持久化实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class MemoryPoolInfluxEntity extends CommonMetricInfluxEntity {

    @Column(name = "init")
    private Long init;

    @Column(name = "max")
    private Long max;

    @Column(name = "used")
    private Long used;

    @Column(name = "committed")
    private Long committed;
}
