package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list1 = new ArrayList<Board>();
		List<Board> list2 = new Vector<Board>();
		list1.add(new Board("제목1","내용1","지은이1"));
		list1.add(new Board("제목2","내용2","지은이2"));
		list2.add(new Board("리스트2제목","리스트2내용","리스트2지은이"));
		
	}

}

class Board{
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}