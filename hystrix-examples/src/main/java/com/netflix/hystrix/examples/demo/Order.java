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

import java.net.HttpCookie;

/**
 * POJO 
 */
public class Order {

    /**
     * fianl 修饰变量，则该变量不可以改变；并且必须被初始化，或者在构造方法中初始化；
     * final 修饰对象，则该对象不能再派生出新的子类，
     * final 修饰方法，则方法只能使用，不能重载；
     */
    private final int orderId;
    private UserAccount user;

    public Order(int orderId) {
        this.orderId = orderId;

        /* a contrived example of calling GetUserAccount again */
        user = new GetUserAccountCommand(new HttpCookie("mockKey", "mockValueFromHttpRequest")).execute();
    }

}
