import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class quiz2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int answer = 0;
		
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = jfc.showOpenDialog(null);
        if(returnVal == 0) {
        	//파일을 읽어서 문자열 배열에 담기('원',쉼표,공백 제거)
    		ArrayList<String> problem = new ArrayList<>();
    		File file = jfc.getSelectedFile();
    		BufferedReader reader = new BufferedReader(new FileReader(file));
    		String str;
    		while((str = reader.readLine()) != null) {
    			str = str.replaceAll("[^\\d]+", "");
    			str = str.strip();
    			problem.add(str);
    		}         
    		reader.close();
    		 
    		for(int i=0; i<problem.size(); i++) {
    			ArrayList<Converter> results = new ArrayList<>();
    			
    			String temp = problem.get(i);
    			int count = 0;	//어절 단위용 변수
    			
    			//뒤에서 부터 4개씩 분리하여 한글로 변환
    			while(temp.length() > 0) {
    				
    				//분리를 위한 인덱스 설정
    				int eIndex = temp.length();
    				int sIndex = eIndex-4;
    				if(sIndex < 0)
    					sIndex = 0;
    				
    				//어절 단위로 분리
    				String split = temp.substring(sIndex,eIndex);
    				int length = split.length()-1;
    				
    				//숫자를 한글로 변환
    				Converter cvt = new Converter();
    				cvt.setUnit(count);
    				for(int j=0; j<=length; j++) {
    					if(split.charAt(j) != '0')
    						cvt.setEmpty(false);
    					cvt.setNumber(split.charAt(j), length-j);
    				}
    				cvt.exception();
    				
    				//다음 어절 준비
    				temp = temp.substring(0,sIndex);
    				count++;
    				
    				//생략이 가능한 경우 리스트에 담지 않음
    				if(cvt.isEmpty())
    					continue;
    				//변환된 한글을 리스트에 담음
    				results.add(cvt);
    			}
    			
    			//한글읽기 추출 및 어절, 한글 개수 측정
    			String result = "";
    			int word = 0;
    			int hangle = 0;
    			for(int j=results.size()-1; j>=0; j--) {
    				result += results.get(j);
    				if(j!=0) 
    					result += " ";
    				
    				hangle += results.get(j).toString().length();
    				word++;
    			}
    			
    			if(!result.contains("원")) {
    				result+="원";
    				hangle++;
    			}
    			answer += word*hangle;
    		}
    		
    		System.out.println(answer);
        }
        else
        {
            System.out.println("파일 열기를 취소하였습니다.");
        }
	}
}
