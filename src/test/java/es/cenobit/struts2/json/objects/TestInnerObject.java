/**
 * Copyright 2014 Cenobit Technologies Inc. http://cenobit.es/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package es.cenobit.struts2.json.objects;

public class TestInnerObject {
    public String field1 = "Java";
    public String field2 = "Struts2";
    public String field3 = "Json";
    public TestInnerRelationship1Object relationship1 = new TestInnerRelationship1Object();
    public TestInnerRelationship2Object relationship2 = new TestInnerRelationship2Object();

    @SuppressWarnings("unused")
    private static class TestInnerRelationship1Object {
        public String java = "field1";
        public String field2 = "Struts2";
        public String json = "field3";
    }

    @SuppressWarnings("unused")
    private static class TestInnerRelationship2Object {
        public String java = "field1";
        public String field2 = "Struts2";
        public String json = "field3";
        public TestInnerRelationship1Object relationship1 = new TestInnerRelationship1Object();
    }
}
