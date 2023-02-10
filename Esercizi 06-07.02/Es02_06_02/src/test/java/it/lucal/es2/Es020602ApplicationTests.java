package it.lucal.es2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.lucal.es2.beans.Pizza;
import it.lucal.es2.beans.Prodotto;
import it.lucal.es2.beans.Topping;
import it.lucal.es2.decorator.MozzarellaDecorator;
import it.lucal.es2.decorator.PomodoroDecorator;

@SpringBootTest
class Es020602ApplicationTests {

	static AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

	@Test
	void testAddOneItem() {

		ctx.scan("it.lucal.es2.beans");
		ctx.refresh();

		Pizza p1 = (Pizza) ctx.getBean(Pizza.class);
		Topping pMargherita = new PomodoroDecorator(new MozzarellaDecorator(p1));
		List<Prodotto> list = new ArrayList<Prodotto>() {
			{
				add(pMargherita);
			}
		};

		assertEquals(list.size(), 1);

		ctx.close();

	}

}
