import java.util.*;
class GroupingStudent{
	public static void main(String[] args){
		int noOfStudent,startRollNo,noOfGroups;
		int j=0;
		Scanner sc = new Scanner(System.in);
		// ArrayList arrayList = new ArrayList();
		System.out.println("Enter the number of students");
		noOfStudent = sc.nextInt();
		System.out.println("Enter starting Number");
		startRollNo = sc.nextInt();
		System.out.println("Enter the no of groups");
		noOfGroups = sc.nextInt();
		for(int i=1;i<= noOfGroups;i++){
			System.out.println("Group"+i);
			for(j=0;j<=(noOfStudent/noOfGroups)-1;j++){				
				System.out.println(startRollNo + j*noOfGroups);
			}
			if(noOfStudent%noOfGroups >= i && noOfStudent%noOfGroups != 0){
				System.out.println(startRollNo + j*noOfGroups);
			}
			startRollNo = startRollNo + 1;
		}
	}
}