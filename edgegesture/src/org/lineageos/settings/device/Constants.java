/*
 * Copyright (C) 2016 The CyanogenMod Project
 *           (C) 2017-2018 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lineageos.settings.device;

import org.lineageos.internal.util.FileUtils;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    // Preference keys
    public static final String EDGE_GESTURE_KEY = "edge_gesture";

    // Nodes
    public static final String EDGE_GESTURE_PATH = "/sys/devices/soc.0/f9924000.i2c/i2c-2/2-0070/input/input1/edge_mode";

    // Holds <preference_key> -> <proc_node> mapping
    public static final Map<String, SwitchPreferenceBackend> sBackendsMap = new HashMap<>();

    static {
        sBackendsMap.put(EDGE_GESTURE_KEY,
                new SwitchPreferenceFilesBackend(EDGE_GESTURE_PATH));
    }
}
