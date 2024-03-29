package com.so.smorphia.core;

import org.junit.Assert;
import org.junit.Test;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
/**
* Copyright (C) 2010 SarathOnline.com.
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


public class MongoTest extends Assert{
	@Test
	public void testMongoBasic() throws Exception {
		Mongo m = new Mongo();

		DB db = m.getDB("sar");
		DBCollection col = db.getCollection("props");
		DBObject jo = BasicDBObjectBuilder.start().add("_id", 3).add("etag", System.currentTimeMillis()).get();
		col.save(jo);
	}
}
