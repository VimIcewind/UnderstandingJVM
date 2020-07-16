package ch02;

/**
 * VM Args: -Xss128k
 * @author HWD
 * @date 2020/7/14 09:34
 */
public class JavaVMStackSOF1 {
    private static int stackLength = 0;

    public static void test() {
        long unused1, unused2, unused3, unusede4, unused5,
            unused6, unused7, unused8, unusede9, unused10,
            unused11, unused12, unused13, unusede14, unused15,
            unused16, unused17, unused18, unusede19, unused20,
            unused21, unused22, unused23, unusede24, unused25,
            unused26, unused27, unused28, unusede29, unused30,
            unused31, unused32, unused33, unusede34, unused35,
            unused36, unused37, unused38, unusede39, unused40,
            unused41, unused42, unused43, unusede44, unused45,
            unused46, unused47, unused48, unusede49, unused50,
            unused51, unused52, unused53, unusede54, unused55,
            unused56, unused57, unused58, unusede59, unused60,
            unused61, unused62, unused63, unusede64, unused65,
            unused66, unused67, unused68, unusede69, unused70,
            unused71, unused72, unused73, unusede74, unused75,
            unused76, unused77, unused78, unusede79, unused80,
            unused81, unused82, unused83, unusede84, unused85,
            unused86, unused87, unused88, unusede89, unused90,
            unused91, unused92, unused93, unusede94, unused95,
            unused96, unused97, unused98, unusede99, unused100;

        stackLength++;
        test();

        unused1 = unused2 = unused3 = unusede4 = unused5 =
        unused6 = unused7 = unused8 = unusede9 = unused10 =
        unused11 = unused12 = unused13 = unusede14 = unused15 =
        unused16 = unused17 = unused18 = unusede19 = unused20 =
        unused21 = unused22 = unused23 = unusede24 = unused25 =
        unused26 = unused27 = unused28 = unusede29 = unused30 =
        unused31 = unused32 = unused33 = unusede34 = unused35 =
        unused36 = unused37 = unused38 = unusede39 = unused40 =
        unused41 = unused42 = unused43 = unusede44 = unused45 =
        unused46 = unused47 = unused48 = unusede49 = unused50 =
        unused51 = unused52 = unused53 = unusede54 = unused55 =
        unused56 = unused57 = unused58 = unusede59 = unused60 =
        unused61 = unused62 = unused63 = unusede64 = unused65 =
        unused66 = unused67 = unused68 = unusede69 = unused70 =
        unused71 = unused72 = unused73 = unusede74 = unused75 =
        unused76 = unused77 = unused78 = unusede79 = unused80 =
        unused81 = unused82 = unused83 = unusede84 = unused85 =
        unused86 = unused87 = unused88 = unusede89 = unused90 =
        unused91 = unused92 = unused93 = unusede94 = unused95 =
        unused96 = unused97 = unused98 = unusede99 = unused100 = 0;
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF1 oom = new JavaVMStackSOF1();
        try {
            test();
        } catch (Throwable e) {
            System.out.println("stack length: " + stackLength);
            throw e;
        }
    }
}
