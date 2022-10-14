/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.travels;

import java.util.Map;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "ChildrenHandling", processName = "intrare_auto_cle")
public class Intrare_auto_cle_17_TaskInput {

    public static Intrare_auto_cle_17_TaskInput fromMap(Map<String, Object> params) {
        Intrare_auto_cle_17_TaskInput item = new Intrare_auto_cle_17_TaskInput();
        item.intrareCLE = (org.acme.travels.IntrareCLE) params.get("intrareCLE");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.acme.travels.IntrareCLE intrareCLE;

    public org.acme.travels.IntrareCLE getIntrareCLE() {
        return intrareCLE;
    }

    public void setIntrareCLE(org.acme.travels.IntrareCLE intrareCLE) {
        this.intrareCLE = intrareCLE;
    }
}
// Task input for user task 'Inregistrare auto' in process 'intrare_auto_cle'
