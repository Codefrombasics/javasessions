public class Arraydemo {
    public static void main(String[] args) {
//         int marks[]=new int[6];
// marks[0]=65;
// marks[1]=87;
// marks[2]=98;
// marks[3]=86;
// marks[4] will be filled with default value of int(that is 0)
// marks[5] will be filled with default value of int(that is 0)
// System.out.println(marks);
// for (int mark : marks) {
//     System.out.println(mark);
// }

// String myfriends=new String[5];
String myfriend[]=new String[8];
for (String friend : myfriend) {
    System.out.println(friend);
}


int marks[][]={{65,87,96,55,63,72},{64,81,92,53,73,82},{75,97,96,58,63,52}};
String studentsName[]={"Harikumaar","Jagan","Moorthy"};

for (int i = 0; i < marks.length; i++) {
    System.out.print(studentsName[i]+'-');
    for (int j = 0; j < marks[i].length; j++) {
        System.out.print(marks[i][j]+" ");
    }
    System.out.println();

}

    }
}
