package MyProjects;

import java.util.Scanner;
import java.lang.*;

public class Main {

	public static void main(String[] args) { //начало проги
		/*Считываем имя*/
		Scanner wd = new Scanner(System.in);
		String name = wd.nextLine();
		/*Реверс имени*/
		StringBuffer strBuffer = new StringBuffer(name);
		strBuffer.reverse();
		System.out.println(strBuffer.toString()); //Выводим имя наоборот
		Scanner in = new Scanner(System.in); //считываем возраст
		int age = in.nextInt(); //ввод возраста
		if (age < 0) { // проверяем условие если age<0
			System.out.println("Возраст не может быть отрицательным"); //Если да, то выводим этот текст
		}
		if (age >= 0 && age < 18) { //Если предыдущее условие не выполняется, проверяем условие age>=0 и age<18
			System.out.println("Делай уроки"); //Если да, то выводим строку с фразой
		} else {
			/*Если два предыдущих условия не выполняются,
			то выводим на экран эти слова*/
			System.out.println("Езжай в Польшу на клубнику");
		}
		int count = 5; //нужно найти максимальное и минимальное среди 5 чисел
		double max = -100;
		double min = 100;
		while (count > 0) { //начало цикла
			/*Считываем число*/
			Scanner dou  = new Scanner(System.in);
			double num = in.nextDouble();
			if (num > max) { //проверяем условие num>max
				max = num; //если истина, то максимальному значению присваивается значение num
			} if (num<min) { //проверяем условие num<min
				min=num; //если истина, то минимальному значению присваивается значение num
			}
			count = count - 1;
		}
		/*Выводим на экран максимальное
		 и минимальное значение*/
		System.out.print(max + "\n");
		System.out.print(min);
	}
}