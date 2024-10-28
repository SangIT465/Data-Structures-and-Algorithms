public class Test {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.addFirst("Nguyen Van A");
        l1.addFirst("CTDL va GT JAVA");
        l1.addFirst("Vsang");
        // l1.traverse();
        
        // input: vì addFirst( thêm vào đâu)
        // 1: Vsang
        // 2: CTDL va GT JAVA
        // 3: Nguyen Van A
        //---------------------------------------
        l1.addLast("Viet Nam");
        // l1.traverse();

        l1.insertAfter("Vsang", ".vn");
        l1.traverse();

        System.out.println(l1.remove(".VN"));
        System.out.println(l1.remove(".vn"));
        System.out.println("-----------------");
        // l1.traverse();

        System.out.println("Check empty: " + l1.idEmpty());
        System.out.println("Size: " + l1.size());
    }
}
