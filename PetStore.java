public class PetStore {
    public static void main(String[] args) {
        System.out.println("Welcome to Suris Pet Store");
        System.out.println("1. Default Parrot");
        Parrot p1 = new Parrot();
        p1.getPetDetails();
        p1.getBirdDetails();
        p1.getParrotDetails();
        System.out.println("****************************");
        System.out.println("2. Meenu Parrot");
        Parrot p2 = new Parrot("Meenu", "Blue");
        p2.getPetDetails();
        p2.getBirdDetails();
        p2.getParrotDetails();
        System.out.println("****************************");
        System.out.println("3. Default Peacock");
        Peacock pc1 = new Peacock();
        pc1.getPetDetails();
        pc1.getBirdDetails();
        pc1.getPeacockDetails();
        System.out.println("****************************");
        System.out.println("4. Nemalini Peacock");
        Peacock pc2 = new Peacock("Nemalini", "Rainbow", "India");
        pc2.getPetDetails();
        pc2.getBirdDetails();
        pc2.getPeacockDetails();
    }
}
