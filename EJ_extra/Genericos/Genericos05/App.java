public class App {
    public static void main(String[] args) {
        Pila <Integer> pilaInt = new Pila<>();
        System.out.println(pilaInt.estaVacia());
        pilaInt.push(1);
        pilaInt.push(2);
        pilaInt.push(3);
        System.out.println(pilaInt.peek());
        System.out.println(pilaInt.pop());
        System.out.println(pilaInt.estaVacia());
    }
}
