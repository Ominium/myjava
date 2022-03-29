import java.util.Scanner;

public class test2 {


    public static void main(String[] args) {


        int Random;
        Humen[][] num = new Humen[6][5];
        Humen[] picked;
        picked = new Humen[6];
        Humen[] humen = new Humen[30];
        humen[0] = new Humen("허지혜", 1, false);
        humen[1] = new Humen("주혜경", 1, false);
        humen[2] = new Humen("김연", 1, false);
        humen[3] = new Humen("김원집", 1, false);
        humen[4] = new Humen("김다운", 1, false);
        humen[5] = new Humen("김지태", 2, false);
        humen[6] = new Humen("김규린", 2, false);
        humen[7] = new Humen("최여진", 2, false);
        humen[8] = new Humen("김성현", 2, false);
        humen[9] = new Humen("이정훈", 2, false);
        humen[10] = new Humen("고동준", 3, false);
        humen[11] = new Humen("김도원", 3, false);
        humen[12] = new Humen("윤서준", 3, false);
        humen[13] = new Humen("홍세민", 3, false);
        humen[14] = new Humen("박선우", 3, false);
        humen[15] = new Humen("양준서", 4, false);
        humen[16] = new Humen("최상호", 4, false);
        humen[17] = new Humen("박수호", 4, false);
        humen[18] = new Humen("양주홍", 4, false);
        humen[19] = new Humen("김성택", 4, false);
        humen[20] = new Humen("강석현", 5, false);
        humen[21] = new Humen("권오근", 5, false);
        humen[22] = new Humen("박우정", 5, false);
        humen[23] = new Humen("이호준", 5, false);
        humen[24] = new Humen("NULL", 5, false);
        humen[25] = new Humen("김예진", 6, false);
        humen[26] = new Humen("하재형", 6, false);
        humen[27] = new Humen("신경석", 6, false);
        humen[28] = new Humen("임현석", 6, false);
        humen[29] = new Humen("최윤성", 6, false);
        int count = 0;
        int count2 = 1;


        for (int i = 0; i < humen.length; i++) {


            if (humen[i].company == count2) {
                num[count2 - 1][count] = new Humen(humen[i].name,humen[i].company,humen[i].used) ;

                count++;
                if (count == 5) {
                    count =0;
                    count2++;
                }
            }

        }
        for (int i = 0; i < picked.length; i++) {
            Random = (int) (Math.random() * 5);

            while (num[i][Random].name == "NULL"&&!num[i][Random].used) {
                Random = (int) (Math.random() * 5);
            }


                num[i][Random].used = true;
                picked[i] = num[i][Random];
        }
        Humen[] b =new Humen[6];
        for (int i= 0; i<b.length;i++){
            b[i] = picked[i];
        }
        for(int i=0 ;i<picked.length;i++){
            System.out.println("바뀐 사람은 : "+picked[i].name);
        }
        while((b[0].name==picked[0].name)||(b[1].name==picked[1].name)||(b[2].name==picked[2].name)||
                (b[3].name==picked[3].name)||(b[4].name==picked[4].name)||(b[5].name==picked[5].name)){
            for(int i = 0; i<picked.length;i++){
                Random = (int) (Math.random() * 5);

                Humen a;

                a =  picked[i];
                picked[i] =  picked[Random];
                picked[Random] = a;

            }
        }
        int count3 = 0;
        for(int i= 0; i<6;i++){
            for(int j =0; j<5; j++){
                if(num[i][j].used == true){
                    num[i][j] = picked[count3];
                    count3++;
                }
            }
        }

        for(int i = 0; i<6; i++){
            for(int j = 0; j<5; j++){
                System.out.printf("%s \t",num[i][j].name);
            }
            System.out.printf("\n");
        }

    }
}

