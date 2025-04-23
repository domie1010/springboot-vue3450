package com.service;

import java.util.List;

import com.entity.PartsInfo;
import com.util.Result;

public interface PartsInfoService {
	public Result buyParts(String id);
	public Result useParts(String id);
	public Result findAllParts();
}
