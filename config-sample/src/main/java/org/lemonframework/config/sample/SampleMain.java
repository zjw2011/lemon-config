/*
 * Copyright 2017-2019 Lemonframework Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.lemonframework.config.sample;

import com.alibaba.fastjson.JSONObject;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigSyntax;

/**
 * lemon-config-parent.
 *
 * @author jiawei
 * @since 1.0.0
 */
public class SampleMain {

//    private static final String dataId = "aa";
//    private static final Configuration<Listener> configuration = ConfigurationFactory.getInstance();
//    private static final Config config = ConfigFactory.parseString(configuration.getConfig(dataId), ConfigParseOptions.defaults());

//    static {
//        configuration.addConfigListener(dataId, new DemoListener());
//    }

    public static void main(String[] args) {
        final ConfigParseOptions options = ConfigParseOptions.defaults();
//        final Config config = ConfigFactory.parseString(configuration.getConfig(dataId), options);
//        System.out.println(config.getString("aa.dd.fff"));

        JSONObject obj = new JSONObject();
        obj.put("aa", new JSONObject().fluentPut("dd", new JSONObject().fluentPut("fff", "123456")));
        obj.put("bb", "ccccc");
        System.out.println(obj.toJSONString());
        final ConfigParseOptions newOptions = options.setSyntax(ConfigSyntax.CONF);
        final Config config = ConfigFactory.parseString(obj.toJSONString(), newOptions);
        System.out.println(config.getString("aa.dd.fff"));

    }

}
