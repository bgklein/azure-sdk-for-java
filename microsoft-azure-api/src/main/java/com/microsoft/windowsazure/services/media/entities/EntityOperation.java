/**
 * Copyright 2012 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media.entities;

import javax.ws.rs.core.MediaType;

public interface EntityOperation {

    /**
     * Get the URI the creation request should be sent to.
     * 
     * @return The uri
     */
    public abstract String getUri();

    /**
     * Get the MIME type for the content that's being sent to the server.
     * 
     * @return The MIME type
     */
    public abstract MediaType getContentType();

    /**
     * Get the MIME type that we're expecting the server to send back.
     */
    public abstract MediaType getAcceptType();
}