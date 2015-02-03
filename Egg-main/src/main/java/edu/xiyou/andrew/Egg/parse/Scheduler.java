/*
 *Copyright (c) 2015 Andrew-Wang.
 *
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing, software
 *distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *See the License for the specific language governing permissions and
 *limitations under the License.
 */
package edu.xiyou.andrew.Egg.parse;

import edu.xiyou.andrew.Egg.net.CrawlDatum;

/**
 * 存入队列的链接和取出链接的接口
 * Created by andrew on 15-2-2.
 */
public interface Scheduler {
    /**
     * 将一个任务存入队列
     * @param datum
     */
    public void push(CrawlDatum datum);

    /**
     * 取出一个任务
     * @return
     */
    public CrawlDatum pull();
}
