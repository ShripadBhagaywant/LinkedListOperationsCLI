import java.util.Scanner;
class Node
{
	public int data;
	
	public Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class Operation
{
	Node head = null;
	
	//Insert at Beginning.
	public  void insertAtBeginning(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;	
	}
	
	//Insert at last
	public  void insertAtLast(int data)
	{
		//Newnode create to insert the node in linkedlist.
		Node newNode = new Node(data);

		//Check the head is null.
		if(head==null)
		{
			head = newNode;
			return;
		}
		
		//Import step
		Node temp = head;
		
		//Travers temp head into the last.
		while(temp.next!=null)
		{
			temp = temp.next ;
		}
		
		//add newnode into temp next.
		temp.next = newNode;
	}
	
	//Insert at Specific postion.
	
	public  void insertAtSpecificPostion(int data , int position)
	{
		//Newnode create to insert the node in linkedlist.
		Node newNode = new Node(data);

		//Check postion are less the zero.
		if(position<0)
		{
			System.out.println("Invalid Postion");
			return;
		}
		
		//insert at frist postion.
		if(position==0)
		{
			newNode.next = head;
			head = newNode;
			return;
		}
		
		//for traversal get temp.
		Node temp = head;
		//calculate index here.
		int index = 0;
		
		while(temp.next!=null)
		{
			temp = temp.next;
			index++;
			if(index==position-1)
			{
				break;
			}
		}
		
		//check head is null.
		if(temp == null)
		{
			System.out.println("Position out of bound");
			return;
		}
		
		//Insert
		newNode.next = temp.next;
		temp.next=newNode;
	}
	public void printData()
	{
		//Import step
		Node temp = head;
		if(temp==null)
			{
				System.out.println("Linked list is empty.");
			}
		
		//Travers temp head into the last.
		while(temp!=null)
		{
			if(temp.next==null)
			{
				System.out.print(temp.data);
			}
			else
			{
				System.out.print(temp.data + "=>");
			}
			temp = temp.next;
		}
	}
	
	public void deleteFrist()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		head = head.next;
	}
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		
		while(temp.next.next!=null)
		{
			temp = temp.next;
		}
		temp.next = null;
	}
	public void deleteSpecificPostion(int Position)
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		if(Position==0)
		{
			head = head.next;
			return;
		}
		Node temp = head;
		
		for(int i=0;i<Position-1 && temp!=null;i++)
		{
			temp = temp.next;
		}
		if(temp == null || temp.next == null)
		{
			System.out.println("Position out of bound");
			return;
		}
		temp.next = temp.next.next;
	}
	public boolean searchData(int data)
	{
		Node temp = head;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return true;
			}
				temp = temp.next;
		}
		return false;
	}
	public static void printMenu()
	{
		System.out.println("*_*_*_*_* MENU *_*_*_*_*");
		System.out.println();
		System.out.println("Enter 1 To Insert");
		System.out.println();
		System.out.println("Enter 2 To Delete");
		System.out.println();
		System.out.println("Enter 3 To Search");
		System.out.println();
		System.out.println("Enter 4 To Display");
		System.out.println();
		System.out.println("Enter 5 To Exit");
		System.out.println();
		System.out.print("Enter your choice : ");
	}
	public static void printInsertMenu()
	{
		System.out.println("*_*_*_*_* INSERT MENU *_*_*_*_*_*_*_*_*_*_*_");
		System.out.println();
		System.out.println("Press 1 to insert at Head ");
		System.out.println();
		System.out.println("Press 2 to insert at Tail ");
		System.out.println();
		System.out.println("Press 3 to insert from Specific postion ");
		System.out.println();
		System.out.println("Press 4 to Exit  ");
		System.out.println();
	}
	public static void printDeleteMenu()
	{
		System.out.println("*_*_*_*_* DELETE MENU *_*_*_*_*_*_*_*_*_*");
		System.out.println();
		System.out.println("Press 1 to delete at Head ");
		System.out.println();
		System.out.println("Press 2 to delete at Tail ");
		System.out.println();
		System.out.println("Press 3 to delete from specific postion ");
		System.out.println();
		System.out.println("Press 4 to Exit  ");
		System.out.println();
	}
	public static void main(String args[])
	{
		Operation li = new Operation();
		System.out.println();
		System.out.println("*_*_*_*_*_*_* Welcome to LinkedList App *_*_*_*_*_*_*_*_*_*");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try{
					printMenu();
					//read the choice.
					int ch = sc.nextInt();
					if(ch == 1)
					{
						//Insert op
						insertFromLinkedlist(li);
					}
					else if(ch==2)
					{
						//Delete op
						deleteFromLinkedlist(li);
					}
					else if(ch==3)
					{
						//Search op
						System.out.println("Enter the data you want to search ");
						int data = sc.nextInt();
						boolean res = li.searchData(data);
						if(res)
						{
							System.out.println("Yes, data is present in list");
						}
						else
						{
							System.out.println("No, data is not present in list");
						}
					}
					else if(ch==4)
					{
						System.out.println();
						li.printData();
						System.out.println();

					}
					else if(ch==5)
					{
						//Exit op
						System.out.println("Thank you Buddy!!!");
						System.exit(0);
					}
					else
					{
						System.out.println("Invalid choice");
					}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	private static void deleteFromLinkedlist(Operation li)
	{
		printDeleteMenu();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the delete choice : ");
		System.out.println();
		int deleteChoice = sc.nextInt();
		if(deleteChoice == 1)
		{
			li.deleteFrist();
			System.out.println("Deleted !!!");
		}
		else if(deleteChoice == 2)
		{
			li.deleteLast();
			System.out.println("Deleted !!!");
		}
		else if(deleteChoice == 3)
		{
			System.out.print("Enter the postion : ");
			int position = sc.nextInt();
			li.deleteSpecificPostion(position);
			System.out.println("Deleted !!!");
		}
		else if(deleteChoice == 4)
		{
			return;
		}
		else
		{
			System.out.println("Invalid choice !!");
		}
	}
	
	private static void insertFromLinkedlist(Operation li)
	{
		printInsertMenu();
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the insert choice : ");
		System.out.println();

		int insertChoice = sc.nextInt();
		if(insertChoice == 1)
		{
			System.out.print("Enter the data : ");
			int data = sc.nextInt();
			li.insertAtBeginning(data);
			System.out.println("Inserted !!!");
		}
		else if(insertChoice == 2)
		{
			System.out.print("Enter the data : ");
			int data = sc.nextInt();
			li.insertAtLast(data);
			System.out.println("Inserted !!!");
		}
		else if(insertChoice == 3)
		{
			System.out.print("Enter the postion : ");
			int position = sc.nextInt();
			System.out.print("Enter the data : ");
			int data = sc.nextInt();
			li.insertAtSpecificPostion(data,position);
			System.out.println("Inserted !!!");
		}
		else if(insertChoice == 4)
		{
			return;
		}
		else
		{
			System.out.println("Invalid choice !!");
		}
	}
}