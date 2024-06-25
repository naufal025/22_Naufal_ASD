public class CustomLinkedList22 {
   Node22 head;

    public void add(Mahasiswa22 data) {
       Node22 newNode = new Node22(data);
        if (head == null) {
            head = newNode;
        } else {
           Node22 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(String nim) {
        if (head == null) return;
        if (head.data.nim.equals(nim)) {
            head = head.next;
            return;
        }
       Node22 current = head;
        while (current.next != null && !current.next.data.nim.equals(nim)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public Mahasiswa22 search(String nim) {
       Node22 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void sort() {
        if (head == null || head.next == null) return;
       Node22 current = head;
        boolean sorted;
        do {
            sorted = true;
            current = head;
            while (current.next != null) {
                if (current.data.nim.compareTo(current.next.data.nim) > 0) {
                    Mahasiswa22 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    sorted = false;
                }
                current = current.next;
            }
        } while (!sorted);
    }

    public void printAll() {
       Node22 current = head;
        System.out.println("+------+----------------+--------------+");
        System.out.println("| NIM  | Nama           | Tgl Lahir    |");
        System.out.println("+------+----------------+--------------+");
        while (current != null) {
            System.out.format("| %-4s | %-14s | %-12s |%n", current.data.nim, current.data.nama, current.data.tglLahir);
            current = current.next;
        }
        System.out.println("+------+----------------+--------------+");
    }
}
