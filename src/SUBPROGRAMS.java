import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorts s=new Sorts();
		Random rnd=new Random();
		int[] list=new int[10];
		int[] bubble=new int[10];
		int[] selection=new int[10];
		int[] insertion=new int[10];
		for (int i=0;i<list.length;i++) {
			list[i]=bubble[i]=selection[i]=insertion[i]=rnd.nextInt(10)+1;
		}
		System.out.println("Starting list: ");
		for (int i:list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		bubble=s.BubbleSort(bubble);
		selection = s.SelectionSort(selection);
		insertion = s.InsertionSort(insertion);
		
		System.out.println("\n\nBubble Sort: ");
		for (int i:bubble) {
			System.out.print(i+" ");
		}
		System.out.println("\n\nSelection Sort: ");
		for (int i:selection) {
			System.out.print(i+" ");
		}
		System.out.println("\n\nInsertion Sort: ");
		for (int i:insertion) {
			System.out.print(i+" ");
		}
	}

}
