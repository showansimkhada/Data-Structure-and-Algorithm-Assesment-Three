package assignment3;

public class Assignment3 
{
	
	public static void main(String[] args) 
	{
		Tree bst1 = ReadFile.readFile("C:\\Users\\Admin\\Desktop\\file1.txt");
		Tree bst2 = ReadFile.readFile("C:\\Users\\Admin\\Desktop\\file2.txt");
		Tree bst3 = ReadFile.readFile("C:\\Users\\Admin\\Desktop\\file3.txt");
		System.out.println("The size of binary search tree 1 is " + bst1.size(bst1.root));
		System.out.println("The size of binary search tree 2 is " + bst2.size(bst2.root));
		System.out.println("The size of binary search tree 3 is " + bst3.size(bst3.root));
		System.out.print("The number in binary search tree 1 in increasing order are: \n");
		bst1.printIncOrder(bst1.root);
		System.out.print("\nThe number in binary search tree 2 in increasing order are: \n");
		bst2.printIncOrder(bst2.root);
		System.out.print("\nThe number in binary search tree 3 in increasing order are: \n");
		bst3.printIncOrder(bst3.root);
		System.out.print("\nThe height of binary search tree 1 is " + bst1.getHeight());
		System.out.print("\nThe height of binary search tree 2 is " + bst2.getHeight());
		System.out.print("\nThe height of binary search tree 3 is " + bst3.getHeight());
		System.out.println("\nThe numbers of binary search tree 1 in level by level is as follows: ");
		bst1.levelByLevel(bst1.root);
		System.out.println("\nThe numbers of binary search tree 2 in level by level is as follows: ");
		bst2.levelByLevel(bst2.root);
		System.out.println("\nThe numbers of binary search tree 3 in level by level is as follows: ");
		bst3.levelByLevel(bst3.root);
		System.out.print("\nThe number of prime numbers in binary search tree 1 is: " + bst1.primeNum(bst1.root));
		System.out.print("\nThe number of prime numbers in binary search tree 2 is: " + bst2.primeNum(bst2.root));
		System.out.print("\nThe number of prime numbers in binary search tree 3 is: " + bst3.primeNum(bst3.root));
	}

}
