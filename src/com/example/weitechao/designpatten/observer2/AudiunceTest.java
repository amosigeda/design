package com.example.weitechao.designpatten.observer2;

/*吃瓜群众 结果的享用者*/
public class AudiunceTest {
  public AudiunceTest(){
  }
  
  public static void main(String[] args) {
	Singer sing=new Singer();
	//两个记者进入花园(也就是两个观察者订阅主体)
	Reporter normalReporter1 = new Reporter();
	Reporter movieReporter2 = new Reporter();
	
	sing.registReporter(normalReporter1);
	sing.registReporter(movieReporter2);
	
	sing.haveNormalNews("一口气吃了20个苹果");
	normalReporter1.havaNormalNews();
	
	sing.haveMoviceNews("做20个深蹲！");
	movieReporter2.haveMovieNews();
	
}
}
