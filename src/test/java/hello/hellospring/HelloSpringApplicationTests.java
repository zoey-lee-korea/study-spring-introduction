package hello.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class HelloSpringApplicationTests {

	/******** to-do list : Optional > Assert 테스트검증 메소드  ********/

	@Test
	void Optional공부() {


		Optional<String> empty = Optional.empty();
		System.out.println("empty.isPresent() : " + empty.isPresent()); // false

		Optional<String> of = Optional.of("zoey");
		System.out.println("notEmpty.isPresent() : " + of.isPresent()); // true

		Optional<String> ofNullable = Optional.of("zoey");
		System.out.println("notEmpty.isPresent() : " + ofNullable.isPresent()); // true

		// Optional객체.isPresent() : Optional이 담고있는 객체가 null인지 아닌지 true/false
		// 만약 Optional.of()의 메서드에 전달된 인수가 null이면 NPE 발생
		// .isEmpty()는 .isPresent()와 반대인 메소드

		String name = null;
		if (name != null){
			System.out.println("name is not null");
		}
		Optional<String> nameOptional = Optional.ofNullable("zoey");
		nameOptional.ifPresent(tmp -> System.out.println(tmp)); // zoey를 print한다

		//https://daddyprogrammer.org/post/1988/java-optional/
		// 위 링크 이어서 해보기



	}

}
