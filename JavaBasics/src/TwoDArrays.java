import java.util.Scanner;

public class TwoDArrays {
	public static void main(String[] args) {
		/*the one dimentional arrays have one row and columns 
		 * But when we talk about two dimentional arrays we think of arrays having multiple surfaces. 
		 * 
		 */
		
		//creating 2D array:
		//int [][] d=new int [4][4];//4*4=16 so 16 elements
		//int [][] d=new int [3][4] 3*4=16 so 12 elements
		
		//1st row
//		d[0][0]=12;
//		d[0][1]=13;
//		d[0][2]=14;
//		d[0][3]=15;
//		
//		//2nd row
//		d[1][0]=1;
//		d[1][1]=2;
//		d[1][2]=3;
//		d[1][3]=4;
//		
//		//3rd row
//		d[2][0]=5;
//		d[2][1]=10;
//		d[2][2]=15;
//		d[2][3]=20;
//		
//		//4th row
//		d[3][0]=100;
//		d[3][1]=200;
//		d[3][2]=300;
//		d[3][3]=400;
//		
//		
//		System.out.println(d[2][1]);
//		System.out.println(d[3][0]);
//		System.out.println(d[0][2]);
//		
//		int [][]c= {
//				{12,13,14,15},
//				{1,2,3,4},
//				{5,10,15,20},
//				{100,200,300,400},
//				};
//		
		
	//create a 2D array where you will store the following values: Mr, Mrs, Ms, miss and smith, jordan, jackson, obama. 
	//after stroing values pring the folowing: mrs smtih, mr obama, ms jackson.
		
//		String [][] names= {
//				{"Mr.","Mrs,","Ms","miss"},
//				{"Smith","Jordan","Jackson","Obama"},
//				
//		};
//		
//		System.out.println(names[0][3]+" "+names[1][1]);
//		System.out.println(names[0][1]+" "+names[1][0]);
//		System.out.println(names[0][0]+" "+names[1][3]);
//		System.out.println(names[0][3]+" "+names[1][2]);
		
		
		
//		String [][]students= {
//				{"ozkan","cemal","tarik","samil"},
//				{"A","B","c","d"},
//		};
//				
//		System.out.println(students[0][0]+"'s grade is "+students[1][0]);
//		System.out.println(students[0][1]+"'s grade is "+students[1][1]);
//		System.out.println(students[0][2]+"'s grade is "+students[1][2]);	
//		System.out.println(students[0][3]+"'s grade is "+students[1][3]);
	
		
		
		
		
		
//		String [][]food= {
//				{"burger","fries","hot dog","meatloaf"},
//				{" lo mein","fried rice"},
//				{"biriyani","Korma","naan","chick peas"}
//		};
//	
//		for (int i=0; i<food.length;i++) {
//			for (int j=0;j<food[i].length;j++) {
//				System.out.print("I love "+food[i][j]+". ");
//			
//			}System.out.println();
//		}
//		
//		
		
//		String [] countryNames= {"America","Germany","Japan","Italy"};
//		
//		String [][]food= {
//				{"ford","chevy","jeep","crysler","dodge"},
//				{"Audi","bmw","Saab","mercedes","Volsqagen"},
//				{"hondai","kia"},
//				{"fiat","ferrari","alfe romero","mazarati"}
//		
//		};
//		
//		for (int i=0;i<food.length;i++) {
//			
//			System.out.println("This is a list of cars made in "+countryNames[i]+" :");
//			for (int j=0;j<food[i].length;j++) {
//				
//				
//				System.out.print(food[i][j]+". \n ");
//			}
//			System.out.println();
//			
//			}
//		}
		
		
	
//		String [][]cars= {
//				{"ford","chevy","jeep","crysler","dodge"},
//				{"Audi","bmw","Saab","mercedes","Volsqagen"},
//				{"hondai","kia"},
//				{"fiat","ferrari","alfe romero","mazarati"}
//		
//		};
//		String country="";
//		for (int i=0;i<cars.length;i++) {
//			switch(i) {
//			case 0:
//				country="USA";
//				break;
//			case 1:
//				country="Germany";
//				break;
//			case 2:
//				country="japan";
//				break;
//			case 3:
//				country="Italy";
//				 break;
//			}System.out.println(country);
//			System.out.println(cars[i]);
//		}
		
		/*Note: Create a Scanner Class
 Create an int array with the size of 5 and input values with Scanner. 
 Print out each element of the array multiplied by ten, one element per line.
 Create a loop and enter values into one loop, the second loop print the values and it must be multiplied by 10.
 */ 
//		
//		Scanner scan=new Scanner(System.in);
//		
//	   
//	    int [] array=new int [5];
//	    System.out.println("Input  ");
//	   
//	     for (int i=0;i<array.length;i++) {
//	    	 
//	    	 array[i]=scan.nextInt();
//	     }
//	     for (int j=0;j<array.length;j++) {
//	    	
//	    	 System.out.println(array[j]*10);
//	     }
//		
		
//		
//		Scanner scan=new Scanner (System.in);
//		int array[]=new int [5];
//		//System.out.println("Input");
//		for (int i=0;i<array.length;i++){
//		  
//		  array[i]=scan.nextInt();
//		}
//		for (int i=array.length-1;i>=0;i--){
//		  System.out.println(array[i]);
//		}
		
//		double[][] a = {
//				{1.4,2.0,3.3,2},
//				{4,1.5,6.1,1},
//				{1.2,3.1,4,1.6}
//			};
//			
//			//Double and print array
//		
//		for (int i=0;i<a.length;i++){
//			
//		}
//		//  System.out.println(a[i][i]*2);
//		  
//		double total=0;
//		
//		for (double []x:a) {
//			
//			for (double j:x) {
//				x[(int)j]=1;
//				total= x[(int)j]*2;
//			}
//			System.out.println(total);
//		}
		
		
//        // let's create board of 4x4
//        int[][] board = new int[4][4];
//
//        // let's loop through array to populate board
//        for (int row = 0; row < board.length; row++) {
//            for (int col = 0; col < board[row].length; col++) {
//                board[row][col] = row * col;
//            }
//        }
//
//        // let's loop through array to print each row and column
//        for (int row = 0; row < board.length; row++) {
//            for (int col = 0; col < board[row].length; col++) {
//                board[row][col] = row * col;
//                System.out.print(board[row][col] + "\t");
//            }
//            System.out.println();
//        }
   
		
		
		
		
		
		/*Create a grocery list: fruits{}
        *                         veggies{}
        *                         dairy{}
        * Retrive all values using 2 different loops
        * 
        */
//		String []content= {"Fruites","Vegetables","Dairy"};
//		String grocery[][]= {
//				{"apples","oranges","mandarene","strawberry" },
//				{"Tomatoes","cucumbers","lettuce","iceburge lettuce"},
//				{"milk","cheese","other stuff","more stuff"}
//		};
		
//		for (int i=0;i<grocery.length;i++) {
//			System.out.println("<<---------"+content[i]+"------------>>>");
//			for (int j=0;j<grocery[i].length;j++ ) {
//				System.out.print(grocery[i][j]+ "\n ");
//			}System.out.println();
//		}
//	
//	for (int i=0;i<0;i++) {
//		System.out.println(content[i]);
//	}
//		for (String []x:grocery) {
//			for (String j:x) {
//				System.out.print(j+" ");
//			}System.out.println();
//		}
	
	
	}

	
	}
	//9 943 1 73 13
	
	
	
	

