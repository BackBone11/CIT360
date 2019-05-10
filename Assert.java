package org.quickconnectfamily.json.tests;

public class Assert {

	public Assert(boolean isTrue) throws Exception{
		if(!isTrue){
			throw new Exception("Assertion Failure");
		}
	}

}
