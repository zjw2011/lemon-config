///*
// * Copyright 2017-2019 Lemonframework Group Holding Ltd.
// *
// *  Licensed under the Apache License, Version 2.0 (the "License");
// *  you may not use this file except in compliance with the License.
// *  You may obtain a copy of the License at
// *
// *       http://www.apache.org/licenses/LICENSE-2.0
// *
// *  Unless required by applicable law or agreed to in writing, software
// *  distributed under the License is distributed on an "AS IS" BASIS,
// *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// *  See the License for the specific language governing permissions and
// *  limitations under the License.
// */
//
//package org.lemonframework.config.sample;
//
//import java.util.concurrent.Executor;
//
//import com.alibaba.nacos.api.config.listener.Listener;
//import org.lemonframework.config.Configuration;
//import org.lemonframework.config.ConfigurationFactory;
//
///**
// * lemon-config-parent.
// *
// * @author jiawei
// * @since 1.0.0
// */
//public class DemoListener implements Listener {
//
//    private static final Configuration<Listener> configuration = ConfigurationFactory.getInstance();
//
//    @Override
//    public Executor getExecutor() {
//        return null;
//    }
//
//    @Override
//    public void receiveConfigInfo(String configInfo) {
//        System.out.println(configInfo);
//        TestAfter.afterData();
//    }
//}
