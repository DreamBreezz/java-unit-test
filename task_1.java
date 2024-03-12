@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
	assertEquals("Тест упал: true если пользователю меньше 18 или false, если 18+", expected, isAdult); // Напиши код здесь
}
