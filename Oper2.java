/* NIM 		: 13020210170		*/
/* NAMA		: ANDI CHUSNUL IDZAH	*/
/* HARI/TANGGAL	: KAMIS, 09/03/2023 	*/

/*	pemakaian beberapa operator terhadap RELATIONAL DAN bit */
public class Oper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* KAMUS */
		char i, j;

	/* ALGORITMA */
		i = 3;		/* 00000011 dalam biner */
		j = 4; 		/* 00000100 dalam biner */
	
		System.out.println("i = "+ (int) i);
		System.out.println("j = "+ j);
		System.out.println("i & j = "+ (i & j));
		/* 0 : 00000000 dalam biner */

		System.out.println("i | j = "+ (i | j));
		/* 7: 00000111 biner */

		System.out.println("i ^ j = "+ (i ^ j));
		
		System.out.println(Math.pow(i, j));

		System.out.println(" ~i = "+ ~i);

	}

}
		