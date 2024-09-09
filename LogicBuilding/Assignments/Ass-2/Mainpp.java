 class Mainpp {
    public static void main(String[] args) {
        int sub1 = 50; // predefined marks for subject 1
        int sub2 = 30; // predefined marks for subject 2
        int sub3 = 40; // predefined marks for subject 3

        switch (sub1 > 40) {
            case true:
                switch (sub2 > 40) {
                    case true:
                        switch (sub3 > 40) {
                            case true:
                                System.out.println("Pass");
                                break;
                            case false:
                                System.out.println("Fail in 1 subject");
                                break;
                        }
                        break;
                    case false:
                        switch (sub3 > 40) {
                            case true:
                                System.out.println("Fail in 1 subject");
                                break;
                            case false:
                                System.out.println("Fail in 2 subjects");
                                break;
                        }
                        break;
                }
                break;
            case false:
                switch (sub2 > 40) {
                    case true:
                        switch (sub3 > 40) {
                            case true:
                                System.out.println("Fail in 1 subject");
                                break;
                            case false:
                                System.out.println("Fail in 2 subjects");
                                break;
                        }
                        break;
                    case false:
                        switch (sub3 > 40) {
                            case true:
                                System.out.println("Fail in 2 subjects");
                                break;
                            case false:
                                System.out.println("Fail in 3 subjects");
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
