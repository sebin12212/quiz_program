import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quiz[] quizzes = {
            new Quiz("리눅스에서 파일 목록을 출력하는 명령어는?", "ls"),
            new Quiz("현재 디렉토리 경로를 출력하는 명령어는?", "pwd"),
            new Quiz("디렉토리를 생성하는 명령어는?", "mkdir"),
            new Quiz("파일 내용을 출력하는 명령어는?", "cat"),
            new Quiz("Git에서 변경사항을 저장(커밋)하는 명령어는? (git 이후 단어만)", "commit"),
            new Quiz("Git에서 원격 저장소에 업로드하는 명령어는? (git 이후 단어만)", "push"),
            new Quiz("집합 A={1,2,3}, B={2,3,4} 일 때 A교B의 원소 개수는?", "2"),
            new Quiz("그래프에서 정점과 정점을 연결하는 선을 무엇이라 하는가?", "간선")
        };

        int score = 0;
        System.out.println("=============================");
        System.out.println("    Linux & 이산수학 퀴즈    ");
        System.out.println("=============================\n");

        for (int i = 0; i < quizzes.length; i++) {
            System.out.println("Q" + (i + 1) + ". " + quizzes[i].getQuestion());
            System.out.print("정답 입력 : ");
            String answer = sc.nextLine().trim();

            if (answer.equals(quizzes[i].getAnswer())) {
                System.out.println("✅ 정답입니다!\n");
                score++;
            } else {
                System.out.println("❌ 오답입니다! 정답은 [ " + quizzes[i].getAnswer() + " ] 입니다.\n");
            }
        }

        System.out.println("=============================");
        System.out.println("최종 점수 : " + score + " / " + quizzes.length);
        System.out.println("=============================");
        sc.close();
    }
}
