package com.heitian.ssm.api.impl;


import com.heitian.ssm.api.AuthTokenAPI;
import com.heitian.ssm.comm.TokenUtil;

public class EasemobAuthToken implements AuthTokenAPI {

	@Override
	public Object getAuthToken(){
		return TokenUtil.getAccessToken();
	}
}
