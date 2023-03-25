package sec05.exam01_TreeSet_method;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		/*
		 * 트리셋은 이진 트리를기반으로 이루어진 컬렉션 Set인터페이스를 구현한 객체이다.
		 * set인터페이스에 대입하여 쓸수 있지만 보통 Treeset은 객체 정렬및 검색을 위해 사용
		 *  그에 특화된 메서드를 사용 하기 위해 Treeset클래스로 직접 생성하여 대입하도록한다.
		 */
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87)); //score.add(87)도 됨 자동박싱
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수"+score);
		score = scores.last();
		System.out.println("가장 높은 점수 "+score);
		
		//왼쪽 노드 --주어진 객체 미포함
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래의 점수 (왼쪽 노드)" + score);
		//오른쪽 노드 --주어진 객체 미포함
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수 (오른쪽 노드)" + score);
		//주어진 객체 포함 바로아래의 점수  -- 주어진 객체 포함
		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래의 점수 " + score);
		System.out.println();
		//주어진 객체 포함 바로위의 점수  -- 주어진 객체 포함
		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수 "+score);
		System.out.println();
		
		//컬렉션에 데이터가 있다면
		while(!scores.isEmpty()) {
			//제일 왼쪽으로 부터 가져온다 가져온후에 treeset에서 제거된다.
			score = scores.pollFirst();
			System.out.println(score+("남은객체수 :"+scores.size()+")"));
		}
		
		while(!scores.isEmpty()) {
			//제일 왼쪽으로 부터 가져온다 가져온후에 treeset에서 제거된다.
			score = scores.pollLast();
			System.out.println(score+("(남은객체수 :"+scores.size()+")"));
		}
		
		//반복자
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			//pollFirst()와 같은 결과를 가져오긴 하지만 차이점은 객체 제거를 하지 않는 다는 것이다.
			//앞에서 말했듯이 명시적으로 remove()를 해줘야 비로소 제거됨을 기억하자.
			int value = iterator.next();
			//iterator.remove();//이렇게 해줘야 객체가 제거됨
			System.out.println(value+("(남은객체수 :"+scores.size()+")"));
		}	
	}
}
