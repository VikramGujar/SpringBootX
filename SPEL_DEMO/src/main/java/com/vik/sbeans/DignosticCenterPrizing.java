package com.vik.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("dcp")
public class DignosticCenterPrizing {

	@Autowired
	private DignosticCenter dc;
	@Value("${user.name}")
	private String username;
	@Value("${os.name}")
	private String osName;
	@Value("${Path}")
	private String pathData;
	@Value("#{dc.mriPrize + dc.ctScanPrize}")
	private float scanCombo;
	@Value("#{dc.bpTestPrize + dc.dibeticTestPrize }")
	private float testCombo;
}
