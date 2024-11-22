package algorithm;

//선형검색, 순차검색
//정렬되지 않은 배열에서 검색할 때 사용하는 유일한 방법
//배열에서 값이 '둘리'인 원소의 인덱스 추출
public class Ex10_linearSearch_1{

  public static int linearSearch(String[] friends){
    
    int idx = 0;

    while(true){
      
      if(idx==friends.length) return -1;//종료조건1 : 검색실패

      if(friends[idx]=="둘리") return idx;//종료조건2: 검색성공

      idx++;

    }

  }

  public static void main(String[] args) {
    String[] friends = new String[]{"또치", "도우너", "둘리", "마이콜", "하니"};

    int idx = linearSearch(friends);

    String result = "";

    if(idx!=-1){
      result = String.format("배열에서 값이 '둘리'인 원소의 인덱스는 %d", idx);
    }else{
      result = "배열에서 값이 '둘리'인 원소가 없습니다.";
    }

    System.out.println(result); 
  }
}