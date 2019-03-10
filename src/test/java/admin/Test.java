package admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Timer;
import java.util.TimerTask;

import org.json.JSONObject;

public class Test {
	public static int num =0;
	public static void main(String[] arg) throws IOException {
		//writerDemo();
		//readDemo();
//		timerDa();
		String pathname ="/Users/lihui/eclipse-workspace/admin/src/main/webapp/WEB-INF/config/config.json";
		String data = readFile(pathname);
		try {
			JSONObject jsonObject = new JSONObject(data);
			System.out.println(jsonObject.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void timerDa() {
		final Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				num++;
				System.out.println(num);
				if(num == 5) {
					timer.cancel();
				}
				
			}
		};
		timer.scheduleAtFixedRate(timerTask, 5000, 3000);
	}
	
	public static void writerDemo() {
		BufferedWriter bw = null;
		try {
			String dir = "/Users/lihui/java/111";
			File dirFile = new File(dir);
			if (!dirFile.exists()) {
				dirFile.mkdirs();
			}
			File file = new File(dir+ "/word.txt");
			if (!file.exists()) {
				file.createNewFile();
			}else {
				file.delete();
				file.createNewFile();
				
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			bw.write("{'name':'lihui','age':'18'}");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void readDemo() {
		String pathname ="/Users/lihui/eclipse-workspace/admin/src/main/webapp/WEB-INF/config/config.json";
		File file = new File(pathname);
		String data = "";
		if(!file.exists()) {
			return;
		}
		try {
			
			FileReader rFileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(rFileReader);
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				data += line;
				
			}
			
			rFileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
private  static String readFile ( String path ) throws IOException {
		
		StringBuilder builder = new StringBuilder();
		
		try {
			
			InputStreamReader reader = new InputStreamReader( new FileInputStream( path ), "UTF-8" );
			BufferedReader bfReader = new BufferedReader( reader );
			
			String tmpContent = null;
			
			while ( ( tmpContent = bfReader.readLine() ) != null ) {
				builder.append( tmpContent );
			}
			
			bfReader.close();
			
		} catch ( UnsupportedEncodingException e ) {
			// 忽略
		}
		
		return builder.toString();
		
	}
	


}
