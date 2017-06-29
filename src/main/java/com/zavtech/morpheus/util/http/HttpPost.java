/**
 * Copyright (C) 2014-2017 Xavier Witdouck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zavtech.morpheus.util.http;

import java.util.Optional;

/**
 * An HttpRequest extension for performing HTTP POST
 *
 * @param <T>   the type produced by this request
 *
 * @author Xavier Witdouck
 *
 * <p><strong>This is open source software released under the <a href="http://www.apache.org/licenses/LICENSE-2.0">Apache 2.0 License</a></strong></p>
 */
public class HttpPost<T> extends HttpRequest<T> {

    private byte[] content;

    /**
     * Constructor
     */
    HttpPost() {
        super(HttpMethod.POST);
    }


    @Override
    public Optional<byte[]> getContent() {
        return Optional.ofNullable(content);
    }

    /**
     * Sets the content for this request
     * @param content   the content for this requesy
     */
    public void setContent(byte[] content) {
        this.content = content;
        this.setContentLength(content.length);
    }
}
