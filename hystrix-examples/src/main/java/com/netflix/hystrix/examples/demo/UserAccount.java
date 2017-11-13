/**
 * Copyright 2012 Netflix, Inc.
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
package com.netflix.hystrix.examples.demo;

/**
 * Simple POJO to represent a user and their metadata.
 */
public class UserAccount {

    private final int userId;
    private final String name;
    private final int accountType;
    private final boolean isFeatureXenabled;
    private final boolean isFeatureYenabled;
    private final boolean isFeatureZenabled;

    /**
     * final成员变量表示常量，只能被赋值一次，赋值后值不再改变。
     * 定义的时候必须赋值，此种用法：在构造方法中赋值；
     *
     * 没有提供setter方法，只有getter方法和构造方法；
     *
     * @param userId
     * @param name
     * @param accountType
     * @param x
     * @param y
     * @param z
     */
    public UserAccount(int userId, String name, int accountType, boolean x, boolean y, boolean z) {
        this.userId = userId;
        this.name = name;
        this.accountType = accountType;
        this.isFeatureXenabled = x;
        this.isFeatureYenabled = y;
        this.isFeatureZenabled = z;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAccountType() {
        return accountType;
    }

    public boolean isFeatureXenabled() {
        return isFeatureXenabled;
    }

    public boolean isFeatureYenabled() {
        return isFeatureYenabled;
    }

    public boolean isFeatureZenabled() {
        return isFeatureZenabled;
    }

}
