package net.mikesu.fastdfs;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.mikesu.fastdfs.dir.UploadDir;

import org.junit.Test;

public class FastdfsClientTest {
    
    @Test
    public void testFastdfsClient() throws Exception {
        FastdfsClient fastdfsClient = FastdfsClientFactory.getFastdfsClient("FastdfsClient.properties");
        
        URL fileUrl = this.getClass().getResource("/Koala.jpg");
        
//        UploadDir uploadDir = new UploadDir(fastdfsClient);
//        uploadDir.getFiles("E:\\ace-Admin-template");
		File file = new File(fileUrl.getPath());
		String fileId = fastdfsClient.upload(file,"ddddddddddddddddddddddddddd");
		System.out.println("fileId:"+fileId);
//		assertNotNull(fileId);
//		String url = fastdfsClient.getUrl(fileId);
//		assertNotNull(url);
//		System.out.println("url:"+url);
//		Map<String,String> meta = new HashMap<String, String>();
//		meta.put("fileName", file.getName());
//		boolean result = fastdfsClient.setMeta(fileId, meta);
//		assertTrue(result);
//		Map<String,String> meta2 = fastdfsClient.getMeta(fileId);
//		assertNotNull(meta2);
//		System.out.println(meta2.get("fileName"));
//		result = fastdfsClient.delete(fileId);
//		assertTrue(result);
//		fastdfsClient.close();
    }
    
}
