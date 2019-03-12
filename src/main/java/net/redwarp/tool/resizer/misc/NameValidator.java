/*
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
 *
 * Copyright 2013-2015 Redwarp
 */

package net.redwarp.tool.resizer.misc;

/**
 * User: benoit.vermont@airtag.com
 * Date: 28/10/14
 * Time: 19:09
 */
public class NameValidator {
    public static boolean isFilenameValid(String filename) {
        String lowerCaseName = filename.toLowerCase();
        return (lowerCaseName.endsWith(".png") || lowerCaseName.endsWith(".jpg") || lowerCaseName.endsWith(".jpeg"));
    }
}
