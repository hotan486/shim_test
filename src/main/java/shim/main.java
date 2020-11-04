package shim;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Jsoup를 이용해서 http://www.cgv.co.kr/movies/ 크롤링
//				String url = "https://lineage.plaync.com/powerbook/wiki/한손검"; //크롤링할 url지정
//				Document doc = null;        //Document에는 페이지의 전체 소스가 저장된다
//
//				try {
//					doc = Jsoup.connect(url).get();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
				Connection.Response response = Jsoup.connect("http://lineage.gamebogam.com/item/duan.asp")
                        .method(Connection.Method.GET)
                        .execute();
				
				Document document = response.parse();

				String html = document.html();
				String text = document.text();
				
				Elements element = document.select("a table:nth-child(5) tbody tr:nth-child(-n+4) td:nth-child(2)");
				System.out.println(element.text());
				
				//select를 이용하여 원하는 태그를 선택한다. select는 원하는 값을 가져오기 위한 중요한 기능이다.
				//Elements element = doc.select("div.sect-movie-chart");    
				
				System.out.println("============================================================");

				//Iterator을 사용하여 하나씩 값 가져오기
				//Iterator<Element> ie1 = element.select("strong.rank").iterator();
				//Iterator<Element> ie2 = element.select("strong.title").iterator();
				
//				Iterator<Element> ie1 = element.select("a.item-grade--7").iterator();
//				Iterator<Element> ie2 = element.select("td.list__option").iterator();
//				        
//				while (ie1.hasNext()) {
//					System.out.println(ie1.next().text()+"\t"+ie2.next().text());
//				}
				
				System.out.println("============================================================");
	}

}
