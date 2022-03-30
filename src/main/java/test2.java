import java.util.Scanner;

public class test2 {
    // 자리바꾸기 , 조원 바꾸기 시뮬레이터

    public static void main(String[] args) {


        int Random;
        int personnel = 5;
        int zoe = 6;
        Humen[][] num = new Humen[zoe][personnel];
        Humen[] picked;
        picked = new Humen[6];
        Humen[] humen = new Humen[50];
        humen[0] = new Humen("허지혜", 1, false, false);
        humen[1] = new Humen("주혜경", 1, false, false);
        humen[2] = new Humen("김연", 1, false, false);
        humen[3] = new Humen("김예진", 1, false, true);

        humen[4] = new Humen("김다운", 1, false, false);
        humen[5] = new Humen("김지태", 2, false, false);
        humen[6] = new Humen("김규린", 2, false, false);
        humen[7] = new Humen("최여진", 2, false, false);
        humen[8] = new Humen("이호준", 2, false, true);

        humen[9] = new Humen("이정훈", 2, false, false);
        humen[10] = new Humen("고동준", 3, false, false);
        humen[11] = new Humen("김도원", 3, false, false);
        humen[12] = new Humen("윤서준", 3, false, false);
        humen[13] = new Humen("양주홍", 3, false, true);
        humen[14] = new Humen("박선우", 3, false, false);
        humen[15] = new Humen("양준서", 4, false, false);
        humen[16] = new Humen("최상호", 4, false, false);
        humen[17] = new Humen("박수호", 4, false, false);
        humen[18] = new Humen("김성택", 4, false, false);
        humen[19] = new Humen("김성현", 4, false, true);
        humen[20] = new Humen("강석현", 5, false, false);
        humen[21] = new Humen("권오근", 5, false, false);
        humen[22] = new Humen("박우정", 5, false, false);
        humen[23] = new Humen("김원집", 5, false, true);
        humen[24] = new Humen("NULL", 5, false, true);
        humen[25] = new Humen("홍세민", 6, false, true);
        humen[26] = new Humen("하재형", 6, false, false);
        humen[27] = new Humen("신경석", 6, false, false);
        humen[28] = new Humen("임현석", 6, false, false);
        humen[29] = new Humen("최윤성", 6, false, false);
        int count[] = {0, 0, 0, 0, 0, 0};


        for (int i = 0; i < humen.length; i++) {

            if (humen[i] == null) {
                break;
            }
            switch (humen[i].company) {
                case 1:
                    num[0][count[0]] = new Humen(humen[i].name, humen[i].company, humen[i].used, humen[i].lastweek);

                    count[0]++;
                    if (count[0] >= num[0].length) {
                        break;
                    }
                    break;
                case 2:
                    num[1][count[1]] = new Humen(humen[i].name, humen[i].company, humen[i].used, humen[i].lastweek);
                    count[1]++;
                    if (count[1] >= num[1].length) {
                        break;
                    }
                    break;
                case 3:
                    num[2][count[2]] = new Humen(humen[i].name, humen[i].company, humen[i].used, humen[i].lastweek);
                    count[2]++;
                    if (count[2] >= num[2].length) {
                        break;
                    }
                    break;
                case 4:
                    num[3][count[3]] = new Humen(humen[i].name, humen[i].company, humen[i].used, humen[i].lastweek);
                    count[3]++;
                    if (count[3] >= num[3].length) {
                        break;
                    }
                    break;
                case 5:
                    num[4][count[4]] = new Humen(humen[i].name, humen[i].company, humen[i].used, humen[i].lastweek);
                    count[4]++;
                    if (count[4] >= num[4].length) {
                        break;
                    }
                    break;
                case 6:
                    num[5][count[5]] = new Humen(humen[i].name, humen[i].company, humen[i].used, humen[i].lastweek);
                    count[5]++;
                    if (count[5] >= num[5].length) {
                        break;
                    }
                    break;
                default:
                    break;
            }


        }

        for (int i = 0; i < picked.length; i++) {
            Random = (int) (Math.random() * 5);

            while (num[i][Random].lastweek) {

                Random = (int) (Math.random() * 5);

            }


            num[i][Random].used = true;
            picked[i] = num[i][Random];
        }
        Humen[] b = new Humen[zoe];
        for (int i = 0; i < b.length; i++) {
            b[i] = picked[i];
        }
        for (int i = 0; i < picked.length; i++) {
            System.out.println("바뀐 사람은 : " + picked[i].name);
        }
        while ((b[0].name == picked[0].name) || (b[1].name == picked[1].name) || (b[2].name == picked[2].name) ||
                (b[3].name == picked[3].name) || (b[4].name == picked[4].name) || (b[5].name == picked[5].name)) {
            for (int i = 0; i < picked.length; i++) {
                Random = (int) (Math.random() * 5);

                Humen a;

                a = picked[i];
                picked[i] = picked[Random];
                picked[Random] = a;

            }
        }
        int count3 = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (num[i][j].used == true) {
                    num[i][j] = picked[count3];
                    count3++;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%s \t", num[i][j].name);
            }
            System.out.printf("\n");
        }

    }
}

