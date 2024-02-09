public class GroveTester {
    public static void main(String[] args){
        Grove Grove1 = new Grove("Grove1");
        System.out.println(Grove1);
        Tree spruce = new Tree(37,1,"Spruce");
        for (int i = 0; i < 7; i++){
            Grove1.planter(spruce);
        }
        System.out.println(Grove1);
        Grove1.chopper(3);
        Grove1.chopper(5);
        System.out.println(Grove1);
        Tree Maple = new Tree(13,1,"Maple");
        Grove1.planter(Maple);
        System.out.println(Grove1);


    }
}
