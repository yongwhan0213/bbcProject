package com.bbc.common;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

import com.oreilly.servlet.multipart.FileRenamePolicy;

public class MyFileRenamePolicy implements FileRenamePolicy {

	@Override
	public File rename(File originFile) {
		
		String originName = originFile.getName();	//원본 파일명
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String currentTime = sdf.format(new Date());
		
		int ranNum = (int)(Math.random() * 90000 + 10000);
		
		String ext = originName.substring(originName.lastIndexOf("."));
		
		String fileName = currentTime + ranNum + ext;
		
		File renameFile = new File(originFile.getParent(), fileName);
		
		return renameFile;
	}

}
