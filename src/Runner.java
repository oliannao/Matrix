package by.htp.matrixfitst;

public class Runner {

	public static void main(String[] args) {
		/*
		 * ќбъ€вить массив целых чисел размерностью 21: // 1 вывести все чЄтные элементы
		 * на экран // 2 помен€ть местами 5 и 18
		 * 
		 * // удалить каждый 8 элемент // вывести на экран оставшиес€ эелементы массива
		 * // добавить в 5 позицию массива новый элемент
		 */

		int[] array = new int[21];
		creatArray(array);
		showArray(array);
		showEtiamNumber(array);
		changeNumber(array);
		showArray(array);

		int[] array1 = deleteEightNumber(array);
		showArray(array1);
		int[] array2 = addFiveNumber(array1);
		showArray(array2);
	}

	public static void creatArray(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10);
		}

	}

	public static void showArray(int[] mas) {
		System.out.println("Array:");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println(" ");
	}

	public static void showEtiamNumber(int[] mas) {
		System.out.println("Etiam Number: ");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				System.out.print(mas[i] + " ");
			}
		}
		System.out.println(" ");
	}

	public static void changeNumber(int[] mas) {
		System.out.println("Change 5th and 18th");
		int indexfirst = 5;
		int indexnext = 18;
		int first = mas[0];
		int next = mas[1];

		for (int i = 0; i < mas.length; i++) {
			if (i == indexfirst) {
				first = mas[i];
				System.out.println("5th=" + first);
			}
			if (i == indexnext) {
				next = mas[i];
				System.out.println("18th=" + next);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			if (i == indexfirst) {
				mas[i] = next;
				System.out.println("5th==" + next);
			}
			if (i == indexnext) {
				mas[i] = first;
				System.out.println("18th=" + first);
			}

		}

	}

	public static int[] deleteEightNumber(int[] mas) {
		System.out.println("Delete 8th element");
		int numberIter = mas.length / 8;
		System.out.println(numberIter);
		int[] masSecond = new int[mas.length - numberIter];

		int y = 0;
		for (int i = 1; i <= mas.length; i++) {
			if ((i) % 8 != 0 || (i) == 0) {
				masSecond[y] = mas[i - 1];
				y = y + 1;
			}
		}

		return masSecond;

	}

	public static int[] addFiveNumber(int[] mas) {
		System.out.println("Add 5th element");
		int addEl = (int) (Math.random() * 10);
		int[] masThird = new int[mas.length + 1];
		int offset = 0;
		for (int i = 0; i < mas.length + 1; i++) {
			if (i == 4) {
				offset = 1;

			}
			masThird[i] = mas[i - offset];
		}
		return masThird;
	}
}
