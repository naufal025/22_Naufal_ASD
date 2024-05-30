public class ScavengerHunt22 {
   Pointer22 head;

    public ScavengerHunt22() {
        this.head = null;
    }

    public void addPoint(String question, String answer) {
       Pointer22 newPoint = new Pointer22(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
           Pointer22 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }

    public void displayPoints() {
       Pointer22 current = head;
        int index = 1;
        while (current != null) {
            System.out.println("Point " + index + ": " + current.pertanyaan);
            current = current.next;
            index++;
        }
    }

    public boolean checkAnswer(String userAnswer) {
        if (head != null) {
            if (head.jawaban.equals(userAnswer)) {
                head = head.next;
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
