/*
*  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/

package org.wso2.ballerinalang.programfile;

import java.util.Objects;

/**
 * {@code TypeDefInfo} contains metadata of a Ballerina type def entry in the program file.
 *
 * @since 0.971.0
 */
public class TypeDefInfo extends StructureTypeInfo {

    public TypeInfo typeInfo;

    public int typeTag;

    public boolean isLabel;

    public TypeDefInfo(int pkgNameCPIndex, int nameCPIndex, int flags) {
        super(pkgNameCPIndex, nameCPIndex, flags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkgNameCPIndex, nameCPIndex);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof TypeDefInfo && pkgNameCPIndex == (((TypeDefInfo) obj).pkgNameCPIndex)
                && nameCPIndex == (((TypeDefInfo) obj).nameCPIndex);
    }
}
