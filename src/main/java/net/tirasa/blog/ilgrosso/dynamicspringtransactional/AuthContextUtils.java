/*
 * Copyright (C) 2015 Tirasa
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
package net.tirasa.blog.ilgrosso.dynamicspringtransactional;

public final class AuthContextUtils {

    private static String DOMAIN;

    public static String getDomain() {
        return DOMAIN;
    }

    public static void setDomain(final String domain) {
        DOMAIN = domain;
    }

    private AuthContextUtils() {
        // private constructor for static utility class
    }
}
